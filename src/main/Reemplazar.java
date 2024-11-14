import java.sql.SQLOutput;
import java.util.Scanner;

public class Reemplazar {
    public static String reemplazar(String cadena, int posicion, char letra) {
        for (int i = 0; i < cadena.length(); i++) {
            if (posicion == i) {
               cadena= cadena.replace(cadena.charAt(i), letra);
            }
        }
        return cadena;
    }
    public static void main(String[] args) {
        String cadena;
        int posicion;
        char letra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la palabra: ");
        cadena = sc.nextLine();
        System.out.println("Ingresa la posicion de la letra: ");
        posicion = sc.nextInt();
        System.out.println("Ingresa la letra: ");
        letra = sc.next().charAt(0);
        System.out.println(reemplazar(cadena, posicion, letra));
    }
}
