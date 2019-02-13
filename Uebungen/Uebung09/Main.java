
/**
 * Main Klasse zum Ueberpruefen des Verhaltens der Plaetzchen.
 * 
 * @author Sandra Greiner 
 * @version 14.12.17
 */
public class Main
{
    public static void main(String[]args){
        BackAutomat baecker = new BackAutomat();
        PlaetzchenDose dLebk = baecker.backe(Plaetzchentyp.LEBKUCHEN, 50);
        PlaetzchenDose dMakr = baecker.backe(Plaetzchentyp.MAKRONE, 30);
        Out.println("Eigenschaften der Lebkuchen-Dose: " + dLebk.toString());
        Out.println("Eigenschaften der Makronen-Dose: " + dMakr.toString());
        Out.println();

        Mensch sandra = new Mensch();
        sandra.fuegeEin(dLebk);
        sandra.fuegeEin(dMakr);
        Out.println("Vorrat von Sandra: \n" + sandra.toString());
        Out.println();

        sandra.fuegeEin(new PlaetzchenDose(Plaetzchentyp.ZIMTSTERN, 35));
        sandra.backe(Plaetzchentyp.ZIMTSTERN, 70);
        Out.println("Vorrat von Sandra: \n" + sandra.toString());
        sandra.fuegeEin(new PlaetzchenDose(Plaetzchentyp.SPITZBUBE, 45));
        sandra.nasche(Plaetzchentyp.LEBKUCHEN, 13);
        Out.println("Vorrat von Sandra: \n" + sandra.toString());
        Out.println();
        
        sandra.backe(Plaetzchentyp.SPITZBUBE, 113);
        sandra.nasche(Plaetzchentyp.SPITZBUBE, 24);
        
        Out.println("Vorrat von Sandra: \n" + sandra.toString());
        Out.println();
        
        

    }
}
