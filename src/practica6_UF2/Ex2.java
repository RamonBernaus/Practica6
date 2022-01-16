/*2. Escriu un procediment anomenat “PrintReverseString” al que se li passa un
string i el torna del revés.*/
package practica6_UF2;

import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Ex2 {

    public static void ReverseString() {
        String str = "Hola", nstr = "";
        //Creem 2 string str i nstr un per a la paraula normal (str) i l'altre per la paraula al reves(nstr)
        char paraula;

        System.out.print("Paraula normal: ");
        System.out.println("Hola");
        //Imprimim la paraula del dret

        for (int i = 0; i < str.length(); i++) {
            paraula = str.charAt(i); //Fem que ens retorni les lletres a l'inversa de com estaben
            nstr = paraula + nstr; //Anem creant la paraula o frase a l'inversa al sumar les lletres
        }
        System.out.println("La paraula al reves: " + nstr); //Finalment l'imprimim
    }

    public static void main(String[] args) {
        ReverseString(); //Imprimim la funcio sense parametres anterior
    }
}
