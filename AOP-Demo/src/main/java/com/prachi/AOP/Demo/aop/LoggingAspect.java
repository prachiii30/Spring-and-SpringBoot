package com.prachi.AOP.Demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

//    return type,class name,method name,arguments

//    @Before("execution(* com.prachi.AOP.Demo.service.JobService.*(..))")
//    public void logMecall(){
//        LOGGER.info("Method Called");
//    }
    @Before("execution(* com.prachi.AOP.Demo.service.JobService.*(..))")
    public void logMecall(JoinPoint jp){
        LOGGER.info("Method Called "+jp.getSignature().getName()) ;
    }

//    //alwys executed irrespective of the throw
    @After("execution(* com.prachi.AOP.Demo.service.JobService.*(..))")
    public void logcrashed(JoinPoint jp){
        LOGGER.info("Method execution completed "+jp.getSignature().getName()) ;
    }
//
//    @AfterThrowing  //--> only executed when there is any exception
//    public void logcthrowsException(JoinPoint jp){
//        LOGGER.info("Method throws exception "+jp.getSignature().getName()) ;
//    }
//    @AfterReturning   --> only executed when there is no exception


}
