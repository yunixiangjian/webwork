package com.ityc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class TalisWebProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TalisWebProjectApplication.class, args);
    }

}
