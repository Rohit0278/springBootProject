package com.Neosoft.CrudApplication.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name="employee")
public class Employee {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	    @Column(name = "id")
	    private Integer id;
	 
	    @Column(name = "name")
	    private String name;
	    
	    public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

		@ManyToOne(fetch = FetchType.LAZY)
		 @JoinColumn(foreignKey = @ForeignKey(name = "dept_id"), name = "dept_id")
	    
	    private Department department;
	}


