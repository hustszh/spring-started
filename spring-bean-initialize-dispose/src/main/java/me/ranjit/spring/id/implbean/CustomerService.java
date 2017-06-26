package me.ranjit.spring.id.implbean;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by suzh on 6/23/2017.
 *
 * 在Spring中，InitializingBean和DisposableBean是两个标记接口，
 * 为Spring执行时bean的初始化和销毁某些行为时的有用方法。
   - 对于Bean实现 InitializingBean，它将运行 afterPropertiesSet()在所有的 bean 属性被设置之后。
   - 对于 Bean 实现了DisposableBean，它将运行 destroy()在 Spring 容器释放该 bean 之后。
 *
 * !!!不建议使用InitializingBean和DisposableBean的接口，因为它将你的代码紧耦合到 Spring 代码中。
 * 一个更好的做法应该是在bean的配置文件属性指定 init-method和destroy-method。
 */
@Data
@Log4j2
public class CustomerService implements InitializingBean, DisposableBean {

    String message;

    /*
    destroy()方法是在调用 context.close()之后
     */
    public void destroy() throws Exception {
        log.info("Spring Container is destroy! Customer clean up");
    }

    /*
    afterPropertiesSet()方法被调用在 message 属性设置后
     */
    public void afterPropertiesSet() throws Exception {
        log.info("Init method after properties are set : " + message);
    }
}
