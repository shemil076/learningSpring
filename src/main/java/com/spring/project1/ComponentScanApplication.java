package com.spring.project1;

import componentScan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("componentScan")
public class ComponentScanApplication {

	private  static Logger logger = LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext =
					new AnnotationConfigApplicationContext(ComponentScanApplication.class)) {


			ComponentDAO ComponentDAO = applicationContext.getBean(ComponentDAO.class);


			logger.info("{}", ComponentDAO);

		}
	}
}
