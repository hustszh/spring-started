package me.ranjit.spring.jdbc;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.jdbc.bean.Department;
import me.ranjit.spring.jdbc.dao.DepartmentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by suzh on 5/31/2017.
 */
@Log4j2
public class MainDemo {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring-module.xml");

        DepartmentDAO deptDAO = (DepartmentDAO) context
                .getBean("departmentDAO");

        List<Department> depts = deptDAO.queryDepartment();

        for (Department dept : depts) {
            log.info(JSON.toJSONString(dept));
        }
    }
}
