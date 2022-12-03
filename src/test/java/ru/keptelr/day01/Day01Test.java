package ru.keptelr.day01;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ru.keptelr.utils.InputParserUtil;

public class Day01Test {

    @Test
    public void testPartOne() {
        Day01 day01 = new Day01();
        Assert.assertEquals(5, day01.partOne(List.of("R2, L3")));
        Assert.assertEquals(2, day01.partOne(List.of("R2, R2, R2")));
        Assert.assertEquals(12, day01.partOne(List.of("R5, L5, R5, R3")));
    }

    @Test
    public void testPartTwo() {
        Day01 day01 = new Day01();
        Assert.assertEquals(4, day01.partTwo(List.of("R8, R4, R4, R8")));
    }
}
