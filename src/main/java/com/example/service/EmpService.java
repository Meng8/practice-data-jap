package com.example.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.EmpRepository;
import com.example.entity.Employee;

@Service
public class EmpService {
	
	@PersistenceContext
	EntityManager  entitymanager;
	
	@Autowired
	EmpRepository empRepository;
	
	public List<Employee> fingID(long id){
		
		List<Employee> emp=new ArrayList<Employee> ();
		emp=entitymanager.createNamedQuery("findId",Employee.class)
				.setParameter("id", id)
				.getResultList();
		return emp;
		
	}
	
	//spring data jpa
	//增加
	public void add(Employee emp) {
		Employee save = empRepository.save(emp);
	}
	
	//查询
	public Employee fingOne(long id) {
		Employee emp = empRepository.findOne(id);
		return emp;
	}
	//查询全部
	public List<Employee>fingAll(){
		List<Employee> findAll = empRepository.findAll();
		return findAll;
	}
	//更新
	public void update(long id,String name) {
		Employee employee = new Employee();
		employee.setEmpId(id);
		employee.setName(name);
		Employee findOne = empRepository.save(employee);
	}
	//根据名字修改其他属性
	public Employee update2(String name,long id,int did,double sal) {
		Employee employee = new Employee();
		employee.setName(name);
		employee.setEmpId(id);
		employee.setDeptId(did);
		employee.setSalary(sal);
		Employee findOne = empRepository.save(employee);
		return findOne;
	}
	
	
	
	//删除
	
	public void delete(long id) {
		empRepository.delete(id);
		
	}
	
	

}
