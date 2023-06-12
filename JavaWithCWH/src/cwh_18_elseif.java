import java.util.Scanner;
public class cwh_18_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("You are going to be an adult.");
            case 23 -> System.out.println("You are going for Job!");
            case 60 -> System.out.println("You are going to get retired.");
            default -> System.out.println("Enjoy your life!!");
        }

        /*if(age > 56) System.out.println("You are experienceed");
        else if(age > 46) System.out.println("You are semi experienced");
        else System.out.println("You are not experienced");*/

    }
}
