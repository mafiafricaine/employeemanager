package dao.springFS.employeemanager.repository;

import dao.springFS.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findEmployeeByIdWithFunction(Long id);
}
