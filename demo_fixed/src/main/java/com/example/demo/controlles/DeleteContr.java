package com.example.demo.controlles;

import com.example.demo.repos.EmployeeRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DeleteContr {
    EmployeeRepo delrepo;

    public DeleteContr(EmployeeRepo delrepo){
        this.delrepo = delrepo;
    }

    @RequestMapping("/delete")
    public String saveEmployee(Model model) {
        return "delete";


    }

    @PostMapping("/delete")
    public String deleteById(@RequestParam int id, HttpServletRequest request){

        delrepo.deleteById(id);
        return "delete";



    }

}
