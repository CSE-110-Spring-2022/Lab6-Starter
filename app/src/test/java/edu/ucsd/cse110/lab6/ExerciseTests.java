package edu.ucsd.cse110.lab6;

import static org.junit.Assert.assertEquals;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

import edu.ucsd.cse110.lab6.misc.Constants;

@RunWith(AndroidJUnit4.class)
public class ExerciseTests {


    @Test
    public void testExercise1() {
        List<Integer> numbers1 = Arrays.asList(0, 2, 1, 9, 7, 6, 3, 10, 3, 5);
        List<Integer> numbers2 = Arrays.asList(1, 1, 1, 1);
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);

        // floats and doubles don't have exact equality, so we instead check that we're close.
        double expected1 = 3.2;
        double actual1 = Exercises.exercise1(numbers1);
        assertEquals(expected1, actual1, 0.0001);

        double expected2 = 0.0;
        double actual2 = Exercises.exercise1(numbers2);
        assertEquals(expected2, actual2, 0.0001);

        double expected3 = 1.41421;
        double actual3 = Exercises.exercise1(numbers3);
        assertEquals(expected3, actual3, 0.0001);
    }

    @Test
    public void testExercise2() {
        long expected1 = 2;
        long actual1 = Exercises.exercise2("apples, bananas, and melons");
        assertEquals(expected1, actual1);

        long expected2 = 2;
        long actual2 = Exercises.exercise2("Apples, Bananas, and Melons");
        assertEquals(expected2, actual2);

        long expected3 = 15;
        long actual3 = Exercises.exercise2(Constants.poem);

        assertEquals(expected3, actual3);
    }
}