package com.springframework.sf.dysource.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: yq
 * @date: 2019/11/26 15:46
 * @description:
 */
@Component
@Data
@ConfigurationProperties(prefix = "biz.datasource")
public class MutiDataSourceConfig {
    private String url;

    private String username;

    private String password;

    public void config(DruidDataSource dataSource) {
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
    }
}
