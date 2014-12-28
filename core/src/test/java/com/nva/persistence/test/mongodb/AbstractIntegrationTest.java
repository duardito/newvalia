package com.nva.persistence.test.mongodb;

import com.nva.persistence.PersistenceConfiguration;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by edu on 07/12/2014.
 */
@ActiveProfiles("mongodb")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfiguration.class })
public abstract class AbstractIntegrationTest {
}
