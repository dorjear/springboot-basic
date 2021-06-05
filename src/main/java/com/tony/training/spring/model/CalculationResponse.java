package com.tony.training.spring.model;

import java.util.List;
public class CalculationResponse {
    private List<String> data;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public CalculationResponse(List<String> list) {
        this.data = list;
    }
}
