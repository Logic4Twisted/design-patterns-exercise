/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.command;

public class MoveForward implements IController
{
    private GameCharacter gameCharacter;

    public MoveForward(GameCharacter gameCharacter)
    {
        this.gameCharacter = gameCharacter;
    }

    @Override
    public void execute()
    {
        gameCharacter.moveForward();
    }

    @Override
    public void unexecute()
    {
        gameCharacter.undoMoveForward();
    }
}
