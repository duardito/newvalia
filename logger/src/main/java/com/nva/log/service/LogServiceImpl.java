package com.nva.log.service;

import com.nva.log.bean.Log;
import com.nva.log.persistence.LoggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by edu on 30/12/2014.
 */
@Service
public class LogServiceImpl implements LogServiceInterface{

    @Autowired
    private LoggerRepository loggerRepository;

    @Override
    public void saveLog(Log log) {
        loggerRepository.save(log);
    }
}
