package me.ranjit.spring.id.j2eeannotation;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by suzh on 6/23/2017.
 *
 * 使用 @PostConstruct 和 @PreDestroy 注解来初始化和销毁bean。
 *
 * 默认情况下，Spring不会意识到@PostConstruct和@PreDestroy注解。
 * 要启用它，要么注册“org.springframework.context.annotation.CommonAnnotationBeanPostProcessor”，
 * 要么在bean配置文件的<context:annotation-config />指定
 *
 */
@Data
@Log4j2
public class CustomerService {

    String message;

    @PostConstruct
    public void initIt() throws Exception {
        log.info("Init method after properties are set : " + message);
    }

    @PreDestroy
    public void cleanUp() throws Exception {
        log.info("Spring Container is destroy! Customer clean up");
    }

}
