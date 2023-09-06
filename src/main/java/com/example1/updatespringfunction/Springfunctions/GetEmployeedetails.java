package com.example1.updatespringfunction.Springfunctions;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example1.updatespringfunction.Dao.Employeedao;
import com.example1.updatespringfunction.Entity.Employee;

@Component
public class GetEmployeedetails implements Function<String, List<Employee>> {

    @Autowired
    private Employeedao employeedao;

    @Override
    public List<Employee> apply(String queryParameter) {
        return employeedao.findAll();
    }
}
