package ua.lviv.iot.spring.project7.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "ua.lviv.iot.spring.project7.dataaccess", "ua.lviv.iot.spring.project7.business",
        "ua.lviv.iot.spring.project7.rest.controller" })
@EnableJpaRepositories({ "ua.lviv.iot.spring.project7.dataaccess" })
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

}
