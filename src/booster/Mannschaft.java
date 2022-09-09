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
        spieler.setMannschaft(this.name);
        System.out.println("Spieler " + spieler.getName() + " spielt jetzt bei " + this.getName() + "!");
    }

    public void removeSpieler(Spieler spieler){
        //Kontrolliert zuerst, ob der Spieler überhaupt teil der Mannschaft ist.
        if (this.spielerListe.contains(spieler)){
            spielerListe.remove(spieler);
            System.out.println(spieler.getName + " wurde erfolgreich aus dem Team entfernt!");
        } else{
            System.out.println(spieler.getName + " ist nicht teil dieser Mannschaft!");
        }
    }

    public int transferSpieler(Spieler spieler, Mannschaft neueMannschaft){
        //Kontrolliert zuerst, ob der Spieler überhaupt teil der Mannschaft ist.
        if (this.spielerListe.contains(spieler)){
            spielerListe.remove(spieler);
        } else{
            System.out.println(spieler.getName + " ist nicht teil dieser Mannschaft!");
            //Fehlermeldung die abgefragt werden kann. Könnte auch eine Exception sein.
            return 1;
        }
        //Wenn der Spieler erfolgreich aus dem alten Team entfernt wurde,
        // kann er dem neuem hinzugefügt werden.
        neueMannschaft.addSpieler(spieler);
        spieler.setMannschaft(neueMannschaft.getName());
        System.out.println(spieler.getName + " wurde erfolgreich transferiert!");
        return 0;
    }

    @Override
    public String toString() {
        return "Mannschaft " + name + "\n" +
                "Spieler: " + spielerListe;
    }
}
