package com.tony.training.spring.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetNumberServiceImplTest {

    @Test
    public void testGetNumberServiceImplTest(){
        GetNumServiceImpl getNumServiceImpl=new GetNumServiceImpl();
        List<String> list=getNumServiceImpl.getNumByApi(1000,7,3);
        assertEquals(Arrays.asList("I am 9","I am 16","I am 23"),list);
    }

}
