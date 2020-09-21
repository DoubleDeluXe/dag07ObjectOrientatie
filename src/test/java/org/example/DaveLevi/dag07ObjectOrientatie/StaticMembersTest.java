package org.example.DaveLevi.dag07ObjectOrientatie;

import org.junit.jupiter.api.Test;

public class StaticMembersTest {

    @Test
    void telhetAantalAangemaaktePersonen() {
        Persoon p1 = new Persoon(11, "Jerry");
        Persoon p2 = new Persoon(12, "Bo", 20);
        Persoon p3 = new Persoon(13, "Harry", 42, p2);
        System.out.println(Persoon.getAantalPersonen());

    }

}
