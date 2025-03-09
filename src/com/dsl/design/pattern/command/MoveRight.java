/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.command;

public class MoveRight implements IController
{
    private GameCharacter gameCharacter;

    public MoveRight(GameCharacter gameCharacter)
    {
        this.gameCharacter = gameCharacter;
    }

    @Override
    public void execute()
    {
        gameCharacter.moveRight();
    }

    @Override
    public void unexecute()
    {
        gameCharacter.undoMoveRight();
    }
}
