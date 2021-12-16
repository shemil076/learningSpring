package com.spring.project1;

import com.spring.project1.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeApplication {

	private  static Logger logger = LoggerFactory.getLogger(ScopeApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ScopeApplication.class, args);


		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		logger.info("{}", personDao);
		logger.info("{}", personDao.getJdbcConnection());

		logger.info("{}", personDao2);
		logger.info("{}", personDao2.getJdbcConnection());

	}
}
