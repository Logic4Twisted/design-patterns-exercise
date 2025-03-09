/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.adapter;

public class HDMIToVGA implements VGA
{
    HDMI hdmi;

    public HDMIToVGA(HDMI hdmi)
    {
        this.hdmi = hdmi;
    }

    @Override
    public void doVGAStuff()
    {
        hdmi.doHDMIStuff();
        System.out.println("Connect HDMI to VGA");
    }
}
