package com.springframework.sf.mongodb.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import lombok.Data;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class AbstractMongoConfig {
    // 变量名跟配置的参数对应
    private String host, database, username, password;
    private int port;

    public MongoDbFactory mongoDbFactory() throws Exception {
        // 无认证的初始化方法
//        return new SimpleMongoDbFactory(new MongoClient(host, port), database);

        // 有认证的初始化方法
         ServerAddress serverAddress = new ServerAddress(host, port);
         List<MongoCredential> mongoCredentialList = new ArrayList<>();
         mongoCredentialList.add(MongoCredential.createCredential(username, database,
         password.toCharArray()));
         return new SimpleMongoDbFactory(new MongoClient(serverAddress,mongoCredentialList), database);
    }


    abstract public MongoTemplate getMongoTemplate() throws Exception;


}
