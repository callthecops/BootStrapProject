package com.example.BootStrapProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Very simple boostrap info.Boostrap works with containers. So for each page we create we create a div class = container
// for each so called section we add in the body. Or there can be only one with multiple rows, depends on context.
//Than in each container we create rows like div class = "row". Each container has 12 columns by default.
//so When we create a row we can make space on that row for elements with classes like <p class="col-sm-4".
//the number value goes from 1-12.this means for that respective element we assign from 1 column to 12.
//Further if we have several elements in the same "row" div with complementary column values wich together
//result in no more than 12 (ex: <p class="col-sm-4">Whats</p><p class="col-sm-8">Up?</p>) will be shown on the same
//row.

@Controller
@RequestMapping("/go")
public class MasterController {

    @GetMapping("/home")
    public String getHomePage() {

        return "home";
    }


}
