package com.example.springboothello;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpRepository {

   public List<Employee> employee = new ArrayList<Employee>();

   public List<Employee> getAll() {
      return employee;
   }

   public String add(Employee emp) {
      employee.add(emp);
      return "Successfully added!";
   }

   public String edit(Employee emp) {
      employee.stream().filter(item -> item.getEmployeeId() == emp.getEmployeeId()).forEach(e ->
      {
         e.setAddress(emp.getAddress());
         e.setName(emp.getName());
      });
      return "Successfully edited";
   }

   public String delete(int empNo) {
      employee.remove(empNo-1);
      return "Deleted";
   }
}
