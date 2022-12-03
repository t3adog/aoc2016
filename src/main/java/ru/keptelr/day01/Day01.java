package ru.keptelr.day01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day01 {
    public int partOne(List<String> input) {

        List<Instruction> instructions = new ArrayList<>();

        for (String str : input) {
            instructions.addAll(List.of(str.split(", ")).stream().map(Instruction::new).collect(Collectors.toList()));
        }

        Orientation currentOrientation = Orientation.north;
        int x = 0;
        int y = 0;

        for (Instruction instruction : instructions) {
            currentOrientation = swithOrientation(currentOrientation, instruction);
            switch (currentOrientation) {
                case north: {
                    x += instruction.getStepCount();
                    break;
                }
                case east: {
                    y += instruction.getStepCount();
                    break;
                }
                case south: {
                    x -= instruction.getStepCount();
                    break;
                }
                case west: {
                    y -= instruction.getStepCount();
                    break;
                }
            }
        }

        return Math.abs(x + y);
    }

    public int partTwo(List<String> input) {
        List<Instruction> instructions = new ArrayList<>();
        List<Position> positions = new ArrayList<>();

        for (String str : input) {
            instructions.addAll(List.of(str.split(", ")).stream().map(Instruction::new).collect(Collectors.toList()));
        }

        Orientation currentOrientation = Orientation.north;
        int x = 0;
        int y = 0;

        for (Instruction instruction : instructions) {
            currentOrientation = swithOrientation(currentOrientation, instruction);
            switch (currentOrientation) {
                case north: {
                    for (int i = 0; i < instruction.getStepCount(); i++) {
                        x += 1;
                        Position position = new Position(x, y);
                        if (positions.contains(position)) {
                            return Math.abs(position.getX() + position.getY());
                        } else {
                            positions.add(position);
                        }
                    }
                    break;
                }
                case east: {
                    for (int i = 0; i < instruction.getStepCount(); i++) {
                        y += 1;
                        Position position = new Position(x, y);
                        if (positions.contains(position)) {
                            return Math.abs(position.getX() + position.getY());
                        } else {
                            positions.add(position);
                        }
                    }
                    break;
                }
                case south: {
                    for (int i = 0; i < instruction.getStepCount(); i++) {
                        x -= 1;
                        Position position = new Position(x, y);
                        if (positions.contains(position)) {
                            return Math.abs(position.getX() + position.getY());
                        } else {
                            positions.add(position);
                        }
                    }
                    break;
                }
                case west: {
                    for (int i = 0; i < instruction.getStepCount(); i++) {
                        y -= 1;
                        Position position = new Position(x, y);
                        if (positions.contains(position)) {
                            return Math.abs(position.getX() + position.getY());
                        } else {
                            positions.add(position);
                        }
                    }
                    break;
                }
            }
        }

        throw new RuntimeException("Can't find position");
    }

    private Orientation swithOrientation(Orientation currentOrientation, Instruction instruction) {
        switch (currentOrientation) {
            case north: {
                if (instruction.getDirection() == Direction.right) {
                    return Orientation.east;
                }
                return Orientation.west;
            }
            case east: {
                if (instruction.getDirection() == Direction.right) {
                    return Orientation.south;
                }
                return Orientation.north;
            }
            case south: {
                if (instruction.getDirection() == Direction.right) {
                    return Orientation.west;
                }
                return Orientation.east;
            }
            default:
            case west: {
                if (instruction.getDirection() == Direction.right) {
                    return Orientation.north;
                }
                return Orientation.south;
            }
        }
    }
}
