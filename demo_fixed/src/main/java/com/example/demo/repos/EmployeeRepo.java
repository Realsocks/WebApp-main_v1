package com.example.demo.repos;

import com.example.demo.Entitys.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;
@Repository
public interface EmployeeRepo extends JpaRepository<Employees, Integer> {
    List<Employees> findAllById(Integer id);




}
