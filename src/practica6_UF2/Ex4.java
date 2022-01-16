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
        Random numero_aleatori = new Random();
        numero = numero_aleatori.nextInt(6) + 1;
        return numero;
    }

    public static void main(String[] args) {
        System.out.println("Tires un dau i surt... " + Dau());
    }
}
