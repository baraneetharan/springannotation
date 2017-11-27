package com.kg.webapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Component;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/employees")
public class EmployeeController {
  // @Autowired(required = true)
  @Autowired
  // @Qualifier("employeeRepository")
  EmployeeRepository employeeRepository;
  
  @RequestMapping(method = RequestMethod.GET)
  public List<Employee> findItems() {
    return employeeRepository.findAll();
  }
  
  // @RequestMapping(value = "/{id}",method = RequestMethod.GET)
  // public Employee findone(@PathVariable Integer id) {
  //   return  repo.findOne(id);
  // }
  
  @RequestMapping(method = RequestMethod.POST)
  public Employee addItem(@RequestBody Employee employee) {
	  employee.setId(null);
    return employeeRepository.saveAndFlush(employee);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public Employee updateemployee(@RequestBody Employee updatedemployee, @PathVariable Integer id) {
    updatedemployee.setId(id);
    return employeeRepository.saveAndFlush(updatedemployee);
  }
  
  // @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  // public void deleteItem(@PathVariable Integer id) {
  //   repo.delete(id);
  // }
}