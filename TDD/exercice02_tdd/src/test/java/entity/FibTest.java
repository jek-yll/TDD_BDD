package entity;

import org.example.entity.Fib;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FibTest {

    private Fib fib;

    private void initFib(int range) {
        fib = new Fib(range);
    }

    @Test
    void testGetFibSeriesTestWhenRange1ArrayShouldNotEmpty(){
        Fib fib = new Fib(1);

        List<Integer> result = fib.getFibSeries();

        Assertions.assertFalse(result.isEmpty());
    }
    @Test
    void testGetFibSeriesWhenRange1ArrayShouldContain0(){
        Fib fib = new Fib(1);

        List<Integer> result = fib.getFibSeries();

        Assertions.assertEquals(0, result.get(0));
    }
    @Test
    void testGetFibSeriesWhenRange3ArrayShouldContain0(){
        Fib fib = new Fib(6);

        List<Integer> result = fib.getFibSeries();

        Assertions.assertTrue(result.contains(3));
    }
    @Test
    void testGetFibSeriesWhenRange3ArraySizeShouldEqual6(){
        Fib fib = new Fib(6);

        List<Integer> result = fib.getFibSeries();

        Assertions.assertEquals(6, result.size());
    }
    @Test
    void testGetFibSeriesWhenRange3ArrayShouldContain4(){
        Fib fib = new Fib(6);

        List<Integer> result = fib.getFibSeries();

        Assertions.assertFalse(result.contains(4));
    }
    @Test
    void testGetFibSeriesWhenRange3ArrayShouldEquals0_1_1_2_3_5(){
        Fib fib = new Fib(6);

        List<Integer> result = fib.getFibSeries();

        Assertions.assertTrue(result.containsAll(Arrays.asList(0,1,1,2,3,5)));
    }
    @Test
    void testGetFibSeriesWhenRange3ArrayShouldSorted(){
        Fib fib = new Fib(6);

        List<Integer> result = fib.getFibSeries();

        Assertions.assertEquals(Arrays.asList(0,1,1,2,3,5),result);

    }

}
