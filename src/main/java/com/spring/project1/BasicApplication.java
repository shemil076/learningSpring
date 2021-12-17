package com.spring.project1;

import com.spring.project1.basic.BinarySearchIMPL;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BasicApplication {

	public static void main(String[] args) {
// We should say to  the spring fra,e work:-
		// What are the beans?  (@Component)
		// What are the dependencies of a bean? (@Autowired)
		// Where to search for beans? => no need to do (it will do by the code)

//		BinarySearchIMPL binarySearchIMPL = new BinarySearchIMPL(new QuickSort());

		// Application context
		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(BasicApplication.class)){



			BinarySearchIMPL binarySearch = applicationContext.getBean(BinarySearchIMPL.class);

			BinarySearchIMPL binarySearch1 = applicationContext.getBean(BinarySearchIMPL.class);

			System.out.println(binarySearch);
			System.out.println("");
			System.out.println(binarySearch1);

			int result = binarySearch.binarySearch(new int[]{12, 4, 6},3);

			System.out.println(result);
		}

	}
}
