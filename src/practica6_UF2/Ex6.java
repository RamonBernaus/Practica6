/*6. Escriu un funció anomenada “Inicials” que rebi com a paràmetre una frase i
torni un string amb les inicials de cada paraula convertides a majúscules*/
package practica6_UF2;

/**
 *
 * @author Ramon
 */
public class Ex6 {

    public static String Inicials() {
        int ContadorEspaisBlanc = 0;
        String frase = "hola em dic josep";
        String result = frase;
        char[] may = frase.toCharArray();
        for (int i = 0; i < may.length; i++) {
            if (frase.charAt(i) == ' ') {
                ContadorEspaisBlanc++;
                may[0] = Character.toUpperCase(may[0]);
                result = may[0] + result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Inicials());
    }
}
