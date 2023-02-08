package com.example.demo.controlles;

import com.example.demo.repos.EmployeeRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ListController {
    EmployeeRepo listrepo;

    public ListController(EmployeeRepo listrepo){
        this.listrepo = listrepo;

    }
    @PostMapping("/del")
    public String deleteById(@RequestParam int id, HttpServletRequest request){

        listrepo.deleteById(id);
        return "delete";



    }


}
