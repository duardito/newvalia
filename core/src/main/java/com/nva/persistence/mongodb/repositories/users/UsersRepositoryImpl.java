package com.nva.persistence.mongodb.repositories.users;

import com.nva.persistence.mongodb.entities.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * Created by edu on 14/12/2014.
 */
public class UsersRepositoryImpl implements UsersRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public User findByUser(final User user) {
        final Query query = new Query();
        query.addCriteria(Criteria.where("password").is(user.getPassword()).and("username").is(user.getUsername()));
        return mongoTemplate.findOne(query,User.class);
    }
}
