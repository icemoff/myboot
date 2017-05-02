package org.bjf.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by binjinfeng on 2017/1/19.
 */
@SpringBootApplication
@EnableScheduling
@ServletComponentScan
public class Application {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(Application.class, args);
        System.out.println("args = " + args);

    }
}
