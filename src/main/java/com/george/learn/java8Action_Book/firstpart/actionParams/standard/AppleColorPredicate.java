package com.george.learn.java8Action_Book.firstpart.actionParams.standard;

import com.george.learn.java8Action_Book.bean.Apple;

public class AppleColorPredicate implements ApplePredicate {
    public static final String APPLE_PREPARATION_COLOR = "green";
    private String color = APPLE_PREPARATION_COLOR;


    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean test(Apple apple) {
        return color.equals(apple.getColor());
    }
}
