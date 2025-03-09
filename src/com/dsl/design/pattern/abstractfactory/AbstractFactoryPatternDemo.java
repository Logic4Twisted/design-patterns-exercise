/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.abstractfactory;

public class AbstractFactoryPatternDemo
{
    public static void main(String[] args)
    {
        ExternalFactory gamingFactory = new GamingExternalFactory();
        ExternalFactory basicFactory = new BasicExternalFactory();

        IHardware mouse = gamingFactory.createMouse();
        mouse.create();

        IHardware mouse2 = basicFactory.createMouse();
        mouse2.create();

        IHardware keyboard = gamingFactory.createKeyboard();
        keyboard.create();

        IHardware keyboard2 = basicFactory.createKeyboard();
        keyboard2.create();
    }
}
