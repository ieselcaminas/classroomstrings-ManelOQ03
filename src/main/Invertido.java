public class Invertido {
    public static String invertir(String frase) {
        String[]palabras = frase.split(" ");
        String invertido = "";
        for (int i = 0; i < palabras.length; i++) {
            invertido += palabras[palabras.length - i - 1] + " ";
        }
        return invertido;
    }
    public static void main(String[] args) {
        String frase = "4 1 y 5 20";
       
        System.out.println(invertir(frase));
    }
}
