package com.example.a17010304.boxlist;

public class BoxItem {
    private String colour;

    public BoxItem(String colour) {
        this.colour = colour;

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "BoxItem{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
