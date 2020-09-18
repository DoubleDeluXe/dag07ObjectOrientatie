package org.example.DaveLevi.dag07ObjectOrientatie;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
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
        Persoon perx = new Persoon(2,"Dennis",12);
        System.out.println(perx.toStringVoorbeeld());
    }

    @Test
    void animalconstructor() {
        Animals chicken = new Animals("Chicken", 2, true, "Brown", 11);
        System.out.println(chicken.toString());
    }
    @Test
    void maakEenEventuelefiscaalPartner() {
        Persoon joris = new Persoon(12, "joris", 54);
        Persoon fiscalePartnerVanJoris = new Persoon(7, "Gerrie", 54);
        Persoon sjoerd = new Persoon(1, "Sjoerd", 58);
        Persoon fiscalePartnerVanSjoerd = new Persoon(5, "Miranda", 54);
        sjoerd.setFiscalePartner(fiscalePartnerVanSjoerd);
        joris.setFiscalePartner(fiscalePartnerVanJoris);

        Persoon [] personenArray = {sjoerd, joris};

        maakOverzichtPersoonEnFiscaalPartner(personenArray);

    }

    void maakOverzichtPersoonEnFiscaalPartner(Persoon[] persoonNaam) {
        // is maan van persoon plus id van fiscale partner
        for (int i = 0; i < persoonNaam.length; i++) {
            System.out.println("id = " + persoonNaam[i].getId() +
                    " Naam = " + persoonNaam[i].getNaam() +
                    " Leeftijd = " + persoonNaam[i].getLeeftijd() +
                    " Naam Fiscaal partner = " + persoonNaam[i].getFiscaalPartner().getNaam() +
                    " ID fiscvaal partner = " + persoonNaam[i].getFiscaalPartner().getId());
        }
    }
    @Test
    void watWordtErUitgeprint() {
        Persoon voorbeeld1 = new Persoon(1, "fredje", 25);
        Persoon voorbeeld2 = voorbeeld1;
        voorbeeld2.setLeeftijd(22);

        System.out.println(voorbeeld1.getLeeftijd());
    }



}
