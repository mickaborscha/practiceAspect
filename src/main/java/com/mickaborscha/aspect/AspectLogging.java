package com.mickaborscha.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectLogging  {

    @Before("execution(* com.mickaborscha.interfaces.AspectInvoker.testData(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("logBefore() is running");

    }

    @After("execution(* com.mickaborscha.interfaces.AspectInvoker.testData(..))")
    public void logAfter(JoinPoint joinPoint) {

        System.out.println("logAfter() is running!");


    }
   @AfterReturning(pointcut = "execution(* com.mickaborscha.interfaces.AspectInvoker.testDataReturnValue(..))",returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("logAfterReturning() is running!");
        System.out.println("Method returned value is : " + result);

    }
    @AfterThrowing(
            pointcut = "execution(* com.mickaborscha.interfaces.AspectInvoker.testDataExeption(..))",
            throwing= "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

        System.out.println("logAfterThrowing() is running!");
        System.out.println("Exception : " + error);


    }
}
