package com.mft.interhip8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ControllerHello {
    @GetMapping("/hello-world/{message}")
    public String helloWorld(@PathVariable String message) {
        return "Hello " + message + "!";
    }
}
