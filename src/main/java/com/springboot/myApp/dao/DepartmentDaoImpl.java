package com.springboot.myApp.dao;

import com.springboot.myApp.entity.Department;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

    private EntityManager em;

    @Autowired
    public DepartmentDaoImpl(EntityManager em) {
        this.em = em;
    }
    @Override
    @Transactional
    public void save(Department department) {
        em.persist(department);
    }

    @Override
    public List<Department> findAll() {
        return em.createQuery("SELECT s FROM Department s", Department.class).getResultList();
    }

    @Override
    @Transactional
    public Department update(Department department) {
        return em.merge(department);
    }

    @Override
    public Department getById(int id) {
        return em.find(Department.class, id);
    }
}
