import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Hier werden nur alle Methoden mit allen Dateine aufgerufen, wichtig ist das die Dateinen sich im Selben Ordner wie das Programm befinden.
        String x = "Silber.txt";
        String y = "winnetou.txt";
        String z = "beide.txt";
        Naiv.naiv(Einlesen.lesen(x), x );
        MoveToFront.MoveToFront(Einlesen.lesen(x), x);
        Naiv.naiv(Einlesen.lesen(y),y);
        MoveToFront.MoveToFront(Einlesen.lesen(y),y);
        Naiv.naiv(Einlesen.lesen(z),z);
        MoveToFront.MoveToFront(Einlesen.lesen(z),z);
    }
}