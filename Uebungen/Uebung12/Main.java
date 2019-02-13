import newton.*;
/**
 * Main test die Implementierung der einzelnen Aufgaben auf Blatt 12
 * entsprechend ihrer Reihenfolge auf dem Blatt,
 * 
 * @author Sandra Greiner
 * @version 18.01.18
 */
public class Main
{
    public static void main(String[] args) {
        Song hulapalu = new Song("Hulapalu", "Gabalier");
        Liste<Song> songlist = new Liste<Song>(hulapalu);

        Buch b = new Buch("goethe", "faust", 1810);
        Liste<Buch> buchListe = new Liste<Buch>(b);
        
        Polynom p = new Polynom();
        Out.println("Newton für das Polynom 3x^3 + 5 x^2 - 8 an der Stelle ");
        Out.println("\t x0 = 5 \t ist " + Newton.berechneNullstelle(p, 5));
        Out.println("\t x0 = -13 \t ist " + Newton.berechneNullstelle(p, -13));
  
    } 
}
