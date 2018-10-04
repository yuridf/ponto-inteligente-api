package br.com.pontointeligente.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class PontointeligenteapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PontointeligenteapiApplication.class, args);
    }
}
