package me.ranjit.spring.aspectj.annotation;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * Created by suzh on 7/17/2017.
 * 基于注解的AspectJ用法
 */
@Log4j2
@Aspect
public class AnnotationAspect {
    /*
    logBefore()方法将在 ICustomerService 接口的 addCustomer()方法的执行之前被执行。
     */
    @Before("execution(* me.ranjit.spring.aspectj.service.ICustomerService.addCustomer(..))")
    public void logBefore(JoinPoint joinPoint) {
        log.info("logBefore() is running!");
        log.info("hijacked : " + joinPoint.getSignature().getName());
        log.info("******");
    }

    /*
    logAfter()方法将在 ICustomerService 接口的 addCustomer()方法的执行之后执行。
     */
    @After("execution(* me.ranjit.spring.aspectj.service.ICustomerService.addCustomer(..))")
    public void logAfter(JoinPoint joinPoint) {
        log.info("logAfter() is running!");
        log.info("hijacked : " + joinPoint.getSignature().getName());
        log.info("******");
    }

    /*
    logAround()方法将在 ICustomerService 接口的addCustomerAround()方法执行之前执行，
    必须调用“joinPoint.proceed();” ，用于控制拦截器在什么时候返回控制到原来的addCustomerAround()方法。
     */
    @Around("execution(* me.ranjit.spring.aspectj.service.ICustomerService.addCustomerAround(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("logAround() is running!");
        log.info("hijacked method : " + joinPoint.getSignature().getName());
        log.info("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));

        log.info("Around before is running!");
        joinPoint.proceed(); //continue on the intercepted method
        log.info("Around after is running!");

        log.info("******");

    }

    /*
    logAfterReturning()方法将在 ICustomerService 接口的addCustomerReturnValue()方法执行之后执行。
    此外，还可以截取返回的值使用“returning”属性。
     */
    @AfterReturning(
            pointcut = "execution(* me.ranjit.spring.aspectj.service.ICustomerService.addCustomerReturnValue(..))",
            returning= "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        log.info("logAfterReturning() is running!");
        log.info("hijacked : " + joinPoint.getSignature().getName());
        log.info("Method returned value is : " + result);
        log.info("******");
    }

    /*
    如果 ICustomerService 接口的addCustomerThrowException()方法抛出异常，logAfterThrowing()方法将被执行。
     */
    @AfterThrowing(
            pointcut = "execution(* me.ranjit.spring.aspectj.service.ICustomerService.addCustomerThrowException(..))",
            throwing= "error")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

        log.info("logAfterThrowing() is running!");
        log.info("hijacked : " + joinPoint.getSignature().getName());
        log.info("Exception : " + error);
        log.info("******");

    }
}
