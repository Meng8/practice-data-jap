package com.example.entity;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee, Serializable>{

	//根据名字更新
	//public Employee save(Employee emp);



}
