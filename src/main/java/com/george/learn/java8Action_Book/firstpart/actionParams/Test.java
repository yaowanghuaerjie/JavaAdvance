package com.george.learn.java8Action_Book.firstpart.actionParams;

import com.george.learn.java8Action_Book.bean.Apple;
import com.george.learn.java8Action_Book.firstpart.actionParams.standard.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    private static String[] colors = {"red", "green", "yellow"};
    private static int[] weight = {100, 110, 130, 150, 180, 190, 105, 118, 168, 175};

    public static void main(String[] args) {
        List<Apple> appleList = initAppleData();
        List<Apple> weightAppleList = filterApp(appleList, new AppleColorAndHeavyWeightPredicate(), new AppleFancyFormatter());
        List<Apple> colorAppleList = filterApp(appleList, new AppleColorAndHeavyWeightPredicate(), new AppleSimpleFormatter());

        filterApp(appleList, (ApplePredicate1<Apple>) apple -> false, new AppleSimpleFormatter());

    }

    private static List<Apple> filterApp(List<Apple> invertory, ApplePredicate applePredicate, AppleFormatter formatter) {
        List<Apple> resultApples = new ArrayList<>();
        for (Apple apple : invertory) {
            System.out.println(formatter.accept(apple));
            if (applePredicate.test(apple)) {
                resultApples.add(apple);
            }
        }
        return resultApples;
    }

    private static List<Apple> filterApp(List<Apple> invertory, ApplePredicate1<Apple> applePredicate, AppleFormatter formatter) {
        List<Apple> resultApples = new ArrayList<>();
        for (Apple apple : invertory) {
            System.out.println(formatter.accept(apple));
            if (applePredicate.test(apple)) {
                resultApples.add(apple);
            }
        }
        return resultApples;
    }

    private static List<Apple> initAppleData() {
        List<Apple> appleList = new ArrayList<>();
        Random colorRandom = new Random(3);
        Random weightRandom = new Random(10);
        for (int i = 0; i < 20; i++) {
            int colorIndex = colorRandom.nextInt(3);
            int weightIndex = weightRandom.nextInt(10);
            Apple apple = new Apple();
            apple.setColor(colors[colorIndex]);
            apple.setWeight(weight[weightIndex]);
            appleList.add(apple);
        }
        return appleList;
    }
}
