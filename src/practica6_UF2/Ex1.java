/*1. Escriu una funció anomenada “QuiEsIntegrantDAquestGrup” que, rebi com a
paràmetre un número enter i, i retorni el membre i-ésim del grup. Si no hi ha
membre i-ésim ha de tornar una cadena buida */
package practica6_UF2;

/**
 *
 * @author Ramon
 */
public class Ex1 {

    public static boolean QuiEsIntegrantDAquestGrup(int n) {
        boolean comprovador = false; //Creem un boolean 
        if (n == 1) { //Si es 1 ens dira qui es l'integrant 1
            System.out.println("L'integrant numero 1 es el Ramon"); 
            comprovador = true;
        } else if (n == 2) { //Si es 2 ens dira qui es l'integrant 2
            System.out.println("L'integrant numero 2 es l'Eric");
            comprovador = true;
        } else { 
        //si no es ni 1 ni 2 ens no ens donara res 
            System.out.println("");
            comprovador = true;
        }
        return comprovador; //retornem el boolean de que comprova tot

    }

    public static void main(String[] args) {
        QuiEsIntegrantDAquestGrup(0); //imprimi (en aquest cas un error ja que no es 1 o 2)
    }
}
