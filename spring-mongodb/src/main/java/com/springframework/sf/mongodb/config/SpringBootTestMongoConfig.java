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
@ConfigurationProperties(prefix = "spring.data.mongodb.spring-boot-test")
public class SpringBootTestMongoConfig extends AbstractMongoConfig {

    @Override
    @Bean(name = "springbootTestMongoTemplate")
    public MongoTemplate getMongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }
}
