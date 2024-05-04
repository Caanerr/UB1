public class MoveToFront {
        // Die Methode MovToFront wird dem Kopf der Liste und dem dateinamen aufgerufen
        public static void MoveToFront(Listen zeiger1, String dateiname) {
            //Der String ist nur für die Ausgaberelevant
            String methodenname = "MoveToFornt";
            int zahler = 0;
            //Erstellen einer neuen Liste mit dem ersten Wort der Liste
            Listen neuekopf = new Listen(zeiger1.getkey());
            //Schleife die die Liste mit allen Wörtern durchgeht
            while (zeiger1 != null) {
                //neue wird in der Schleife genutzt um die neue Schleife durchzugehen
                Listen neue = neuekopf;
                while (neue != null) {
                    if (zeiger1.getkey().equals(neue.getkey())) {
                        //Falls das Wort bereits in der neuen Liste steht wird der Zähler des Worts erhöht
                        neue.addcount();
                        zeiger1.addcount();
                        break;
                    } else {
                        //Sonst wird die Liste weiter durchlaufen bis es am Ende angekommen ist
                        neue = neue.getNext();
                        zahler++;
                    }
                }
                if (neue != null && neue.getcount() != 1 ) {
                    //Fall das Wort bereits in der neuen Liste vorhanden ist, wird es gelöscht und neu an den Anfang gehangen und der kopf der liste (neuekopf) wird auf diesen gesetzt
                    neue.delete();
                    neuekopf.infront(new Listen(zeiger1.getkey()));
                    neuekopf = neuekopf.getPrev();
                    neuekopf.setCounter(neuekopf.getcount());
                    zahler = zahler +2; //Zähler wird um Eins erhöht weil wir ein Schritt in der Liste nach vorne gehen und ein Element einfügen
                }else {
                    //falls es nict in der Liste ist, wird es an den Anfang gehangen und der kopf der liste (neuekopf) wird auf diesen gesetzt
                    neuekopf.infront(new Listen(zeiger1.getkey()));
                    neuekopf = neuekopf.getPrev();
                    zahler = zahler + 2; //Zähler wird um Zwei erhöht weil wir ein Schritt in der Liste nach vorne gehen und ein Element einfügen
                }
                zeiger1 = zeiger1.getNext(); //der Zeiger in der Hauptliste wird auf das nächste Element gesetzt
                zahler = zahler + 1; //Zähler wird um Eins erhöht weil wir ein Schritt in der Liste weitergehen
            }

            Ausgabe.ausgabe(dateiname, zahler, methodenname);
        }
}
