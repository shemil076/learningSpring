package com.spring.project1;

import com.spring.project1.cdi.SomeCDI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CDIApplication {

	private  static Logger logger = LoggerFactory.getLogger(CDIApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(CDIApplication.class, args);


		SomeCDI someCDI = applicationContext.getBean(SomeCDI.class);



		logger.info("{} dao-{}", someCDI,someCDI.getSomeCDIDAO());




	}
}
