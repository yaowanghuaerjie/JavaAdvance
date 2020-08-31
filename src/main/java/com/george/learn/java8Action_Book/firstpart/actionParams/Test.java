package com.george.learn.java8Action_Book.firstpart.actionParams;

import com.george.learn.java8Action_Book.bean.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    private static String[] colors = {"red", "green", "yellow"};
    private static int[] weight = {100, 110, 130, 150, 180, 190, 105, 118, 168, 175};

    public static void main(String[] args) {
        List<Apple> appleList = initAppleData();


    }

    private static List<Apple> initAppleData() {
        List<Apple> appleList = new ArrayList<>();
        Random colorRandom = new Random(3);
        Random weightRandom = new Random(10);
        for (int i = 0; i < 20; i++) {
            int colorIndex = colorRandom.nextInt(3);
            int weightIndex = colorRandom.nextInt(10);
            Apple apple = new Apple();
            apple.setColor(colors[colorIndex]);
            apple.setWeight(weight[weightIndex]);
            appleList.add(apple);
        }
        return appleList;
    }
}
