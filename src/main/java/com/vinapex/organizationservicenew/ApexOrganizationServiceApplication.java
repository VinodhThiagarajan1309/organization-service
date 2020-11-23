package com.vinapex.organizationservicenew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;



@SpringBootApplication
@EnableResourceServer
@EnableBinding(Source.class)
public class ApexOrganizationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApexOrganizationServiceApplication.class, args);
    }
}
