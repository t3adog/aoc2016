package ru.keptelr.day02;

import org.apache.commons.lang3.Range;

import java.util.List;

public class Day02 {

    private static final int[][] LOCK = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    private static final String[][] MODERN_LOCK = {
            {"x", "x", "1", "x", "x"},
            {"x", "2", "3", "4", "x"},
            {"5", "6", "7", "8", "9"},
            {"x", "A", "B", "C", "x"},
            {"x", "x", "D", "x", "x"},

    };

    public String partOne(List<String> input) {
        Range<Integer> xRange = Range.between(0, 2);
        Range<Integer> yRange = Range.between(0, 2);

        String result = "";

        int x = 1;
        int y = 1;

        for (String line : input) {
            for (Character character : line.toCharArray()) {
                switch (character) {
                    case 'U': {
                        if (xRange.contains(y - 1)) {
                            y--;
                        }
                        break;
                    }
                    case 'D': {
                        if (xRange.contains(y + 1)) {
                            y++;
                        }
                        break;
                    }
                    case 'L': {
                        if (yRange.contains(x - 1)) {
                            x--;
                        }
                        break;
                    }
                    case 'R': {
                        if (yRange.contains(x + 1)) {
                            x++;
                        }
                        break;
                    }
                }
            }
            result += String.valueOf(LOCK[y][x]);
        }

        return result;
    }

    public String partTwo(List<String> input) {
        Range<Integer> xRange = Range.between(0, 4);
        Range<Integer> yRange = Range.between(0, 4);

        String result = "";

        int x = 0;
        int y = 2;

        for (String line : input) {
            for (Character character : line.toCharArray()) {
                switch (character) {
                    case 'U': {
                        if (xRange.contains(y - 1) && !MODERN_LOCK[y - 1][x].equals("x")) {
                            y--;
                        }
                        break;
                    }
                    case 'D': {
                        if (xRange.contains(y + 1) && !MODERN_LOCK[y + 1][x].equals("x")) {
                            y++;
                        }
                        break;
                    }
                    case 'L': {
                        if (yRange.contains(x - 1) && !MODERN_LOCK[y][x - 1].equals("x")) {
                            x--;
                        }
                        break;
                    }
                    case 'R': {
                        if (yRange.contains(x + 1) && !MODERN_LOCK[y][x + 1].equals("x")) {
                            x++;
                        }
                        break;
                    }
                }
            }
            result += MODERN_LOCK[y][x];
        }

        return result;
    }

}
