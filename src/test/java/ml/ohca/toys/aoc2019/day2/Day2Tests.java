package ml.ohca.toys.aoc2019.day2;

import ml.ohca.toys.aoc2019.common.Common;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class Day2Tests {
    private final Day2 day;
    private final InputStream input;

    public Day2Tests() throws IOException {
        day = new Day2();
        input = Common.getDayInput(2);
    }

    @Test
    void testEasy() throws IOException {
        System.out.println(day.easy(input));
    }

    @Test
    void testHard() throws IOException {
        System.out.println(day.hard(input));
    }
}
