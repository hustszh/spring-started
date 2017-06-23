package me.ranjit.spring.jdbc.dao;

import me.ranjit.spring.jdbc.bean.Department;

import java.util.List;

/**
 * Created by suzh on 5/31/2017.
 */
public interface DepartmentDAO {
    List<Department> queryDepartment() throws Exception ;
}
