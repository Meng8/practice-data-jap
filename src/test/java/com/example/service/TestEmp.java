package com.example.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entity.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestEmp {
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
	public void addEmpTest() {
		Employee employee = new Employee(3, 2, "Meng", 9000);
		empService.add(employee);
	}
	@Test
	public void findOneEmpTest() {
		Employee fingOne = empService.fingOne(2);
		System.out.println(fingOne);
	}
	@Test
	public void findAllEmpTest() {
		List<Employee> em = empService.fingAll();
		for (Employee employee : em) {
			System.out.println(employee);
		}
	}
	@Test
	public void updateEmpTest() {
		Employee update2 = empService.update2("猛",2,2, 5000);
		System.out.println(update2);
	}
	@Test
	public void deleteEmpTest() {
		empService.delete(3);
		
	}
	
}
