import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Naiv {
    //die Methode naiv wird mit dem Listenkopf
    public static void naiv(Listen zeiger1, String dateiname) {
        String Name = "Naiv"; //der Name der Methode ist nur für die Ausgabe relevant
        int zahler = 0;
        //Neue Liste wird erzeugt, wo das erste Element dem der Liste mit allen Wörtern entspricht
        Listen neuekopf = new Listen(zeiger1.getkey());

        //Schleife die die Liste mit allen Wörtern durchgeht
        while(zeiger1 != null){
            //neue wird in der Schleife genutzt um die neue Schleife durchzugehen
            Listen neue = neuekopf;

            while(neue !=null){
                if(zeiger1.getkey().equals(neue.getkey())){
                    //Falls das Wort bereits in der neuen Liste steht wird der Zähler des Worts erhöht
                    neue.addcount();
                    zeiger1.addcount();
                    break;
                }else {
                    //Sonst wird die Liste weiter durchlaufen bis es am Ende angekommen ist
                    neue = neue.getNext();
                    zahler++;
                }
            }
            if(zeiger1.getcount() == 1){
                //falls das wort nicht in der neune Liste ist, wird es hinten an die neue Liste gehangen
                neuekopf.append(new Listen(zeiger1.getkey()));
            }
            zeiger1 = zeiger1.getNext();
            zahler = zahler + 1;
            //zeiger2 wird auf den nächsten Knoten in der Liste mit allen Wörtern gesetzt
        }
        Ausgabe.ausgabe(dateiname, zahler, Name);
    }
}
