package com.example.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * The persistent class for the dept database table.
 * 
 */
@Entity
@Data
@Table(name="dept")
public class Dept implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	@ManyToOne(cascade={CascadeType.ALL})
	private long id;
    @Column
	private String name;

	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + "]";
	}

	public Dept(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Dept() {
		super();
	}
	
	

}