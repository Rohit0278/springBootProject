package com.Neosoft.CrudApplication.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Neosoft.CrudApplication.Entity.Department;

public interface DepartmentrRepository extends JpaRepository<Department, Integer> {

}
