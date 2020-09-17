package org.example.DaveLevi.dag07ObjectOrientatie;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class Dag07Objecten {

    //Voorbeeld van overloading
    void name(){
    }
    //Voorbeeld van overloading
    void name(int x){
    }


    @Test
    void objectenMakenMetDeNewOperator() {
        Persoon persoonVariable = new Persoon();

        System.out.println(persoonVariable.getId());
        System.out.println(persoonVariable.getLeeftijd());
        System.out.println(persoonVariable.getNaam());
        assertThat(persoonVariable).isNotNull();
    }


    @Test
    void objectenAanmaken() {
        Persoon persoonVariable = new Persoon();
//        persoonVariable.id = 1;
//       persoonVariable.naam = "Sam";
//        persoonVariable.leeftijd = 22;
        persoonVariable.setId(1);
        persoonVariable.setNaam("Sam");
        persoonVariable.setLeeftijd(25);
        // PAS VANAF DIT PUNT KUNNEN WE IETS
        System.out.println(persoonVariable.getId());
        System.out.println(persoonVariable.getLeeftijd());
        System.out.println(persoonVariable.getNaam());
        assertThat(persoonVariable).isNotNull();
    }

    @Test
    void kanHetSneller() {
//        Persoon persoon(2,"Rein", 28);
    }

    @Test
    void eenDerdeConstructor(){
        Persoon persoon = new Persoon(2,"Dennis",12);
        System.out.println(Persoon.toStringVoorbeeld);
    }


}
