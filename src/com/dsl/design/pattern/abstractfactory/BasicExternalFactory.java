package com.dsl.design.pattern.abstractfactory;

public class BasicExternalFactory implements ExternalFactory
{
    @Override
    public IHardware createMouse()
    {
        return new BasicMouse();
    }

    @Override
    public IHardware createKeyboard()
    {
        return new BasicKeyboard();
    }
    
}
