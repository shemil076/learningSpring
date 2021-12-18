package com.spring.project1.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SomeCDITest {

    @InjectMocks
    SomeCDI someCDI;

    @Mock
    SomeCDIDAO daoMock;

    @Test
    public void Search() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,4});
        int result = someCDI.findGreat();
        assertEquals(4, result);
    }

    @Test
    public void Search1() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{});
        int result = someCDI.findGreat();
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void Search2() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,4,5,6,7,8,9,1});
        int result = someCDI.findGreat();
        assertEquals(9, result);
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