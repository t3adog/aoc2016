package ru.keptelr.day02;

import junit.framework.TestCase;
import org.junit.Assert;
import ru.keptelr.utils.InputParserUtil;

public class Day02Test extends TestCase {

    public void testPartOne() {
        Day02 day02 = new Day02();
        Assert.assertEquals("1985", day02.partOne(InputParserUtil.readFile("day02")));
    }

    public void testPartTwo() {
        Day02 day02 = new Day02();
        Assert.assertEquals("5DB3", day02.partTwo(InputParserUtil.readFile("day02")));
    }
}