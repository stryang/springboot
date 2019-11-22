package com.springframework.sf.mongodb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @author: yq
 * @date: 2019/11/22 12:47
 * @description:
 */
@Configuration
@ConfigurationProperties(prefix = "spring.data.mongodb.spring-boot")
public class SpringBootMongoConfig extends AbstractMongoConfig {

    @Override
    @Bean(name = "springbootMongoTemplate")
    public MongoTemplate getMongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }
}
