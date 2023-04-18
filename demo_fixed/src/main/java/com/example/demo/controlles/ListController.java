package com.example.demo.controlles;

import com.example.demo.Entitys.Employees;
import com.example.demo.repos.EmployeeRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;



@Controller
public class ListController {
    EmployeeRepo listrepo;

    public ListController(EmployeeRepo listrepo){
        this.listrepo = listrepo;

    }
    /*@PostMapping("/del")
    public String deleteById(@RequestParam int id, HttpServletRequest request){

        listrepo.deleteById(id);
        return "Employee";

    }*/
    @PostMapping( value = "/del/Employee/{id}")
    @ResponseBody
    public String Delete(@PathVariable(value="id") long id, @RequestParam(required = false) Integer Employees, Model model) {
        Employees post = listrepo.findById((int) id).orElseThrow();
        listrepo.deleteById((int) id);

        return "";

    }


}
