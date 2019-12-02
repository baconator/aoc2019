package ml.ohca.toys.aoc2019.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

class Day2 {
    int easy(InputStream input) throws IOException {
        try (var reader = new BufferedReader(new InputStreamReader(input))) {
            var line = reader.readLine();
            var opcodes = Arrays.stream(line.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            opcodes[1] = 12;
            opcodes[2] = 2;
            execute(opcodes);
            return opcodes[0];
        }
    }

    int hard(InputStream input) throws IOException {
        try (var reader = new BufferedReader(new InputStreamReader(input))) {
            var line = reader.readLine();
            var originalOpcodes = Arrays.stream(line.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int noun = 0; noun < 99; noun += 1) {
                for (int verb = 0; verb < 99; verb += 1) {
                    var opcodes = Arrays.copyOf(originalOpcodes, originalOpcodes.length);
                    opcodes[1] = noun;
                    opcodes[2] = verb;
                    execute(opcodes);
                    if (opcodes[0] == 19690720) {
                        return 100 * noun + verb;
                    }
                }
            }
            throw new IllegalStateException("Couldn't find a valid pair!");
        }
    }

    private void execute(int[] opcodes) {
        for (int i = 0; i < opcodes.length; i += 4) {
            var opcode = opcodes[i];
            if (opcode == 1) {
                opcodes[opcodes[i + 3]] = opcodes[opcodes[i + 1]] + opcodes[opcodes[i + 2]];
            } else if (opcode == 2) {
                opcodes[opcodes[i + 3]] = opcodes[opcodes[i + 1]] * opcodes[opcodes[i + 2]];
            } else if (opcode == 99) {
                break;
            } else {
                throw new IllegalStateException("Failed to parse!");
            }
        }
    }
}
