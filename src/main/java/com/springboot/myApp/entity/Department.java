package com.springboot.myApp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

//    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Student> students;

    public Department() {}
    public Department(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public List<Student> getStudents() {
//        return students;
//    }

//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", students=" + "" +
                '}';
    }
}
