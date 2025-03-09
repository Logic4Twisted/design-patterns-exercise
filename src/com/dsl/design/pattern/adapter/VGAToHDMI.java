/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.adapter;

public class VGAToHDMI implements HDMI
{
    VGA vga;

    public VGAToHDMI(VGA vga)
    {
        this.vga = vga;
    }

    @Override
    public void doHDMIStuff()
    {
        vga.doVGAStuff();
        System.out.println("Connect VGA to HDMI");
    }
}
