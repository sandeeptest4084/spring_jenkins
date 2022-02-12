package com.springjenkins;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void intt()
	{
		logger.info("application started ...");
	}

	public static void main(String[] args) {
		
		logger.info("application executed ...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
