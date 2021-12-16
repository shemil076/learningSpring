package com.spring.project1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchIMPL {


    @Autowired
    private SortAlgorithm sortAlgorithm;
//   private SortAlgorithm bubbleSort; // name of the variable

    // @Primary has the higher priority over name of the variable

//    public BinarySearchIMPL(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }


    // Setter autowiring  and no setter auto wiring is quiet same

    /*
    Recommendations:
        Mandatory dependencies use Constructor injection
        All other use setter injection (optional dependencies)
     */

//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] numbers, int numberToSearch) {


        int [] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        // implement sorting logic

        // bubble sort
        // search the array

        return 3;
    }
}
  