package com.example1.updatespringfunction.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.updatespringfunction.Entity.Employee;

public interface Employeedao extends JpaRepository<Employee,Long>{
    
}
