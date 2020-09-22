package org.example.DaveLevi.dag07ObjectOrientatie;

import org.junit.jupiter.api.Test;

public class StaticMembersTest {

public static final double E = Math.PI;

    @Test
    void constantsFromMath() {
        System.out.println(Math.PI);
        for (int i = 0; i <= 10; i++){
            System.out.print(i + ": ");
            System.out.printf("%.3f", 10 * Math.log10(i));
            System.out.println();
        }
    }
}
