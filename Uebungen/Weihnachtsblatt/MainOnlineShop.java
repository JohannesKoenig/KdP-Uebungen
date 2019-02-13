
/**
 * Fuehrt einen Beispielablauf im Onlineshop aus
 * 
 * @author Sandra Greiner
 * @version 10.12.15
 */
public class MainOnlineShop
{
    public static void main(String[] args) {
        //erzeuge Artikel
        Artikel lampe = new Artikel("Stehlampe", "glitzernd, mit Klatschsensor", 9.99, Kategorie.ELEKTRONIK);
        Artikel siedler = new Artikel("Die Siedler von Catan", "Gesellschaftsspiel", 21.99, Kategorie.MULTIMEDIA);
        Artikel mixer = new Artikel("Mixer", "Elektrischer Mixer fuer die Kueche", 19.99, Kategorie.HAUSHALT);
        Artikel shirt = new Artikel("T-Shirt", "Beste Ware", 3.99, Kategorie.KLEIDUNG);

        //erzeuge Benutzer
         Benutzer b1 = new Benutzer("Felix", "RateMal");
         Benutzer b2 = new Benutzer("Thomas", "RateMal");
        
        //erstelle Onlineshop
        OnlineShop o = new OnlineShop();

        o.registriereBenutzer(b1);
        o.registriereBenutzer(b2);

        Datum fruehGenug = new Datum(11, 12, 2015);
        Datum kurzVorWeihnachten = new Datum(22, 12, 2015);        
        Datum zuSpaet = new Datum(25, 12, 2015);        

        
        Out.println("Kaufe Siedeler");
        o.kaufeArtikel(siedler, 1, kurzVorWeihnachten, b1);   
        Out.println("Kaufe Mixer");
        o.kaufeArtikel(mixer, 1, fruehGenug, b1);       
        Out.println("Kaufe Tshirt");
        o.kaufeArtikel(shirt, 1, kurzVorWeihnachten, b1);       

        Out.println("Kaufe Lampe");
        o.kaufeArtikel(lampe, 2, fruehGenug, b2); 
        Out.println("Kaufe Siedler");
        o.kaufeArtikel(siedler, 1, kurzVorWeihnachten, b2);       

    }     
}
