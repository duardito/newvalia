package com.nva.service.logger;

import com.nva.persistence.mongodb.entities.logger.Log;
import com.nva.persistence.mongodb.repositories.logger.LoggerRepository;
import com.nva.support.beans.logger.LogVO;
import com.nva.support.dozer.DozerConversionInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by edu on 30/12/2014.
 */
@Service
public class LogServiceImpl implements LogServiceInterface{

    @Autowired
    private LoggerRepository loggerRepository;

    @Autowired
    private DozerConversionInterface<?> dozerConversion;

    @Override
    public void saveLog(LogVO logVO) {
        final Log log = dozerConversion.map(logVO, Log.class);
        loggerRepository.save(log);
    }
}
