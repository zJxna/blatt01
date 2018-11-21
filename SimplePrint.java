/******************************************************************************
 *  Compilation:  javac SimplePrint.java
 *  Execution:    java SimplePrint a b
 *
 *  Eingabe: Zwei Strings a und b
 *  Ausgabe: Die eingegebenen Strings in umgekehrter Reihenfolge in zwei Zeilen.
 * 
 *  Verwenden Sie fuer alle Ausgaben System.out.print 
 *
 *  Anmerkung: Gehen Sie ausnahmsweise davon aus, dass ihr Programm immer korrekt aufgerufen wird.
 * 
 ******************************************************************************/

public class SimplePrint {
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        System.out.print(b);
        System.out.print("\n");
        System.out.print(a);
        System.out.print("\n");
    }
}

