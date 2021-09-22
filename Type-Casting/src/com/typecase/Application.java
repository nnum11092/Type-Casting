package com.typecase;

import com.typecast.model.ExplicitCast;
import com.typecast.model.ImplicitCast;

public class Application {

    public static void main(String[] args) {

        /**
         * implicit wait
         */
        byte b = 100;
        ImplicitCast implicitCast = new ImplicitCast();

        //casting byte to short
        short i = implicitCast.doImplicitCastOfByte(b);
        System.out.println("short value from byte - " + i);

        //casting short to long
        long l = implicitCast.doImplicitCastOfInt(implicitCast.doImplicitCastOfShort(i));
        System.out.println("long value from short - " + l);

        /**
         * explicit wait
         */
        ExplicitCast explicitCast = new ExplicitCast();

        //casting long to int
        int explicitVariable1 = explicitCast.doExplicitCastOfLong(l);
        System.out.println("long value to int value - "+explicitVariable1);

        //casting long to int
        short explicitVariable2 = explicitCast.doExplicitCastOfInt(explicitVariable1);
        System.out.println("long value to int value - "+explicitVariable2);
    }
}
