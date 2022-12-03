package ru.keptelr.day01;

import lombok.Data;

@Data
public class Instruction {
    private int stepCount;
    private Direction direction;

    public Instruction(String instructionStr) {
        this.direction = Direction.fromString(String.valueOf(instructionStr.toCharArray()[0]).trim());
        this.stepCount = Integer.parseInt(instructionStr.replaceAll(String.valueOf(instructionStr.toCharArray()[0]), ""));
    }
}
