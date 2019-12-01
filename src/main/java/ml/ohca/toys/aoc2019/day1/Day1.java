package ml.ohca.toys.aoc2019.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class Day1 {
    long totalFuelCost(double original) {
        var sum = 0;
        var current = original;
        while (current > 0) {
            current = Math.max(0, Math.round(Math.floor(current / 3) - 2));
            sum += current;
        }
        return Math.round(sum);
    }

    long easy(InputStream input) throws IOException {
        try (var reader = new BufferedReader(new InputStreamReader(input))) {
            return reader.lines()
                    .mapToDouble(Double::parseDouble)
                    .mapToLong(d -> Math.round(Math.floor(d / 3) - 2))
                    .sum();
        }
    }

    long hard(InputStream input) throws IOException {
        try (var reader = new BufferedReader(new InputStreamReader(input))) {
            return reader.lines()
                    .mapToDouble(Double::parseDouble)
                    .mapToLong(this::totalFuelCost)
                    .sum();
        }
    }

}
