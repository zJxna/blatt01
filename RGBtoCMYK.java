/******************************************************************************
 *  Compilation:  javac RGBtoCMYK.java
 *  Execution:    java RGBtoCMYK r g b
 *
 *  Eingabe: Drei ganze Zahlen zwischen 0 und 255, die eine RGB Farbe bezeichnen
 *
 *  Ausgabe: Die Farbe im CMYK Farbschema. Ausgabecodierung (C,M,Y,K)
 *
 *  Die Formeln zur Berechnung finden Sie auf dem Aufgabenblatt und im Buch (Aufgabe 1.2.32)
 *
 *  Anmerkungen:
 *    Gehen Sie ausnahmsweise davon aus, dass ihr Programm immer korrekt aufgerufen wird.
 *
 *  Referenzen:
 *    http://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
 *    https://de.wikipedia.org/wiki/RGB-Farbraum
 *    https://de.wikipedia.org/wiki/CMYK-Farbmodell

 * 
 ******************************************************************************/

public class RGBtoCMYK {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double w = (Math.max(r,Math.max(g,b)))/255.0;
        double c = (w-(r/255.0))/w;
        double m = (w-(g/255.0))/w;
        double y = (w-(b/255.0))/w;
        double k = 1-w;
        System.out.println("(" + c+","+m+","+y+","+k + ")");
    }
}

