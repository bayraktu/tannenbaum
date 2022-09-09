package booster;

public class Spieler {

    public Spieler (String name, int alter, int marktwert){
        this.name=name;
        this.alter=alter;
        this.marktwert=marktwert;
    }

    private String name;
    private int alter;
    private int marktwert;
    private boolean lizens;

    public void lizensErteilen(){
        lizens=true;
    }
    public void lizensEntziehen(){
        lizens=false;
    }
    public void setMarktwert(int marktwert) {
        this.marktwert = marktwert;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }

    public int getMarktwert() {
        return marktwert;
    }

}
