public class PalabrasLongitudIII {
    public static boolean larga(String frase, int num) {
        boolean larga = false;
        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() >= num) {
                larga = true;
                break;
            }
        }
        return larga;
    }
    public static void main(String[] args) {
        String frase = "Esto es una frase";
        int num = 4;
        if (larga(frase, num))
            System.out.println("Hay alguna  palabra larga");
        else
            System.out.println("Todas las palabras son cortas");

    }
}
