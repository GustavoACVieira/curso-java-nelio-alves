package src.Section8;

public class StringUtilsEx62 {
    public static boolean ehPalindromo(String texto) {
        // Remove espaços e transforma tudo em minúsculo
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        // Inverte o texto
        String invertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        // Verifica se é palíndromo
        return texto.equals(invertido);
    }
}
