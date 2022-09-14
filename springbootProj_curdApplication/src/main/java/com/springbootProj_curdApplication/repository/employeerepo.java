package com.springbootProj_curdApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springbootProj_curdApplication.entity.employee;

public interface employeerepo extends JpaRepository<employee, Integer>{

}
