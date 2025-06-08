package com.springboot.myApp.dao;

import com.springboot.myApp.entity.Department;
import jakarta.persistence.TypedQuery;

import java.util.List;

public interface DepartmentDao {
    void save(Department department);
    List<Department> findAll();
    Department update(Department department);
    Department getById(int id);

}
