package com.example.springboothello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    EmpRepository empRepository;

    public List<Employee> getAll() {
        return empRepository.getAll();
    }

    public String add(Employee emp) {
        return  empRepository.add(emp);
    }

    public String edit(Employee emp) {
        return empRepository.edit(emp);
    }

    public String delete(int empNo) {
        return empRepository.delete(empNo);
    }
}
