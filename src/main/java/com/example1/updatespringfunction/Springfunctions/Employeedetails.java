package com.example1.updatespringfunction.Springfunctions;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;

import com.example1.updatespringfunction.Dao.Employeedao;
import com.example1.updatespringfunction.Entity.Employee;

public class Employeedetails implements Function<Employee , String> {
     
    @Autowired
    private Employeedao employeedao;
    
    @Override
    public String apply(Employee employee)
    {
        employeedao.save(employee);
        return "employee added sucessfully";
    }

}
