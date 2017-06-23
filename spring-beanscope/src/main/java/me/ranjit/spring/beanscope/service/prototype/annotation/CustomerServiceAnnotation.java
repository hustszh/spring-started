package me.ranjit.spring.beanscope.service.prototype.annotation;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by suzh on 6/7/2017.
 */
@Data
@Service
@Scope("prototype")
public class CustomerServiceAnnotation {
    private String msg;
}
