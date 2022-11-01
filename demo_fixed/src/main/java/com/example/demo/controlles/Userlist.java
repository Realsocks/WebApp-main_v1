package com.example.demo.controlles;


import com.example.demo.Employees;
import com.example.demo.repos.EmployeeRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Userlist {

    EmployeeRepo userlistRepo;

    public Userlist(EmployeeRepo userlistRepo){
        this.userlistRepo = userlistRepo;
    }

    @GetMapping("/Employee")
    public String UserList(Model model){
        List<Employees> Userlist = userlistRepo.findAll();
        model.addAttribute("Userlist", Userlist);

        return("Employee");
    }

}
