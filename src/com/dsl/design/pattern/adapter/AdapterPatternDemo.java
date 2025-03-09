/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.design.pattern.adapter;


public class AdapterPatternDemo
{
    public static void main(String[] args)
    {
        VGA adaptor = new HDMIToVGA(new HDMIImpl());
        adaptor.doVGAStuff();

        HDMI adaptor2 = new VGAToHDMI(new VGAImpl());
        adaptor2.doHDMIStuff();
    }
}
