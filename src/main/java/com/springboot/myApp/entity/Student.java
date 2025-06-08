package com.springboot.myApp.entity;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollno;

    @Column(name="name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name="email")
    private String email;

    @Column(name = "age")
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Department department;

    public Student() {}

    public Student(int rollno, String name, String gender, String email, int age, Department department) {
        this.rollno = rollno;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.age = age;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", department=" + department +
                '}';
    }
}
