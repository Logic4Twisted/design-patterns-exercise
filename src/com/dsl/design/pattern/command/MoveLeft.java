/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.command;

public class MoveLeft implements IController
{
    private GameCharacter gameCharacter;

    public MoveLeft(GameCharacter gameCharacter)
    {
        this.gameCharacter = gameCharacter;
    }

    @Override
    public void execute()
    {
        gameCharacter.moveLeft();
    }

    @Override
    public void unexecute()
    {
        gameCharacter.undoMoveLeft();
    }
}
