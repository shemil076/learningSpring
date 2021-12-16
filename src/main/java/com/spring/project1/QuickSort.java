package com.spring.project1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Quick")
public class QuickSort implements SortAlgorithm{
    public int [] sort(int[] numbers) {
        return numbers;
    }
}
