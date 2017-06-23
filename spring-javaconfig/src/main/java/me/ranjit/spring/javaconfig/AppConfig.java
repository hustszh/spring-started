package me.ranjit.spring.javaconfig;

import me.ranjit.spring.javaconfig.service.DemoService;
import me.ranjit.spring.javaconfig.service.impl.DemoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by suzh on 6/6/2017.
 * 使用 @Configuration 注释告诉 Spring，这是核心的 Spring 配置文件，并通过 @Bean 定义 property.base。
 *
 * 从Spring 3起，JavaConfig功能已经包含在Spring核心模块，它允许开发者将bean定义和在Spring配置XML文件写到Java类中。
 * 仍然允许使用经典的XML方式来定义bean和配置，JavaConfig是另一种替代解决方案。
 *
 * 使用@Import加载多个配置Java类，等价于在applicationContext.xml配置中使用import导入其他配置文件：
 * <import resource="config/customer.xml"/>
 */
@Configuration
@Import({ CustomerConfig.class }) //导入其他Java配置类。
public class AppConfig {

    /*以下bean定义，等价于在applicationContext.xml作如下定义：
    <property.base id="demoService" class="me.ranjit.spring.javaconfig.service.impl.DemoServiceImpl">
     */
    @Bean(name="demoService")
    public DemoService anyNameIsOK() {
        return new DemoServiceImpl();
    }
}
