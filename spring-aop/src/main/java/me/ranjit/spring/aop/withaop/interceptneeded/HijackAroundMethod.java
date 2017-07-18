package me.ranjit.spring.aop.withaop.interceptneeded;

import lombok.extern.log4j.Log4j2;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

/**
 * Created by suzh on 7/17/2017.
 * Spring AOP(面向方面编程)框架，用于在模块化方面的横切关注点。
 * 简单得说，它只是一个拦截器拦截一些过程，
 * 例如，当一个方法执行，Spring AOP 可以劫持一个执行的方法，在方法执行之前或之后添加额外的功能。
 在Spring AOP中，有 4 种类型通知(advices)的支持：
 通知(Advice)之前 - 该方法执行前运行
 通知(Advice)返回之后 – 运行后，该方法返回一个结果
 通知(Advice)抛出之后 – 运行方法抛出异常后，
 环绕通知 – 环绕方法执行运行，结合以上这三个通知。
 */
@Log4j2
public class HijackAroundMethod implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        log.info("Method name : "
                + methodInvocation.getMethod().getName());
        log.info("Method arguments : "
                + Arrays.toString(methodInvocation.getArguments()));

        // same with MethodBeforeAdvice
        log.info("=====HijackAroundMethod : Before method hijacked!");

        try {
            // proceed to original method call
            Object result = methodInvocation.proceed();

            // same with AfterReturningAdvice
            log.info("=====HijackAroundMethod : Before after hijacked!");

            return result;

        } catch (IllegalArgumentException e) {
            // same with ThrowsAdvice
            log.info("=====HijackAroundMethod : Throw exception hijacked!");
            throw e;
        }
    }
}
