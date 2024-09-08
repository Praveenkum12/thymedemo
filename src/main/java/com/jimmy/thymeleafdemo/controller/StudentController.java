package com.jimmy.thymeleafdemo.controller;

import com.jimmy.thymeleafdemo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/form")
    public String showForm(Model theModel) {
        theModel.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping("/confirmPage")
    public String showConfirmationPage(@ModelAttribute("student") Student stud) {
        System.out.println(stud.getFirstName() + " " + stud.getLastName());
        return "confirm-page";
    }
}
