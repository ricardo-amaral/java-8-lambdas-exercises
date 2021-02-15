package com.insightfullogic.java8.exercises.chapter3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class StringExercises {

    // Question 6
    public static int countLowercaseLetters(String string) {
        char[] chars = string.toCharArray();

        return (int) IntStream.range(0, chars.length)
                .mapToObj(i -> chars[i])
                .filter(Character::isLowerCase)
                .count();
    }

    // Question 7
    public static Optional<String> mostLowercaseString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparingInt(StringExercises::countLowercaseLetters));
    }

}
