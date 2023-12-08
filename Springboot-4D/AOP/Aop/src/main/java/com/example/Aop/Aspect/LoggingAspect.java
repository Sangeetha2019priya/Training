package com.example.Aop.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.example.Aop.service.EmployeeService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before method execution: " + joinPoint.getSignature().toShortString());
    }

    @After("execution(* com.example.Aop.service.EmployeeService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After method execution: " + joinPoint.getSignature().toShortString());
    }

    @AfterThrowing(pointcut = "execution(* com.example.Aop.service.EmployeeService.*(..))", throwing = "exception")
public void logAfterThrowing(JoinPoint joinPoint, RuntimeException exception) {
    logger.error("Exception thrown in method: {}", joinPoint.getSignature().toShortString());
    logger.error("Exception details: {}", exception.getMessage());
}

    

}