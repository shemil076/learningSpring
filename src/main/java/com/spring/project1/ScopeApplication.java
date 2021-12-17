package com.spring.project1;

import com.spring.project1.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ScopeApplication {

	private  static Logger logger = LoggerFactory.getLogger(ScopeApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(ScopeApplication.class)) {


			PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

			PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

			logger.info("{}", personDao);
			logger.info("{}", personDao.getJdbcConnection());

			logger.info("{}", personDao2);
			logger.info("{}", personDao2.getJdbcConnection());
		}
	}
}
