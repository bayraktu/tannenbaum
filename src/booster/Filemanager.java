package booster;

import java.io.File;
import java.util.Scanner;

public class Filemanager {

    public File erstelleFile(){
        System.out.println("Wie soll das File heißen: ");
        String inputname;
        Scanner scanner = new Scanner(System.in);
        inputname = scanner.nextLine();
        File file = new File(inputname);

        /*
        String foldername = scanner.next();
        System.out.println("Schreibe den Namen des Ordners ein: ");
        foldername = foldername + scanner.next();

        boolean folder = file.mkdir();
        if(folder){
            System.out.println("Ordner für File wurde erstellt");
        } else{
            System.out.println("Fehler: Ordner konnte nicht erstellt werden");
        }
        */

        try{
            file.createNewFile();
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(inputname + " wurde erstellt und ist in : " + file.getAbsolutePath());
        return file;
    }
}
