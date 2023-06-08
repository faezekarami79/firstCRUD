package com.example.springboothello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class SpringBootHelloApplication implements CommandLineRunner {

    @Autowired
    EmpRepository empRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee employee1 = new Employee(1 , "faeze" , "zanjan");
        Employee employee2 = new Employee(2 , "atena" , "zanjan");

        empRepository.employee.addAll(Arrays.asList(employee1, employee2));

    }
}

