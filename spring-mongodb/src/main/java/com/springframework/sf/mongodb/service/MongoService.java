package com.springframework.sf.mongodb.service;

import com.springframework.sf.mongodb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

/**
 * @author: yq
 * @date: 2019/11/22 12:30
 * @description:
 */
@Service
public class MongoService {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private UserRepository userRepository;

    /**
     * 创建对象
     */
    public boolean save(User user) {

        userRepository.save(user);

//        if(mongoTemplate.save(user) != null) {
//            return true;
//        }
        return false;
    }

    /**
     * 根据用户名查询对象
     * @return
     */
    public User findById(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        User mgt = mongoTemplate.findOne(query , User.class);
        return mgt;
    }

    /**
     * 根据用户名查询对象
     * @return
     */
    public User findByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        User mgt = mongoTemplate.findOne(query , User.class);
        return mgt;
    }

    /**
     * 更新对象
     */
    public boolean update(User user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update= new Update().set("age", user.getAge()).set("name", user.getUsername());
        //更新查询返回结果集的第一条
        return mongoTemplate.updateFirst(query,update, User.class).wasAcknowledged();
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,TestEntity.class);
    }

    /**
     * 删除对象
     * @param id
     */
    public boolean deleteById(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        return mongoTemplate.remove(query, User.class).wasAcknowledged();
    }
}
