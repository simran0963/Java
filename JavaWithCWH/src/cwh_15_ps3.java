import java.util.Scanner;

public class cwh_15_ps3 {
    public static void main(String[] args) {
        // 1.
        String name = "Jack Bawers";
        name = name.toLowerCase();
        System.out.println(name);

        // 2.
        String text = "to Lower Case";
        text = text.replace(" ","_");
        System.out.println(text);

        // 3.
        String greet = "Dear <|name|>, Thanks a lot. ";
        Scanner sc = new Scanner(System.in);
        greet = greet.replace("<|name|>", "Simran");
        System.out.println(greet);

        // 4.
        String str = "This string contains   double  and  triple spaces ";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));

        // 5.
        String letter = "Dear Harry,\n\tThis Java Course is nice.\nThanks";
        System.out.println(letter);
    }
}
