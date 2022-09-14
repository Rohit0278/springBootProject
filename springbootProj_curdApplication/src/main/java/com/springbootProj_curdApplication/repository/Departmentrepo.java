package com.springbootProj_curdApplication.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springbootProj_curdApplication.entity.Department;

public interface Departmentrepo extends JpaRepository<Department, Integer> {

}
