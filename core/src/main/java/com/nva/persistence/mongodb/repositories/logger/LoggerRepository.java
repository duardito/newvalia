package com.nva.persistence.mongodb.repositories.logger;

import com.nva.persistence.mongodb.entities.logger.Log;
import com.nva.persistence.mongodb.repositories.MongoOperationsAbstract;

/**
 * Created by edu on 30/12/2014.
 */
public interface LoggerRepository extends MongoOperationsAbstract<Log,String> {

}
