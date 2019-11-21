package com.springframework.sf.hibernate.repository;

import com.springframework.sf.hibernate.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

/**
 * @author: yq
 * @date: 2019/11/21 11:08
 * @description:
 */
@Service
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("select u from User u where u.username=:username")
    User findUserByName(@Param("username") String username);

    User findUserById(int id);
}
