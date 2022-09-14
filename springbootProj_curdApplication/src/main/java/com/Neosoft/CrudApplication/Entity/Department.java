package com.Neosoft.CrudApplication.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dept_seq")
	    @SequenceGenerator(initialValue = 1, name = "dept_seq", sequenceName = "dept_sequence")
	    @Column(name = "id")
	    private Integer id;
	    @Column(name = "deptName")
	    private String deptName;
	    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
	    
	    private List<Employee> employees;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public List<Employee> getEmployees() {
			return employees;
		}
		public void setEmployees(List<Employee> employees) {
			this.employees = employees;
		}

}
