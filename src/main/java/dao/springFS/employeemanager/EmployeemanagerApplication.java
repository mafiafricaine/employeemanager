package dao.springFS.employeemanager;

import dao.springFS.employeemanager.model.Employee;
import dao.springFS.employeemanager.repository.EmployeeRepository;
import dao.springFS.employeemanager.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeemanagerApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmployeemanagerApplication.class, args);
		Employee e = new Employee("Julien","juliendunia@hotmail.com","Dev","0472504607","","DAO");


	}

}
