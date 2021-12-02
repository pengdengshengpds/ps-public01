package org.example.myboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 引导类；
 * 注意：引导类是Spring Boot特色，每个Spring Boot应用都需要有一个引导类来启动程序；
 */
@SpringBootApplication
public class MyBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBootApplication.class,args);
    }
}