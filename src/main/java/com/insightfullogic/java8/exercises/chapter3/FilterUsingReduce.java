package com.insightfullogic.java8.exercises.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Advanced Exercises Question 2
 */
public class FilterUsingReduce {

    public static <I> List<I> filter(Stream<I> stream, Predicate<I> predicate) {
        return stream.reduce(new ArrayList<>(), (acc, x) -> {
            List<I> newAcc = new ArrayList<>(acc);
            if (predicate.test(x)) {
                newAcc.add(x);
            }
            return newAcc;
        }, (List<I> left, List<I> right) -> {
            List<I> newLeft = new ArrayList<>(left);
            newLeft.addAll(right);
            return newLeft;
        });
    }

}
