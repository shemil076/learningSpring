package com.spring.project1;

import com.spring.project1.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

	public static void main(String[] args) {
// We should say to  the spring fra,e work:-
		// What are the beans?  (@Component)
		// What are the dependencies of a bean? (@Autowired)
		// Where to search for beans? => no need to do (it will do by the code)

//		BinarySearchIMPL binarySearchIMPL = new BinarySearchIMPL(new QuickSort());

		// Application context
		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(PropertiesApplication.class)){



			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

			System.out.println(service.returnServiceUrl());


		}

	}
}
