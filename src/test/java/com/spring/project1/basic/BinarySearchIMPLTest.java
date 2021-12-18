package com.spring.project1.basic;

import com.spring.project1.BasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = BasicApplication.class)
public class BinarySearchIMPLTest {

    @Autowired
    BinarySearchIMPL binarySearch;

    @Test
    public void Search() {
        int result = binarySearch.binarySearch(new int[]{},5);
        assertEquals(3, result);
    }



//    @Test
//    public void binarySearch() {
//        int result = binarySearch.binarySearch(new int[]{},5);
//        assertEquals(5, result);
//    }
//
//    @Test
//    void postConstruct() {
//    }
//
//    @Test
//    void preDestroy() {
//    }
}