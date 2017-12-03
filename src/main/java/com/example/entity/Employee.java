package com.example.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.ToString;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Table(name="employee")
@NamedQueries({
	@NamedQuery(name = "findId", query = "select e from Employee e where e.id=:id ")})
	//@NamedQuery(name = "Org.findRoots", query = "select o from Org o where o.parent = null") 
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private long empId;


	@Column(name="dept_id")
	@ManyToOne(cascade={CascadeType.ALL})
	private int deptId;

	@Column
	private String name;
	@Column
	private double salary;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", deptId=" + deptId + ", name=" + name + ", salary=" + salary + "]";
	}

	public Employee() {
	}

	public long getEmpId() {
		return this.empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public int getDeptId() {
		return this.deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(long empId, int deptId, String name, double salary) {
		super();
		this.empId = empId;
		this.deptId = deptId;
		this.name = name;
		this.salary = salary;
	}

}