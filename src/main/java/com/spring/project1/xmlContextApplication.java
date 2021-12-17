package com.spring.project1;

import com.spring.project1.xml.XMLPersonDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class xmlContextApplication {


	public static void main(String[] args) {
// We should say to  the spring fra,e work:-
		// What are the beans?  (@Component)
		// What are the dependencies of a bean? (@Autowired)
		// Where to search for beans? => no need to do (it will do by the code)

//		BinarySearchIMPL binarySearchIMPL = new BinarySearchIMPL(new QuickSort());

		// Application context
		try (ClassPathXmlApplicationContext applicationContext =
					 new ClassPathXmlApplicationContext("ApplicationContext.xml")){


			System.out.println("Bean loaded " + applicationContext.getBeanDefinitionNames());

			XMLPersonDAO personDAO = applicationContext.getBean(XMLPersonDAO.class);

			System.out.println(personDAO);
			System.out.println(personDAO.getXMLJdbcConnection());

		}

	}
}
