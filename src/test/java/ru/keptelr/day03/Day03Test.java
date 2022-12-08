package ru.keptelr.day03;

import junit.framework.TestCase;
import org.junit.Assert;
import ru.keptelr.day02.Day02;
import ru.keptelr.utils.InputParserUtil;

public class Day03Test extends TestCase {

    public void testPartOne() {
        Day03 day03 = new Day03();
        Assert.assertEquals(0, day03.partOne(InputParserUtil.readFile("day03")));
    }

    public void testPartTwo() {
        Day03 day03 = new Day03();
        Assert.assertEquals(0, day03.partTwo(InputParserUtil.readFile("day03")));
    }
}