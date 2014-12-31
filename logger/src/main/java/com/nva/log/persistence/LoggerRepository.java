package com.nva.log.persistence;


import com.nva.log.bean.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by edu on 30/12/2014.
 */
public interface LoggerRepository extends MongoRepository<Log,String> {

}
