package com.tony.training.spring.service;

import java.util.List;

public interface GetNumService {
    List<String> getNumByApi(int max, int divisor, int limit);
}
