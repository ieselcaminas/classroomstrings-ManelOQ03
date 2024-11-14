public class DigitosIII {
    public static int esNumeros(String frase) {
        String[]palabras = frase.split(" ");
        int contador = 0;
        boolean esNumero=true;
        for (int i = 0; i < palabras.length; i++) {
            esNumero = true;
            for (int j = 0; j < palabras[i].length(); j++) {
                if (!Character.isDigit(palabras[i].charAt(j))) {
                    esNumero = false;
                    break;
                }
            }
            if (esNumero) contador++;
        }
        return contador;
    }
    public static void main(String[] args) {
        String frase = "4 1 5y 5 20";

        System.out.println("Hay " + esNumeros(frase) + " numeros");
    }
}
