import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ausgabe {

    public static void ausgabe(String dateiname, int zahler, String Name){
        //Setzt den String Zeile auf die Erste Zeil des Textdokuments und nutzt dafür einen Scanner
        File datei = new File(dateiname);
        Scanner scan = null;
        try {
            scan = new Scanner(datei);
        } catch (
                FileNotFoundException e){
            System.out.println("Die Datei" + dateiname + "wurde nicht gefunden!");
        }

        //Ausgabe die in der Console zu sehen ist
        String Zeile = scan.nextLine();
        System.out.println(Name);
        System.out.println("Die Wörter im Text Betragen: " + Zeile);
        System.out.println("Die Listenoperationen von " + dateiname + " beträgt :" + zahler);
        System.out.println(" ");
    }
}
