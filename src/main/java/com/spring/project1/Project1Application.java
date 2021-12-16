package com.spring.project1;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
// We should say to  the spring fra,e work:-
		// What are the beans?  (@Component)
		// What are the dependencies of a bean? (@Autowired)
		// Where to search for beans? => no need to do (it will do by the code)

//		BinarySearchIMPL binarySearchIMPL = new BinarySearchIMPL(new QuickSort());

		// Application context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Project1Application.class, args);


		BinarySearchIMPL binarySearch = applicationContext.getBean(BinarySearchIMPL.class);

		BinarySearchIMPL binarySearch1 = applicationContext.getBean(BinarySearchIMPL.class);

		System.out.println(binarySearch);
		System.out.println("");
		System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[]{12, 4, 6},3);

		System.out.println(result);
	}
}
