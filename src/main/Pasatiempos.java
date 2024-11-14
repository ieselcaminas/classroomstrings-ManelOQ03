public class Pasatiempos {
    public static String crearPasatiempo(String palabras) {
        for (int i = 0; i < palabras.length(); i++) {
           if ("aeiouAEIOU".indexOf(palabras.charAt(i)) != -1)
               palabras = palabras.replace(palabras.charAt(i), '.');
        }
        return palabras;
    }
    public static void main(String[] args) {
        String palabras = "un ejemplo de pasatiempos";
        System.out.println(crearPasatiempo(palabras));
    }
}
