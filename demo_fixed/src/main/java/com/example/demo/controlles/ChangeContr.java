package com.example.demo.controlles;

import com.example.demo.Employees;
import com.example.demo.repos.EmployeeRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeContr {
    EmployeeRepo changeRepo;

    public ChangeContr(EmployeeRepo changeRepo){
        this.changeRepo = changeRepo;
    }


    @GetMapping("/change")
    public String changeEmployee(Model model){
        return "change";
    }

    @PostMapping("/change")
        public String UpdateData(@RequestParam int id, @RequestParam String name,
        @RequestParam String lastname,
        @RequestParam String secondname,
        @RequestParam String sex,
        @RequestParam String dateofbirth,
        @RequestParam String Work,Model model){


        Employees emp = changeRepo.findById(id).orElseThrow();
        emp.setName(name);
        emp.setLastname(lastname);
        emp.setSecondname(secondname);
        emp.setSex(sex);
        emp.setDateofbirth(dateofbirth);
        emp.setWork(Work);

        changeRepo.save(emp);

        return "index";

    }


}