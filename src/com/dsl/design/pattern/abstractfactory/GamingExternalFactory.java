package com.dsl.design.pattern.abstractfactory;

public class GamingExternalFactory implements ExternalFactory
{
    @Override
    public IHardware createMouse()
    {
        return new GamingMouse();
    }

    @Override
    public IHardware createKeyboard()
    {
        return new GamingKeyboard();
    }
}