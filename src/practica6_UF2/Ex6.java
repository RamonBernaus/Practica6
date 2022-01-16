/*6. Escriu un funció anomenada “Inicials” que rebi com a paràmetre una frase i
torni un string amb les inicials de cada paraula convertides a majúscules*/
package practica6_UF2;

/**
 *
 * @author Ramon
 */
public class Ex6 {

    public static String Inicials() {
        String frase = "hola em dic josep"; //Fiquem una frse com String
        String resultat = ""; //I un resultat per a retornar
        char[] mayus = frase.toCharArray(); //Creem un array format per chars
        mayus[0] = Character.toUpperCase(mayus[0]); //Fem que la primera lletra es torni majuscula 
        for (int i = 0; i < mayus.length; i++) { //Creem un bucle per a que ens capti els esais en blanc 
            if (mayus[i] == ' ') { //Quan detecta un espai en blanc la següent lletra sera en majuscula
                mayus[i +1] = Character.toUpperCase(mayus[i +1]); //Torne les letres a majus.
            }
        }
        for (int a=0; a<mayus.length; a++){ //Un cop totes les primeres lletres son majus les filtrem 
            if(Character.isUpperCase(mayus[a])){ //Filtre les lletres per a que solament passin les majus
            resultat = resultat + mayus[a]; //Sumem les lletres que han pasat el filtre de majus 
            }
        }
        return resultat; //retornem el resultat de les majus filtrades
    }

    public static void main(String[] args) {
        System.out.println(Inicials()); //Imprimim tot el programa anterior
    }
}
