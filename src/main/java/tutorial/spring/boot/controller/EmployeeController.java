package tutorial.spring.boot.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tutorial.spring.boot.model.Employee;


@RestController
public class EmployeeController {
	
	private static List<Employee> employees = new ArrayList<>();
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public List<Employee> listEmployees() {
		return employees;
	}
	
	@RequestMapping(value="/add",method = RequestMethod.GET)
	public void addEmployee(@RequestParam(value = "employeeName", required = false) String employeeName,
			@RequestParam(value = "employeeId", required = false) String employeeId){
		Employee employee = new Employee(employeeId,employeeName);
		employees.add(employee);
	}
}
