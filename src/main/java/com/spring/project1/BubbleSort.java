package com.spring.project1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlgorithm{

    public int[] sort(int[] numbers) {
        return numbers;
    }
}
