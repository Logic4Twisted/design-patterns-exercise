/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.command;

public class MoveBackward implements IController
{
    private GameCharacter gameCharacter;

    public MoveBackward(GameCharacter gameCharacter)
    {
        this.gameCharacter = gameCharacter;
    }

    @Override
    public void execute()
    {
        gameCharacter.moveBackward();
    }

    @Override
    public void unexecute()
    {
        gameCharacter.undoMoveBackward();
    }
}
