package Section7;

public class TesteS7 {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG     ";

        System.out.println("Original: =" + original + "=");
        String s01 = original.toLowerCase();
        System.out.println("toLowerCase(): =" + s01 + "=");

        String s02 = original.toUpperCase();
        System.out.println("toUpperCase(): =" + s02 + "=");

        String s03 = original.trim();
        System.out.println("trim(): =" + s03 + "=");

        String s04 = original.substring(2);
        System.out.println("substring: =" + s04 + "=");

        String s05 = original.substring(2, 9);
        System.out.println("substring 2 a 9: =" + s05 + "=");

        String s06 = original.replace('a', 'x');
        System.out.println("replace a por x: =" + s06 + "=");

        String s07 = original.replace("abc", "xy");
        System.out.println("replace abc por xy: =" + s07 + "=");

        int i = original.indexOf("bc");
        System.out.println("indexOf: =" + i + "=");

        int j = original.lastIndexOf("bc");
        System.out.println("lastIndexOf : =" + j + "=");

        String s = "potato apple lemon";
        String[] vet = s.split(" ");
        System.out.println(vet[0]);
        System.out.println(vet[1]);
        System.out.println(vet[2]);
    }
}
