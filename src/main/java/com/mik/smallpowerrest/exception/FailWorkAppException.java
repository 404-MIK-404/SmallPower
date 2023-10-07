package com.mik.smallpowerrest.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FailWorkAppException {

    private static final Logger logger = LoggerFactory.getLogger(FailWorkAppException.class);

    public static void catchExceptionEntityManager(FailEntityManagerException e){
        logger.error("Ошибка в работе EntityManager {}", e.getMessage());
    }

}
