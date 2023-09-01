package com.example1.updatespringfunction;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example1.updatespringfunction.Dao.Employeedao;
import com.example1.updatespringfunction.Entity.Employee;

@SpringBootApplication
public class UpdatespringfunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdatespringfunctionApplication.class, args);
	}

	 @Autowired
 private Employeedao employeedao;



@Bean
public Function<String , String > greeting(){
	return input -> "Hello, " + input;
}

@Bean
public Function<String, String> stringLength() {
    return input -> "length=" + input.length();
}


// @Bean
// public Function<Employee, String> addEmployee() {
//     return emp -> {
//         employeedao.save(emp);
//         return "employee added sucessfully";
//     };
// }


@Bean
public Function< Void , List<Employee>> getEmployee()
{
	return (Void v) -> {
        List<Employee> employees = employeedao.findAll();
        return employees;
    };

}




// 	@Bean  // to register spring function with spring boot
//     public GreetingFunction greetingFunction() {
//     return new GreetingFunction();  //The greetingFunction() method returns an instance of the GreetingFunction class. ( grettingfunction() method creat ea  new object of class GreetingFunction and returning it)
// }

// @Bean
// public StringLength stringLength(){
// 	return new StringLength();
// }

// @Bean
// public EmployeeDetails employeeDetails(){
// return new EmployeeDetails();
// }

// @Bean 
// public GetEmployeeDetails getEmployeeDetails()
// {
// 	return new GetEmployeeDetails();
// }
//We return the instance of the GreetingFunction class because we want to make the GreetingFunction bean available to other beans in the Spring Boot application. 

}

