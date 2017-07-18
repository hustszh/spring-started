package me.ranjit.spring.aspectj.xml;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

/**
 * Created by suzh on 7/18/2017.
 * 基于xml的AspectJ用法
 */
@Log4j2
@Aspect
public class XmlAspect {
    public void logBefore(JoinPoint joinPoint) {
        log.info("logBefore() is running!");
        log.info("hijacked : " + joinPoint.getSignature().getName());
        log.info("******");
    }

    public void logAfter(JoinPoint joinPoint) {
        log.info("logAfter() is running!");
        log.info("hijacked : " + joinPoint.getSignature().getName());
        log.info("******");
    }

    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("logAround() is running!");
        log.info("hijacked method : " + joinPoint.getSignature().getName());
        log.info("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
        log.info("Around before is running!");
        joinPoint.proceed(); //continue on the intercepted method
        log.info("Around after is running!");
        log.info("******");
    }

    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        log.info("logAfterReturning() is running!");
        log.info("hijacked : " + joinPoint.getSignature().getName());
        log.info("Method returned value is : " + result);
        log.info("******");
    }

    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
        log.info("logAfterThrowing() is running!");
        log.info("hijacked : " + joinPoint.getSignature().getName());
        log.info("Exception : " + error);
        log.info("******");
    }
}
