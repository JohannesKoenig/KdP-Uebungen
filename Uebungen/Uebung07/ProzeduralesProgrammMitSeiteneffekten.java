/**
 * Ein Programm im prozeduralen Programmierstil, das mit Hilfe
 * von Seiteneffekten einen Ergebnis-String berechnet, der dann
 * auf der Kommandozeile ausgegeben wird.
 * 
 * @author Angabe KdP
 * @version 30.11.2017
 */
public class ProzeduralesProgrammMitSeiteneffekten {

    public static String s1;
    public static String s2;
    public static String s3;
    public static String s4;
    public static int  i1;
    public static int  i2;

    public static void main(String[] args) {
        berechneI1();
        berechneI2();
        berechneS4();
        String s = s4 + (i1 + i2);
        Out.println(s + "/18");
    }

    public static void berechneS1() {
        s1 = "";
        s1 += 'K';
        s1 += (char) 111;
    }

    public static void berechneS2() {
        berechneS1();
        s2 = s1 + "nzepte der ";
    }

    public static void berechneS3() {
        s3 = "P";
        s3 += (char) 114;
        s3 += (char) 111;
        s3 += "gr";
    }

    public static void berechneS4() {
        berechneS2();
        berechneS3();
        s4 = s2 + s3 + "ammierung ";
    }

    public static void berechneI1() {
        i1 = 1000 + '%';
    }

    public static void berechneI2() {
        i2 =  (int) 975.0 + 5;
    }    

}
