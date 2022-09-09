package booster;
import java.util.ArrayList;

//Abhängig von der Spielerklasse!

public class Mannschaft {
    private String name;
    private ArrayList<Spieler> spielerListe = new ArrayList();



    //Konstruktor
    public Mannschaft(String name) {
        this.name = name;
    }

    //Methoden
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSpieler(Spieler spieler){
        spielerListe.add(spieler);
        System.out.println("Spieler " + spieler.getName() + " spielt jetzt bei " + this.getName() + "!");
    }

    public void removeSpieler(Spieler spieler){
        //Kontrolliert zuerst, ob der Spieler überhaupt teil der Mannschaft ist.
        if (this.spielerListe.contains(spieler)){
            spielerListe.remove(spieler);
            System.out.println(spieler.getName() + " wurde erfolgreich aus dem Team entfernt!");
        } else{
            System.out.println(spieler.getName() + " ist nicht teil dieser Mannschaft!");
        }
    }

    @Override
    public String toString() {
        return "Mannschaft " + name + "\n" +
                "Spieler: " + spielerListe;
    }
}
