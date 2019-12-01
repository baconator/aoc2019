package ml.ohca.toys.aoc2019.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class Common {
    public static InputStream getDayInput(int day) throws IOException {
        return Objects.requireNonNull(
                Thread.currentThread()
                        .getContextClassLoader()
                        .getResource(String.format("day%sinput.txt", day)),
                String.format("Missing day %s input file!", day))
                .openStream();
    }
}
