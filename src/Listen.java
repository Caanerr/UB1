
// Klasse Listen repräsentiert eine eigene doppelt verkettete Liste
public class Listen {
    private String key; //Die Wörte
    private int count;  //Anzahl der Wörter
    private Listen next; //Nächster Knoten
    private Listen prev; // Vorheriger Knoten
    // Konstruktor für die Initialisierung eines Listen-Knotens mit einem Schlüsselwort
    public Listen(String key){
        this.key = key;
        this.count = 1;
        this.next = null;
        this.prev = null;
    }
    //Setter-Methode für die Anzahl der Wörter
    public void setCounter (int count){
        this.count = count;
    }
    //Setter-Methode für das Wort eines Knotens
    public void setkey (String key){
        this.key = key;
    }
    //Getter-Methode für das Wort eines Knotens
    public String getkey(){
        return this.key;
    }
    //Methode um den Zähler um 1 zu erhöhen
    public void addcount (){
        this.count = count+1;
    }
    //Getter-Methode für die Anzahl der Wörter
    public int getcount(){
        return this.count;
    }
    //Getter-Methode für den Knoten vor dem Knoten
    public Listen getPrev() {
        return prev;
    }
    //Setter-Methode für den Knoten vor dem Knoten
    public void setPrev(Listen prev) {
        this.prev = prev;
    }
    //Getter-Methode für den nächsten Knoten von dem Knoten
    public Listen getNext() {
        return this.next;
    }
    //Setter-Methode für den nächsten Knoten von dem Knoten
    public void setNext(Listen next) {
        this.next = next;
    }
    // Methode zum Anhängen eines Knotens am Ende der Liste
    public void append(Listen Ende){
            Listen zeiger = this.next;
            Listen aktuell = this;
            while (zeiger != null) {
                zeiger = zeiger.next;
                aktuell = aktuell.next;
            }
            aktuell.next = Ende;
            Ende.prev = aktuell;
    }
    // Methode zum Zählen aller Vorkommen in der Liste
    public int countall(){
        Listen zeiger = this.prev;
        Listen aktuell = this;
        while (zeiger != null){
            zeiger = zeiger.prev;
            aktuell = aktuell.prev;
        }
        int count = 0;
        while (aktuell != null){
            count = count + aktuell.getcount();
            aktuell = aktuell.next;
        }
        return count;
    }
    // Methode für die Rückgabe des letzen Knotens
    public Listen ende(){
        Listen zeiger = this.next;
        Listen aktuell = this;
        while (zeiger != null){
            zeiger = zeiger.next;
            aktuell = aktuell.next;
        }
        return aktuell;
    }
    // Methode zum Löschen eines Knotens
    public void delete() {
        if (this.prev != null) {
            this.prev.setNext(this.next);
        }
        if (this.next != null) {
            this.next.setPrev(this.prev);
        }
    }
    // Methode zum Einfügen eines Knotens vor diesem Knoten
    public void infront(Listen Anfang){
        if (this.prev != null) {
            Listen zeiger = this.prev;
            Listen aktuell = this;
            while (zeiger != null) {
                zeiger = zeiger.prev;
                aktuell = aktuell.prev;
            }
            aktuell.prev = Anfang;
            Anfang.next = aktuell;
        }
        else {
            this.prev = Anfang;
            Anfang.next = this;
        }
    }
}
