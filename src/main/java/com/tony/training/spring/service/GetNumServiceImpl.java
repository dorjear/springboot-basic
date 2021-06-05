package com.tony.training.spring.service;

import com.tony.training.spring.BasicApiApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("getNumServiceImpl")
public class GetNumServiceImpl implements GetNumService {
    private static final Logger log = LoggerFactory.getLogger(BasicApiApplication.class);

    @Override
    public List<String> getNumByApi(int max, int divisor, int limit) {
        List<String> result = new ArrayList<>();
        //TODO: Write program to implement the logic
        return result;
    }
}
