package me.ranjit.spring.cs.base.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by suzh on 6/29/2017.
 * 在Spring中，有4种类型的组件自动扫描注释类型
 @Component – 指示自动扫描组件。
 @Repository – 表示在持久层DAO组件。
 @Service – 表示在业务层服务组件。
 @Controller – 表示在表示层控制器组件。

 所有的 @Repository, @Service 或 @Controller 被注解为 @Component。
 因此，我们可以只使用 @Component 对所有组件进行自动扫描？是的，Spring会自动扫描所有组件的 @Component 注解。
 为便于阅读，应该始终声明@Repository，@ Service 或 @Controller 在指定的层，使你的代码更易于阅读

 可以通过@Component(beanName) 来重新指定bean的名称，否则Spring会默认把类名的小驼峰格式转化为beanName
 */
@Data
@Component("AAABBC")//自定义自动扫描组件名称
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;
}
