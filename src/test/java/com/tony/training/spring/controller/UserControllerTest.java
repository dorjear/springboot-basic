package com.tony.training.spring.controller;

import com.tony.training.spring.service.GetNumServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(value = CalculationController.class)
public class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    GetNumServiceImpl getNumServiceImpl;

    @Test
    public void getNormalCase() throws Exception {
        Mockito.when(getNumServiceImpl.getNumByApi(2000,7,3)).thenReturn(Arrays.asList("I am 9","I am 16","I am 23"));
        String max="2000";
        String divisor="7";
        String limit="3";
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/api/calculation").param("max",max).param("divisor",divisor).param("limit",limit);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals("{\"data\":[\"I am 9\",\"I am 16\",\"I am 23\"]}",result.getResponse().getContentAsString());
        System.out.println(result.getResponse().getContentAsString());
    }
    }
