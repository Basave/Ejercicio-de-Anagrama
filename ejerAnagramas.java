import java.util.Arrays;
public class ejerAnagramas{
/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
    public static void main (String [] args){
            // Pruebas con diferentes casos
            System.out.println(esAnagrama("mora", "ramo")); // true
            System.out.println(esAnagrama("mora", "amor")); // true
            System.out.println(esAnagrama("mora", "roma")); // true
            System.out.println(esAnagrama("mora", "rama")); // false
            System.out.println(esAnagrama("mora", "mora")); // false
            System.out.println(esAnagrama("moa", "morsa")); // false
        }
    
        /**
         * Verifica si dos palabras son anagramas.
         * @param palabra1 La primera palabra.
         * @param palabra2 La segunda palabra.
         * @return true si son anagramas, false en caso contrario.
         */
        public static boolean esAnagrama(String palabra1, String palabra2) {
            // Valida que ambas palabras no sean nulas
            if (palabra1 == null || palabra2 == null) {
                return false;
            }
    
            // Retorna falso si las palabras son iguales.
            if (palabra1.equalsIgnoreCase(palabra2)) {
                return false;
            }
    
            // Convierte las palabras a minúsculas, luego a arreglos de caracteres.
            char[] lonPalabra1 = palabra1.toLowerCase().toCharArray();
            char[] lonPalabra2 = palabra2.toLowerCase().toCharArray();
    
            // Ordena los arreglos.
            Arrays.sort(lonPalabra1);
            Arrays.sort(lonPalabra2);
    
            // Retorna true si los arreglos ordenados son iguales, false en caso contrario.
            return Arrays.equals(lonPalabra1, lonPalabra2);
        }
    }
