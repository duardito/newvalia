package com.nva.persistence.test.mongodb;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 * Created by edu on 07/12/2014.
 */
public class dbConnectionTest extends AbstractIntegrationTest{
    @Autowired
    Environment env;

    @Test
    public void initTest(){
        System.out.println("profile " +env.getActiveProfiles()[0]);

    }
}
