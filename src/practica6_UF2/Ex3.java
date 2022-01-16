/*3. Escriu una funció anomenada “Maxim” al que se li passa un vector d’enters i
ha de tornar el més gran dels números que conté el vector*/
package practica6_UF2;

/**
 *
 * @author Eric
 */
public class Ex3 {
    public static int Maxim(){
        int[] Coleccio_numeros=new int[]{234, 666,89,11,23,8,1,3444,61};
        //Agafem el primer com exemple
        int major = Coleccio_numeros[0];
        //Compara cada valor amb el primer que hem agafat, si és més gran que l'anterior es canvien de posició 
        for(int x = 1; x<Coleccio_numeros.length; x++){
            if (Coleccio_numeros[x]>major){
                major = Coleccio_numeros[x];
            }
        }
        return major;
        
    }
    public static void main(String[] args) {
        System.out.println(Maxim());
    }
}
