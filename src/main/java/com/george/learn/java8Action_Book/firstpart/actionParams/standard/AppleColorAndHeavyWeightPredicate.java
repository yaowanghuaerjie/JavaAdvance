package com.george.learn.java8Action_Book.firstpart.actionParams.standard;

import com.george.learn.java8Action_Book.bean.Apple;

public class AppleColorAndHeavyWeightPredicate implements ApplePredicate {
    public static final int APPLE_STANDARD_WEIGHT = 150;
    public static final String APPLE_PREPARATION_COLOR = "green";
    private String color = APPLE_PREPARATION_COLOR;
    private int weight = APPLE_STANDARD_WEIGHT;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > weight && apple.getColor().equals(color);
    }
}
