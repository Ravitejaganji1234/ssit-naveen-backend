package com.middleware.leave_approval_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableScheduling
@EnableWebMvc
public class LeaveApprovalSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeaveApprovalSystemApplication.class, args);
    }

}
