public class Siglas {
    public static String siglas(String palabras) {
        String siglas = "";
        for (int i = 0; i < palabras.length(); i++) {
            if (Character.isUpperCase(palabras.charAt(i))) {
                siglas += palabras.charAt(i);
            }
        }
        return siglas;
    }
    public static void main(String[] args) {
        String palabras = "Escuela Oficial de Idiomas";

        System.out.println(siglas(palabras));
    }
}
