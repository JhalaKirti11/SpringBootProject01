package org.projectwallah.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KirtiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(KirtiApplication.class, args);
	
		ClassFirst c = context.getBean(ClassFirst.class);
		c.show();
	}
}
