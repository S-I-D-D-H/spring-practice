package com.springboot.myApp.dao;

import com.springboot.myApp.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDaoImple implements StudentDao {

    private EntityManager em;

    @Autowired
    public StudentDaoImple(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public void save(Student student) {
        this.em.persist(student);
    }
}
