package com.graey.spring_web;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int numOne, @RequestParam("num2") int numTwo, HttpServletRequest req, ModelAndView mv) {
        int result = numOne + numTwo;

        mv.addObject("result", result);

        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("addAlien")
    public String addAlien(Alien alien, ModelAndView mv) {
        return "result";
    }
}
