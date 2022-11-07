package com.example.demo.repos;

import com.example.demo.Employees;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employees, Integer> {
    List<Employees> findAllById(Integer id);




}
