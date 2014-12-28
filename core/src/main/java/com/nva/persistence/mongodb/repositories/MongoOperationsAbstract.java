package com.nva.persistence.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Created by edu on 07/12/2014.
 */
@NoRepositoryBean
public interface MongoOperationsAbstract <M, S extends Serializable> extends MongoRepository<M, S> {

    public M findByName(final String m);
}
