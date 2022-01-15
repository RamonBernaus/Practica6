/*1. Escriu una funció anomenada “QuiEsIntegrantDAquestGrup” que, rebi com a
paràmetre un número enter i, i retorni el membre i-ésim del grup. Si no hi ha
membre i-ésim ha de tornar una cadena buida */
package practica6_UF2;

import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Ex1 {

    static boolean QuiEsIntegrantDAquestGrup() {
        Scanner s = new Scanner(System.in);
        int numero;
        boolean comprovador = false;
        System.out.println("Digues un  numero i et direm l'integrant");
        numero = s.nextInt();
        if (numero == 1){
            System.out.println("L'integrant numero 1 es el Ramon");
            comprovador = true;
        }
        else if(numero==2){
            System.out.println("L'integrant numero 2 es l'Eric");
            comprovador = true;
        }
        else{
            System.out.println("");
            comprovador = true;
        }
        return comprovador;

    }

    public static void main(String[] args) {
        QuiEsIntegrantDAquestGrup();
    }
}
