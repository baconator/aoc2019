package ml.ohca.toys.aoc2019.day1;

import ml.ohca.toys.aoc2019.common.Common;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

class Day1Tests {
    private final Day1 day;
    private final InputStream input;

    Day1Tests() throws IOException {
        day = new Day1();
        input = Common.getDayInput(1);
    }

    @Test
    void testEasy() throws IOException {
        System.out.println(day.easy(input));
    }

    @Test
    void testHardSum() {
        Assertions.assertEquals(50346, day.totalFuelCost(100756));
    }

    @Test
    void testHard() throws IOException {
        System.out.println(day.hard(input));
    }
}