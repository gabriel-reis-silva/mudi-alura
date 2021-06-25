package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
// USANDO MODEL
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("nome", "mundo");
        return "hello";
    }


// USANDO O SERVLET
//    @GetMapping("/hello")
//    public String hello(HttpServletRequest request){
//        request.setAttribute("nome", "mundo");
//        return "hello";
//    }
}
