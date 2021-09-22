package com.typecast.model;

public class ExplicitCast {

    public ExplicitCast(){};

    public float doExplicitCastOfDouble(double v)
    {
        return (float) v;
    }

    public long doExplicitCastOfFloat(float v)
    {
        return (long) v;
    }

    public int doExplicitCastOfLong(long v)
    {
        return (int) v;
    }

    public short doExplicitCastOfInt(int v)
    {
        return (short) v;
    }

    public byte doExplicitCastOfShort(short v)
    {
        return (byte) v;
    }
}
