package com.jimmy.thymeleafdemo.controller;

import com.jimmy.thymeleafdemo.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    List<String> countries;

    @RequestMapping("/form")
    public String showForm(Model theModel) {
        theModel.addAttribute("countries", countries);
        theModel.addAttribute("student", new Student());
        theModel.addAttribute("demo", "Hello guys");
        return "student-form";
    }

    @PostMapping("/confirmPage")
    public String showConfirmationPage(@ModelAttribute("student") Student stud) {
        System.out.println(stud.getFirstName() + " " + stud.getLastName());
//        System.out.println("///////////// " + (String) model.getAttribute("demo"));
        return "confirm-page";
    }
}
