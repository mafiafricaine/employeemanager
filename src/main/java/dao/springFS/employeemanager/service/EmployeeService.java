package dao.springFS.employeemanager.service;

import dao.springFS.employeemanager.exception.UserNotFoundException;
import dao.springFS.employeemanager.model.Employee;
import dao.springFS.employeemanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepo;



    @Autowired
    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public EmployeeRepository getEmployeeRepo() {
        return employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id){
        return employeeRepo.getById(id);
    }

    public Employee findEmployeeByIdWithFunction(Long id){
        return employeeRepo.findEmployeeByIdWithFunction(id)
                .orElseThrow(()-> new UserNotFoundException("User by id "+id +" was not found"));
    }

    public void deleteEmployeeById(Long id){
        employeeRepo.deleteById(id);
    }

}
