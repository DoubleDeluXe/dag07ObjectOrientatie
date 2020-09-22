package org.example.DaveLevi.dag07ObjectOrientatie;

public class Persoon {
    private int id;
    private String naam;
    private int leeftijd;
    private Persoon fiscaalPartner;
    private static final int minLeeftijd = 18;
    private static int aantalPersonen;

    public Persoon() {
        this(0, null);
    }
    public Persoon(int newId, String newNaam){
        this(newId,newNaam, minLeeftijd);
    }
    public Persoon(int newId, String newNaam, int newLeeftijd){
        this(newId, newNaam, newLeeftijd, null);
    }
    public Persoon(int newId, String newNaam, int newLeeftijd, Persoon newFiscaalPertner){
        setStateObject(newId, newNaam, newLeeftijd, newFiscaalPertner);
    }

    private void setStateObject(int newId, String newNaam, int newLeeftijd, Persoon newfiscaalPartner){
        gezichtenBoek(true);
        setId(newId);
        setNaam(newNaam);
        setLeeftijd(newLeeftijd);
        setFiscalePartner(newfiscaalPartner);
    }
    void gezichtenBoek(boolean toevoeging) {
        if (toevoeging = true) {
            aantalPersonen++;
            int maxAantalPersonen = 6;
            if (aantalPersonen == maxAantalPersonen) { //Als capaciteit bereikt is
                System.out.println("Capaciteit bereikt");
            }
        } else {
            aantalPersonen--;
            if (aantalPersonen == 0) {
                System.out.println("Er is niemand meer aanwezig");
            }
        }
    }
    public static int getAantalPersonen(){
        return aantalPersonen;
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
    public void setId(int newId) {
        //controles, als ok dan state aanpassen
        id = newId;
    }
    void setNaam(String newNaam) {
        //controles, als ok dan state aanpassen
        naam = newNaam;
    }
    void setLeeftijd(int newLeeftijd) {
        //controles, als ok dan state aanpassen
        if (newLeeftijd < minLeeftijd){

        }

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
    public static int getMinLeeftijd() {
        return minLeeftijd;
    }
}