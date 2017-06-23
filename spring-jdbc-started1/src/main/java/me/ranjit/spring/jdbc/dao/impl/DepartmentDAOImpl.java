package me.ranjit.spring.jdbc.dao.impl;

import me.ranjit.spring.jdbc.bean.Department;
import me.ranjit.spring.jdbc.dao.DepartmentDAO;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by suzh on 5/31/2017.
 */
public class DepartmentDAOImpl implements DepartmentDAO {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Department> queryDepartment() throws SQLException {
        Connection conn = dataSource.getConnection();

        String sql = "Select d.dept_id, d.dept_no, d.dept_name from DEPARTMENT d";
        Statement smt = conn.createStatement();

        ResultSet rs = smt.executeQuery(sql);
        List<Department> list = new ArrayList<Department>();
        while (rs.next()) {
            Long deptId = rs.getLong("dept_id");
            String deptNo = rs.getString("dept_no");
            String deptName = rs.getString("dept_name");
            Department dept = new Department(deptId, deptNo, deptName);
            list.add(dept);
        }
        return list;
    }
}
