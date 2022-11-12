package com.example.postdemo.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {
    @Pointcut("@annotation(com.example.postdemo.AOP.annotation.ExecutionTime)")
    public void executionTime(){};


    @Around("executionTime()")
    public Object executionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.nanoTime();
        var result = proceedingJoinPoint.proceed();
        long finish = System.nanoTime();
        System.out.println(proceedingJoinPoint.getSignature().getName() +  " Time taken= " + (finish - start));
        return result;
    }
}
