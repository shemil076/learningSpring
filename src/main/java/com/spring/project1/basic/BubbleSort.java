package com.spring.project1.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Bubble")

public class BubbleSort implements SortAlgorithm{

    public int[] sort(int[] numbers) {
        return numbers;
    }
}
