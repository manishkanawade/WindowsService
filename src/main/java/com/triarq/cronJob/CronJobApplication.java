package com.triarq.cronJob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class CronJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronJobApplication.class, args);
	}
	
	@Scheduled(fixedRate = 5000)
	public void hello() {
		System.out.println("hello cron job is executed and deployed as windows service.... ");
	}

}
