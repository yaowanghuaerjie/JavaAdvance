package com.george.learn.java8Action_Book.firstpart.actionParams.standard;

import com.george.learn.java8Action_Book.bean.Apple;

/**
 * @program: JavaAdvance
 * @description: 详细日志打印类
 * @author: George
 * @create: 2020-08-31 22:22
 */
public class AppleFancyFormatter implements AppleFormatter {

    @Override
    public String accept(Apple apple) {
        String desc = apple.getWeight() > 150 ? "weight " : "light ";
        return "A " + desc + apple.getColor() + " apple";
    }
}