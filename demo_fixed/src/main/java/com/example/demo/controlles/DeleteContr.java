package com.example.demo.controlles;

import com.example.demo.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DeleteContr {
    @Autowired
    EmployeeRepo delrepo;

    public DeleteContr(EmployeeRepo delrepo){
        this.delrepo = delrepo;
    }

    @RequestMapping("/delete")
    public String saveEmployee(Model model) {
        return "delete";


    }

    @DeleteMapping ("/delete")
    public void deleteById(@RequestParam int id, HttpServletRequest request){

        delrepo.deleteById(id);

    }

}
