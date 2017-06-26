package me.ranjit.spring.id.beanmethod;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by suzh on 6/23/2017.
 *
 * 在Spring中，可以使用 init-method 和 destroy-method 在bean 配置文件属性，
 * 用于在bean初始化和销毁某些动作时。
 * 这是用来替代 InitializingBean和DisposableBean接口。
 */
@Data
@Log4j2
public class CustomerService {

    String message;

    /*
    initIt()方法被调用在 message 属性设置后
     */
    public void initIt() throws Exception {
        log.info("Init method after properties are set : " + message);
    }
    /*
    cleanUp()方法是在调用 context.close()之后
     */
    public void cleanUp() throws Exception {
        log.info("Spring Container is destroy! Customer clean up");
    }
}
