package me.ranjit.spring.di.setter;

import me.ranjit.spring.di.setter.helper.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/7/2017.
 */
public class DiSetterMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setter/applicationContextSetter.xml");
        OutputHelper outputHelper = (OutputHelper)context.getBean("outputHelper");
        outputHelper.generateOutput();
    }
}
