public class Palindromo {
    public static boolean esPalindromo(String cadena) {
        for (int i = 0; i < cadena.length() -1; i++) {
            if (cadena.charAt(i) != cadena.length() -i -1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(esPalindromo("abca"));
    }
}
