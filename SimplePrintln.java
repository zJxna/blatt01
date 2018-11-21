/******************************************************************************
 *  Compilation:  javac SimplePrintln.java
 *  Execution:    java SimplePrintln a b
 *
 *  Eingabe: Zwei Strings a und b
 *  Ausgabe: Die eingegebenen Strings in umgekehrter Reihenfolge in zwei Zeilen.
 * 
 *  Verwenden Sie fuer alle Ausgaben System.out.println 
 *
 *  Anmerkung: Gehen Sie ausnahmsweise davon aus, dass ihr Programm immer korrekt aufgerufen wird.
 * 
 ******************************************************************************/

public class SimplePrintln {
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        System.out.println(b);
        System.out.println(a);
    }
}

