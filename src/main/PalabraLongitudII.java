public class PalabraLongitudII {
    public static void main(String[] args) {
        String frase = "Esto es una frase";
        boolean existe = false;
        int num = 1;
        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == num) {
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println("Existe alguna palabra de " + num);
        } else {
            System.out.println("No existe palabra de " + num);
        }
    }
}

