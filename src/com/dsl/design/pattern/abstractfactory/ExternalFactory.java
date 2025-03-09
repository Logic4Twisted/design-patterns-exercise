package com.dsl.design.pattern.abstractfactory;

public interface ExternalFactory {
    public IHardware createMouse();
    public IHardware createKeyboard();
    
}
