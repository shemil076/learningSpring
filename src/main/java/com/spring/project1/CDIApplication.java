package com.spring.project1;

import com.spring.project1.cdi.SomeCDI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDIApplication {

	private  static Logger logger = LoggerFactory.getLogger(CDIApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(CDIApplication.class)) {


			SomeCDI someCDI = applicationContext.getBean(SomeCDI.class);


			logger.info("{} dao-{}", someCDI, someCDI.getSomeCDIDAO());


		}

	}
}
