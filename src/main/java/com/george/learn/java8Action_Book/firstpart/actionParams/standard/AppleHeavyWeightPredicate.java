package com.george.learn.java8Action_Book.firstpart.actionParams.standard;

import com.george.learn.java8Action_Book.bean.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    public static final int APPLE_STANDARD_WEIGHT = 150;
    private int weight = APPLE_STANDARD_WEIGHT;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > weight;
    }
}
