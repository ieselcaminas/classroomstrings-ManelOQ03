public class PalabrasLongitud {
    public static void main(String[] args) {
        String frase = "Esto es una frase";
        int num = 2;
        int contador = 0;
        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == num) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
