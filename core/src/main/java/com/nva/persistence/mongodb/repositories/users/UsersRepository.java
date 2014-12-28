package com.nva.persistence.mongodb.repositories.users;

import com.nva.persistence.mongodb.entities.users.User;
import com.nva.persistence.mongodb.repositories.MongoOperationsAbstract;

/**
 * Created by edu on 14/12/2014.
 */
public interface UsersRepository extends MongoOperationsAbstract<User, String>, UsersRepositoryCustom<User, String> {
}
