public class Main {
    public static void main(String[] args) {

        Ugur ugur = new Ugur();
        Mueyessernur mueyessernur = new Mueyessernur();
        Gabriel gabriel = new Gabriel();
        Sum sum = new Sum();
        Yasin yasin = new Yasin();

        System.out.println(ugur.greetings());
        System.out.println("Wie heißen" + gabriel.getUnserName());
        System.out.println("Wir erledigen folgende Aufgaben" + yasin.getUnsereAufgaben());
        System.out.println("Uns Zeichnet aus dass wir" + mueyessernur.getEigenschaften());
        System.out.println("Wir sind am besten in" + sum.getDieBesteSache());
    }
}
