package booster;

import java.util.ArrayList;
import java.util.Date;

public class Begenung {

    private String ort;

    private Date date;

    public Begenung(String ort, Date date){
        this.date=date;
        this.ort=ort;
    }

    private Mannschaft ermittleGewinner(Mannschaft mannschaft1, Mannschaft mannschaft2){
        return  mannschaft1;
    }

    public void starteBegenung(Mannschaft mannschaft1, Mannschaft mannschaft2){
        System.out.println("Begenung zwischen" + mannschaft1.getName() + " und " + mannschaft2.getName()+" hat gestartet");
        Mannschaft gewinner = ermittleGewinner(mannschaft1, mannschaft2);

        System.out.println("Mannschaft " +gewinner.getName() +" hat gewonnen");


        int marktwertVonMannschaft1 = errechneMarktwert(mannschaft1);
        System.out.println("Der Verein " + mannschaft1.getName() +" hat einen marktwert von:" + marktwertVonMannschaft1);

        int marktwertVonMannschaft2 = errechneMarktwert(mannschaft2);
        System.out.println("Der Verein " + mannschaft2.getName() +" hat einen marktwert von:" + marktwertVonMannschaft2);

    }

    private int errechneMarktwert(Mannschaft mannschaft){
        int marktwert = 0;
        ArrayList<Spieler> spielerListe = mannschaft.getSpieler();
        for (int i = 0; i < spielerListe.size(); i++){
            Spieler spieler = spielerListe.get(i);
            marktwert = marktwert + spieler.getMarktwert();
        }

        marktwert = marktwert + mannschaft.getGeld();

        return marktwert;
    }
}
