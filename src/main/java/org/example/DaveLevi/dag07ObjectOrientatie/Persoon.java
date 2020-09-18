package org.example.DaveLevi.dag07ObjectOrientatie;

public class Persoon {
    private int id;
    private String naam;
    private int leeftijd;
    private Persoon fiscaalPartner;


    //De constructor die geenparameters heeft wordt ook wel
    //de default constructor genoemd
    Persoon(){
        setId(0);
        setNaam(null);
        setLeeftijd(18);
        setFiscalePartner(null);
    }
    Persoon(int newId, String newNaam, int newLeeftijd){
        //id = newId;
        setId(newId);
        //naam = newNaam;
        setNaam(newNaam);
        //leeftijd = newLeeftijd;
        setLeeftijd(newLeeftijd);

    }

    //Dit word ook wel een contructor genoemd
    Persoon(int newId, String newNaam, int newLeeftijd, Persoon newPartner){
        //id = newId;
        setId(newId);
        //naam = newNaam;
        setNaam(newNaam);
        //leeftijd = newLeeftijd;
        setLeeftijd(newLeeftijd);
        setFiscalePartner(newPartner);
    }

    int getId() {
        return id;
    }
    String getNaam() {
        return naam;
    }
    int getLeeftijd() {
        return leeftijd;
    }
    void setId(int newId) {
        //controles, als ok dan state aanpassen
        id = newId;
    }
    void setNaam(String newNaam) {
        //controles, als ok dan state aanpassen
        naam = newNaam;
    }
    void setLeeftijd(int newLeeftijd) {
        //controles, als ok dan state aanpassen
        leeftijd = newLeeftijd;
    }

    void setFiscalePartner(Persoon newFiscalePartner) {
        fiscaalPartner = newFiscalePartner;
    }

    Persoon getFiscaalPartner() {
        return fiscaalPartner;
    }

    String toStringVoorbeeld() {
        return "persoon[id = " + id + " name = " + naam + " leeftijd = " + leeftijd + "]";
    }


}
