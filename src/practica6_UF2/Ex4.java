/*4. Escriu un procediment anomenat “Dau” que escrigui per pantalla un enter a
l’atzar que estigui comprès entre 1 i 6.*/
package practica6_UF2;

import java.util.Random;

/**
 *
 * @author Ramon
 */
public class Ex4 {

    public static int Dau() {
        int numero;
        Random numero_aleatori = new Random(); //Creem un numero 'random' (aleatori) 
        numero = numero_aleatori.nextInt(6) + 1; //Fem que el int es torni aleatori entre 6 de maxim i 1 de minim 
        return numero; //retornem aquest numero 
    }

    public static void main(String[] args) {
        System.out.println("Tires un dau i surt... " + Dau()); //Imprimim el programa anterior
    }
}
