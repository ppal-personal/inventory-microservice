package com.example.inventory.dto;

public class StockUpdateRequest {
    private int delta;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}