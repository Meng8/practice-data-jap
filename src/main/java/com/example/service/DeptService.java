package com.example.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.example.entity.Dept;


@Service
public class DeptService {
	
	@PersistenceContext
	EntityManager  entitymanager;
	//jpql 查询单个
	public List<Dept> fingDept(long id,String name) {
		List<Dept> de=new ArrayList<Dept>();
		de=entitymanager.createQuery(
				"SELECT d FROM Dept d where d.id=:id and d.name=:name", Dept.class)
				.setParameter("id", id)
				.setParameter("name", name)
				.getResultList();
		return de;
		
	}
	//查询全部
	public List<Dept> fingAllDept() {
		List<Dept> de=new ArrayList<Dept>();
		de=entitymanager.createQuery(
				"SELECT d FROM Dept d", Dept.class)
				.getResultList();
		return de;
		
	}
	//增加
	public void addDept(int id, String name) {
//		List<Dept> resultList = entitymanager.createQuery(
//				"insert into dept d values(d.id=:id,d.name=:name)", Dept.class)
//				.setParameter("id", id)
//				.setParameter("name", name)
//				.getResultList();
//		entitymanager.persist(resultList);
//		entitymanager.getTransaction().commit();
		}
	
	
	
	
	
	

}
