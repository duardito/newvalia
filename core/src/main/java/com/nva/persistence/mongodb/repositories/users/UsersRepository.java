package com.nva.persistence.mongodb.repositories.users;

import com.nva.persistence.mongodb.entities.users.User;
import com.nva.persistence.mongodb.repositories.MongoOperationsAbstract;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by edu on 14/12/2014.
 */
@EnableMongoRepositories
@Configuration
public interface UsersRepository extends MongoOperationsAbstract<User, String>, UsersRepositoryCustom<User, String> {
}
