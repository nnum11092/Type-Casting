package com.typecast.model;

public class ImplicitCast {

    byte aByte = 100;

    public ImplicitCast() {};

    public short doImplicitCastOfByte()
    {
        short a = aByte;
        return a;
    }

    public short doImplicitCastOfByte(byte aByte)
    {
        short a = aByte;
        return a;
    }

    public int doImplicitCastOfShort(short i)
    {
        int a = i;
        return a;
    }

    public long doImplicitCastOfInt(int i)
    {
        long a = i;
        return a;
    }

    public float doImplicitCastOfLong(long i)
    {
        float a = i;
        return a;
    }

    public double doImplicitCastOfDouble(float i)
    {
        double a = i;
        return a;
    }

}
