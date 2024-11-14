public class DigitosII {
    public static int contarNumeros(String frase) {
        String[]palabras = frase.split(" ");
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
            if (Character.isDigit(palabras[i].charAt(0))) {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        String frase = "4 1 5y 5 20";

        System.out.println("Hay " + contarNumeros(frase) + " numeros");
    }
}
