package com.graey.spring_web;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest req, HttpSession session) {
        int numOne = Integer.parseInt(req.getParameter("num1"));
        int numTwo = Integer.parseInt(req.getParameter("num2"));

        int result = numOne + numTwo;

        session.setAttribute("result", result);

//        System.out.println(result);

        return "result.jsp";
    }
}
