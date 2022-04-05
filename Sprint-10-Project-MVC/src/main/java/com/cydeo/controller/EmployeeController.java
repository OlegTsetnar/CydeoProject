package com.cydeo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping("/register")
    public String createEmployee(Model model){
        model.addAttribute("employee", new Employee());
        model.addAttribute("states", DataGenerator.getAllStates());
        return "employee/employee-create";
    }

    @PostMapping("/list")
    public String employeeList(@Valid @ModelAttribute ("employee") Employee employee, Model model){
        DataGenerator.saveEmployee(employee);

        model.addAttribute("employees",  DataGenerator.readAllEmployees());

        return "employee/employee-list";

    }
}