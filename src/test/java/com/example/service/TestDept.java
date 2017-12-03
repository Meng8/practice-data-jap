package com.example.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entity.Dept;
import com.example.entity.Employee;



@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDept {
	
	@Autowired
	DeptService deptservice;
	
	@Autowired
	EmpService empService;
	
	@Test
	public void fingIdTest() {
		List<Employee> fingID = empService.fingID(1);
		for (Employee employee : fingID) {
			System.out.println(employee);
		}
	}
	
	
	@Test
	public void findDeptTest() {
		List<Dept> addDept = deptservice.fingDept(1, "long");
		System.out.println(addDept);
	}
	
	@Test
	public void fingAllDeptTest() {
		List<Dept> fingAllDept = deptservice.fingAllDept();
		System.out.println(fingAllDept);
	}
	
	@Test
	public void addDeptTest() {
		deptservice.addDept(2, "liu");
		
	}
	@Test
	public void updateDeptTest() {
	}
	

}
