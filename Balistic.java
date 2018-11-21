/******************************************************************************
 *  Compilation:  javac Balistic.java
 *  Execution:    java Balistic x0 v0 t
 *
 *  Eingabe: Drei double Werte: x0 v0 t
 *  Ausgabe: Position eines von Position x0 aus mit Geschwindigkeit v0 senkrecht nach oben geworfenen Objektes nach der Zeit t
 *           g ist die Gravitationskonstante und hat den Wert 9.78033
 *
 *  Die Formel zur Berechnung finden Sie auf dem Aufgabenblatt
 *
 *  Anmerkung: Gehen Sie ausnahmsweise davon aus, dass ihr Programm immer korrekt aufgerufen wird.
 * 
 ******************************************************************************/

public class Balistic {
    public static void main(String[] args) {
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double g = 9.78033;
        double ergebnis = x0+v0*t-g*t*t/2;
        System.out.println(ergebnis);
    }
}

