package com.nva.service.test;

import com.nva.service.logger.LogServiceInterface;
import com.nva.support.beans.logger.LogVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by edu on 30/12/2014.
 */
public class LogTest extends AbstractIntegrationTest{

    @Autowired
    private LogServiceInterface logServiceInterface;

    @Test
    public void saveLog(){

        final LogVO logVO = new LogVO();
        logVO.setErrorMessage("stored message correctly");
        logVO.setDate(new Date());
        logServiceInterface.saveLog(logVO);
    }
}
