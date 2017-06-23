package me.ranjit.spring.di.constructor;

import me.ranjit.spring.di.constructor.helper.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/7/2017.
 */
public class DiConstructorMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor/applicationContextConstructor.xml");
        OutputHelper outputHelper = (OutputHelper)context.getBean("outputHelper");
        outputHelper.generateOutput();
    }
}
