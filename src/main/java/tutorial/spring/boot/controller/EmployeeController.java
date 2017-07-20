package tutorial.spring.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tutorial.spring.boot.model.Employee;


@RestController
@EnableSwagger2
@RequestMapping("/employee")
public class EmployeeController {
	
	private static List<Employee> employees = new ArrayList<>();
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<Employee> listEmployees() {
		return employees;
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public Employee addEmployee(@RequestHeader(value = "employeeName", required = false) String employeeName,
			@RequestHeader(value = "employeeId", required = false) String employeeId){
		Employee employee = new Employee(employeeId,employeeName);
		employees.add(employee);
		return employee;
	}
	
	@RequestMapping(value="/post",method = RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee){
		employees.add(employee);
		return employee;
	}
}
