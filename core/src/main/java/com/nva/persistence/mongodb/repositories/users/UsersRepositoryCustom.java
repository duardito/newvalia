package com.nva.persistence.mongodb.repositories.users;

import com.nva.persistence.mongodb.entities.users.User;

import java.io.Serializable;

/**
 * Created by edu on 14/12/2014.
 */
public interface UsersRepositoryCustom <M, S extends Serializable>{

    public M findByUser(User user);
}
