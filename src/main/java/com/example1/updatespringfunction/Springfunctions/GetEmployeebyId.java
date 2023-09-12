package com.example1.updatespringfunction.Springfunctions;

import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;

import com.example1.updatespringfunction.Dao.Employeedao;
import com.example1.updatespringfunction.Entity.Employee;

public class GetEmployeebyId  implements Function<Long , Employee> {
 
    
    @Autowired
    private Employeedao employeedao;

    @Override
    public Employee apply(Long employeeId) {
        
        Optional<Employee> employee = employeedao.findById(employeeId);

        if (!employee.isPresent()) {
            throw new IllegalArgumentException("Employee not found with ID: " + employeeId);
        }

        return employee.get();
    }
    
}

