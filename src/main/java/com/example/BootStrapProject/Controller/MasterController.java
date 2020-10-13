package com.example.BootStrapProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/go")
public class MasterController {

    @GetMapping("/home")
    public String getHomePage() {

        return "home";
    }


}
