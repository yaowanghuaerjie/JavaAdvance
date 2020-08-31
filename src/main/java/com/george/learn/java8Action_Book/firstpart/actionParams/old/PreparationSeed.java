package com.george.learn.java8Action_Book.firstpart.actionParams.old;

import com.george.learn.java8Action_Book.bean.Apple;
import com.george.learn.java8Action_Book.firstpart.actionParams.standard.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

/**
 * 老旧的写法  不满足需求变化
 */
public class PreparationSeed {
    /**
     * 需求  根据颜色筛选苹果
     */
    public static List<Apple> fileterApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 通过重量筛选苹果
     * <p>
     * TODO 与上面颜色筛选代码重复
     */
    public static List<Apple> fileterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 通过苹果的属性筛选
     * <p>
     * TODO 相当糟糕的写法，语义不明，笨拙
     */
    public static List<Apple> fileterApples(List<Apple> inventory,
                                            int weight,
                                            String color,
                                            boolean flag) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ((flag && apple.getColor().equals(color)) ||
                    (flag && apple.getWeight() > weight)) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 比较优雅的写法
     */
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
