/*
5. Escriu una funció “MCD_Euclides” que retorni el màxim comú divisor de dos
números segons l’algorisme d’Euclides. Aquest algorisme el podeu trobar
detallat a https://ca.wikipedia.org/wiki/Algorisme_d%27Euclides
 */
package practica6_UF2;

/**
 *
 * @author Eric
 */
public class Ex5 {
    // Algoritmo de Euclides

    public static int MCD_Euclides() {

        int a, b;

        a = 4;
        b = 6;
        while (a != b) {
            if (a < b) {
                b = b - a;
            } else {
                a = a - b;
            }
        }
        return (a);
    }

    public static void main(String[] args) {
        System.out.println(MCD_Euclides());
    }
}
