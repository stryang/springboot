package com.springframework.sf.mongodb.service;

import com.springframework.sf.mongodb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author: yq
 * @date: 2019/11/22 14:02
 * @description:多数据源不建议使用
 */
public interface UserRepository extends MongoRepository<User, String> {

}
