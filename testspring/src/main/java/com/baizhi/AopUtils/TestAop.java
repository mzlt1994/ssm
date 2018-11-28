package com.baizhi.AopUtils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class TestAop {
    @Before("execution(* com.baizhi.service.*.*(..))")
    public void before(JoinPoint joinPoint){

        System.out.println(joinPoint.getArgs().length);
        System.out.println(joinPoint.getTarget());
    }

     @Around("execution(* com.baizhi.service.*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
         Object proceed = proceedingJoinPoint.proceed();

         return proceed;
    }

}
