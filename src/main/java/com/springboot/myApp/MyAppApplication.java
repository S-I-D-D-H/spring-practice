package com.springboot.myApp;

import com.springboot.myApp.dao.DepartmentDao;
import com.springboot.myApp.entity.Department;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// this annotation is composed of different of annotations like componentscan, configuration, enableautoconfigutration
@SpringBootApplication(
		scanBasePackages = {"com.springboot.myApp","com.springboot.outerPackage"}
)
public class MyAppApplication {

	public static void main(String[] args) {
		//bootstrap spring application
		SpringApplication.run(MyAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(DepartmentDao departmentDao) {
		return runner -> {
//		  createDepartment(departmentDao);
//		  getAllDepartments(departmentDao);
		  updateDepartment(departmentDao);
		};
	}
	public void getAllDepartments(DepartmentDao departmentDao) {
		System.out.println(departmentDao.findAll().toString());
	}
	public void createDepartment(DepartmentDao dao) {
		Department d1 = new Department("Masters");
		dao.save(d1);

//		Department d2 = new Department();
//		d2.setName("Nano Technology");
//		dao.save(d2);
	}
	public void updateDepartment(DepartmentDao dao) {
		Department d1 = dao.getById(3);
		d1.setName("Department Updated");
		dao. update(d1);
	}
}
