package com.alireza.dockerchallengeone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
public class DockerChallengeOneApplication {

    public static void main(String[] args) {
        if (new FileSystemResource("config/logback.xml").getFile().exists()) {
            System.setProperty("logging.config", "file:config/logback.xml");
        } else {
            System.setProperty("logging.config", "classpath:config/logback.xml");
        }
        SpringApplication.run(DockerChallengeOneApplication.class, args);
    }

}
