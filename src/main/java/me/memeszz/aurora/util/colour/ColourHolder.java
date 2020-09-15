/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package me.memeszz.aurora.util.colour;

import java.awt.*;

public class ColourHolder {
    int r;
    int g;
    int b;
    int a;

    public ColourHolder(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = 255;
    }

    public ColourHolder(int r, int g, int b, int a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }



    public ColourHolder darker() {
        return new ColourHolder(Math.max(this.r - 10, 0), Math.max(this.g - 10, 0), Math.max(this.b - 10, 0), this.getA());
    }



    public void becomeHex(int hex) {
        this.setR((hex & 16711680) >> 16);
        this.setG((hex & 65280) >> 8);
        this.setB(hex & 255);
        this.setA(255);
    }

    public static ColourHolder fromHex(int hex) {
        ColourHolder n = new ColourHolder(0, 0, 0);
        n.becomeHex(hex);
        return n;
    }

    public static int toHex(int r, int g, int b) {
        return -16777216 | (r & 255) << 16 | (g & 255) << 8 | b & 255;
    }

    public int toHex() {
        return toHex(this.r, this.g, this.b);
    }

    public int getB() {
        return this.b;
    }

    public int getG() {
        return this.g;
    }

    public int getR() {
        return this.r;
    }

    public int getA() {
        return this.a;
    }

    public ColourHolder setR(int r) {
        this.r = r;
        return this;
    }

    public ColourHolder setB(int b) {
        this.b = b;
        return this;
    }

    public ColourHolder setG(int g) {
        this.g = g;
        return this;
    }

    public ColourHolder setA(int a) {
        this.a = a;
        return this;
    }


    public ColourHolder clone() {
        return new ColourHolder(this.r, this.g, this.b, this.a);
    }

    public Color toJavaColour() {
        return new Color(this.r, this.g, this.b, this.a);
    }
}

