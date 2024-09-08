package com.jimmy.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FunController {

    @RequestMapping("/processForm")
    public String processForm(@RequestParam("studentName") String theName , Model theModel) {
        theModel.addAttribute("name", "Yo! " + theName);
        return "helloworld";
    }

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        return "helloworld-form";
    }
}
