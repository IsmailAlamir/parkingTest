package com.locator.locator.Controller;


import com.locator.locator.Models.Parking;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GeneralController {

    @GetMapping("/")

    public String getHomePage(){
        return "index";
    }



}
