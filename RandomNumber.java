/******************************************************************************
 *  Compilation:  javac RandomNumber.java
 *  Execution:    java RandomNumber n m
 *
 *  Eingabe: zwei positive Integer n und m (0 inklusive)
 *  Ausgabe: eine zufällige ganze Zahl zwischen n und m (inklusive der Grenzen)
 *
 *  Anmerkung: Gehen Sie ausnahmsweise davon aus, dass ihr Programm immer korrekt aufgerufen wird.
 * 
******************************************************************************/

public class RandomNumber {
    public static void main(String[] args) {
   	int n = Integer.parseInt(args[0]);
    	int m = Integer.parseInt(args[1]);
    	int random;

    	random = (int) (Math.random() * (m - n + 1) + n);

    	System.out.println(random);
    }
}
