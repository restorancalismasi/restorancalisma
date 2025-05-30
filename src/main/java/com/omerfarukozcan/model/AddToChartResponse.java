package com.omerfarukozcan.model;

import lombok.Data;

import static java.lang.Boolean.FALSE;

@Data
public class AddToChartResponse {

    private boolean success;
    private int cartsSize;

    public AddToChartResponse() {
    }

    public AddToChartResponse(boolean success) {
        this.success = success;
    }

}
