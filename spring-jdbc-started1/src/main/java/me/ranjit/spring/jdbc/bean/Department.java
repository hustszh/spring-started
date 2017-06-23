package me.ranjit.spring.jdbc.bean;

import lombok.Data;

/**
 * Created by suzh on 5/31/2017.
 */
@Data
public class Department {
    private Long deptId;
    private String deptNo;
    private String deptName;

    public Department() {
    }

    public Department(Long deptId, String deptNo, String deptName) {
        this.deptId = deptId;
        this.deptNo = deptNo;
        this.deptName = deptName;
    }
}
