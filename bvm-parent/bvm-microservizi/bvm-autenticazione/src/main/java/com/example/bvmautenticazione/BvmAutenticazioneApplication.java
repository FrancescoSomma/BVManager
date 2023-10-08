package com.example.bvmautenticazione;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class BvmAutenticazioneApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BvmAutenticazioneApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BvmAutenticazioneApplication.class, args);
    }

}
