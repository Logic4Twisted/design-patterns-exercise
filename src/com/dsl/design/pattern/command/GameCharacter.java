/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.command;

public class GameCharacter
{
    private String name;
    private int moveForwardCount;
    private int moveLeftCount;
    private int moveRightCount;
    private int moveBackwardCount;

    public GameCharacter() {}

    public GameCharacter(String name)
    {
        this.name = name;
        this.moveForwardCount = 0;
        this.moveLeftCount = 0;
        this.moveRightCount = 0;
        this.moveBackwardCount = 0;
    }

    public String getName() {
        return name;
    }

    public void moveForward() {
        moveForwardCount++;
        System.out.println(name + " moved forward");
    }

    public void moveLeft() {
        moveLeftCount++;
        System.out.println(name + " moved left");
    }

    public void moveRight() {
        moveRightCount++;
        System.out.println(name + " moved right");
    }

    public void moveBackward() {
        moveBackwardCount++;
        System.out.println(name + " moved backward");
    }

    public void undoMoveForward() {
        moveForwardCount--;
        System.out.println(name + " undid move forward");
    }

    public void undoMoveLeft() {
        moveLeftCount--;
        System.out.println(name + " undid move left");
    }

    public void undoMoveRight() {
        moveRightCount--;
        System.out.println(name + " undid move right");
    }

    public void undoMoveBackward() {
        moveBackwardCount--;
        System.out.println(name + " undid move backward");
    }

    public int getMoveForwardCount() {
        return moveForwardCount;
    }

    public int getMoveLeftCount() {
        return moveLeftCount;
    }

    public int getMoveRightCount() {
        return moveRightCount;
    }

    public int getMoveBackwardCount() {
        return moveBackwardCount;
    }
}
