package me.ranjit.spring.cs.filter.include;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by suzh on 6/29/2017.
 * 使用Spring “过滤” 扫描并注册匹配定义“regex”，即使该类组件的名称未标注 @Component 。
 */
@Data
//@Component
public class CustomerDAO {

    @Value("#{'ranjit'}")
    private String name;

    @Value("#{380}")
    private int age;
}
