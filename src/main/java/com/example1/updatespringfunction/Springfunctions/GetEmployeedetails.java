package com.example1.updatespringfunction.Springfunctions;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;

import com.example1.updatespringfunction.Dao.Employeedao;
import com.example1.updatespringfunction.Entity.Employee;

public class GetEmployeedetails implements Function<String, List<Employee>> {

    @Autowired
    private Employeedao employeedao;

    @Override
    public List<Employee> apply(String input) {
        return employeedao.findAll();
    }
}
