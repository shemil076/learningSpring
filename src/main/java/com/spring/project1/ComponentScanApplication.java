package com.spring.project1;

import componentScan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("componentScan")
public class ComponentScanApplication {

	private  static Logger logger = LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ComponentScanApplication.class, args);


		ComponentDAO ComponentDAO = applicationContext.getBean(ComponentDAO.class);



		logger.info("{}", ComponentDAO);


	}
}
