package com.KgiSL.GradleProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.stereotype.Controller;



@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String getAll() {
       
        return "i am from controller";
    }
}

