package com.example.perfuland.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/v1")
public class ApiController {

    @GetMapping("/saludo")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String hola(){
        return "HOLA";
        
    }

}
