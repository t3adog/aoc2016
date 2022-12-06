package ru.keptelr.day02;

import org.apache.commons.lang3.Range;
import java.util.List;

public class Day02 {

    public static final int[][] intercom = {
            {1, 2, 3}, //00 01 02
            {4, 5, 6}, // 10 11 12
            {7, 8, 9} // 20 21 22
    };


    public int partOne(List<String> input) {
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
            result += String.valueOf(intercom[y][x]);
        }

        return Integer.parseInt(result);
    }

    public int partTwo(List<String> input) {
        return 0;
    }

}
