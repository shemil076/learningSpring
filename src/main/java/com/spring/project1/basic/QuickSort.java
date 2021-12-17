package com.spring.project1.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Quick")
public class QuickSort implements SortAlgorithm{
    public int [] sort(int[] numbers) {
        return numbers;
    }
}
