package com.springframework.sf.admin.server.config;

import de.codecentric.boot.admin.server.domain.entities.Instance;
import de.codecentric.boot.admin.server.web.client.BasicAuthHttpHeaderProvider;
import de.codecentric.boot.admin.server.web.client.InstanceExchangeFilterFunction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.Base64Utils;
import org.springframework.util.StringUtils;

import java.nio.charset.StandardCharsets;

/**
 * @author: yq
 * @date: 2019/11/21 11:49
 * @description:
 */
@Configuration
@Slf4j
public class MonitorConfig {

    /**
     * springboot自动装配默认实现类，由于需要对配置密码进行解码操作，故手动装配
     * {@link AdminServerAutoConfiguration#basicAuthHttpHeadersProvider()}
     *
     * @return
     */
    @Bean
    public BasicAuthHttpHeaderProvider basicAuthHttpHeadersProvider() {
        return new BasicAuthHttpHeaderProvider() {
            @Override
            public HttpHeaders getHeaders(Instance instance) {
                HttpHeaders headers = new HttpHeaders();
                //获取用户名，密码
                String username = instance.getRegistration().getMetadata().get("user.name");
                String password = instance.getRegistration().getMetadata().get("user.password");
                String type = instance.getRegistration().getMetadata().get("user.type");

                //若是token有值，那么使用token认知
                if ("token".equalsIgnoreCase(type)) {
                    headers.set("X-Token",password);
                } else if (StringUtils.hasText(username) && StringUtils.hasText(password)) {
                    headers.set(HttpHeaders.AUTHORIZATION, encode(username, password));
                }
                return headers;
            }

            protected String encode(String username, String password) {
                String token = Base64Utils.encodeToString((username + ":" + password).getBytes(StandardCharsets.UTF_8));
                return "Basic " + token;
            }
        };
    }

    @Bean
    public InstanceExchangeFilterFunction auditLog() {
        return (instance, request, next) -> next.exchange(request).doOnSubscribe(s -> {
            if (HttpMethod.DELETE.equals(request.method()) || HttpMethod.POST.equals(request.method())) {
                log.info("{} for {} on {}", request.method(), instance.getId(), request.url());
            }
        });
    }
}
