public class Cadena {
    public static void main(String[] args) {
        String cadena= "Hola";
        System.out.println(cadena.length());
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
        /*cadena = cadena.toUpperCase();
        System.out.println(cadena);
        cadena = cadena.toLowerCase();
        System.out.println(cadena);
        cadena = cadena.replace('o', 'e');
        System.out.println(cadena);
        cadena = cadena.trim();
        System.out.println(cadena);
        cadena = cadena.substring(3,8);*/
        System.out.println(cadena);
        System.out.println(cadena.endsWith("?"));
    }
}
