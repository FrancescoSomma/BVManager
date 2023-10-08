package com.example.bvmautenticazione.rest;

import com.example.bvmautenticazione.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UtenteController {

    @Autowired
    private UtenteService utenteService;

    @GetMapping({"/test" })
    public String test(){
        return "test";
    }
}
