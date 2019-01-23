package com.example.receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.stereotype.Component;

@SpringBootApplication
//        (scanBasePackages={"com.csjscm.core.suppermark.config"}
//        ,exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})

public class ReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReceiverApplication.class, args);
    }

}

