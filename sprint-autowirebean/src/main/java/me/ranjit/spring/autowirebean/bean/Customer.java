package me.ranjit.spring.autowirebean.bean;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by suzh on 6/5/2017.
 * 通过 @Autowired 自动装配 property.base，它可以在 setter 方法，构造函数或字段中使用。
 */
@Getter
public class Customer {
    private String name;

    @Autowired //加在字段上，必须有一个无参的构造函数！！！！！
    @Qualifier("address2") //当存在多个数据类型一致的bean时，可以通过@Qualifier指定所要装配的bean的id
    private Address address;
    public Customer() {}

//    @Autowired //加在构造函数上
    public Customer(Address address) {
        this.address = address;
    }

//    @Autowired //加在setter函数上
    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
}
