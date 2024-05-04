import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Einlesen {
        //Methode zum Einlesen der Text datein und Zeilenweise einfügen in eine Doppekltverkettete Liste
        public static Listen lesen(String x){

            File datei = new File(x); // Erzeugt ein neues File-Objekt mit dem Dateinamen x
            Scanner scan = null;  // Initialisiert einen Scanner, um die Datei einzulesen
            try {
                scan = new Scanner(datei); // Versucht, die Datei zu öffnen und den Scanner zu initialisieren
            } catch (
                    FileNotFoundException e){
                System.out.println("Die Datei" + x + "wurde nicht gefunden!"); // Fehlermeldung, falls die Datei nicht gefunden wird
            }
            String Zeile = scan.nextLine(); // Liest die erste Zeile der Datei ein (Annahme: Die erste Zeile ist keine Wort / nur die Anzahl von Wörter im Text)
            Zeile = scan.nextLine(); // Liest die zweite Zeile ein, die das erste Wort enthält
            Listen aktuell = new Listen(Zeile); // Erstellt den ersten Listen-Knoten mit dem ersten Wort
            aktuell.setkey(Zeile); // Setzt das Schlüsselwort des ersten Knotens auf das eingelesene Wort
            Listen kopf = aktuell; // Merkt sich den Kopf der Liste für die Rückgabe

            //Liest die ganze .txt Datei ein
            while(scan.hasNextLine()){
                try {
                    Zeile = scan.nextLine(); // Liest die nächste Zeile der Datei ein
                    Listen nächstesElement = new Listen(Zeile);  // Erstellt einen neuen Listen-Knoten mit dem eingelesenen Wort
                    nächstesElement.setPrev(aktuell); // Setzt den vorherigen Knoten des neuen Knotens auf den aktuellen Knoten
                    aktuell.setNext(nächstesElement);   // Setzt den nächsten Knoten des aktuellen Knotens auf den neuen Knoten
                    aktuell = nächstesElement; // Aktualisiert den aktuellen Knoten auf den neuen Knoten
                }catch (NullPointerException e) {
                    break; // Beendet die Schleife, wenn es keine weiteren Zeilen in der Datei gibt
                }
            }
        return kopf; // Gibt den Kopf der Liste zurück
        }
}
