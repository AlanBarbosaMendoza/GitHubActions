package com.dockerforjavadevelopers.hello;

import java.util.Date;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        Date fecha = new Date();
        return "Hello World from Github Actions and OpenShift " + fecha.toString() + "!";
    }
    
}
