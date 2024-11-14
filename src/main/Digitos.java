public class Digitos {
    public static int cuantosSonDigitos(String frase){
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (Character.isDigit(frase.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
    String frase = "Un 1 y un 20";

        System.out.println("Hay " + cuantosSonDigitos(frase) + " digitos");
    }
}
