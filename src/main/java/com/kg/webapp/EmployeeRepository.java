package com.kg.webapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
//@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}