package com.ashok.nextgenhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class NextgenHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(NextgenHystrixDashboardApplication.class, args);
	}
}
