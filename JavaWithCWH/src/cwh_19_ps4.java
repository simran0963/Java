import java.util.Scanner;

public class cwh_19_ps4 {
    public static void main(String[] args) {
        // 2.
        /*int s1=34, s2=55, s3=32;
        float avg=(s1+s2+s3)/3.0f;
        if(s1>=33 && s2>=33 && s3>=33 && avg>=40) System.out.println("Passed");
        else System.out.println("Fail");*/

        //3.
        /*float tax =0;
        Scanner sc = new Scanner(System.in);
        float income = sc.nextInt();
        if(income < 2.5) tax+=0;
        else if(income<5.0f && income>2.5f) {
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>=5.0f && income<10.0f) {
            tax = tax + (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        }
        else if(income >= 10.0f) {
            tax = tax + (5.0f - 2.5f);
            tax = tax + 0.05f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println(tax);*/

        // 4.
        /*Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        day%=7;
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }*/

        //5.
        /*Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0) System.out.println("Leap Year");
        if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) System.out.println("Leap Year");
        else System.out.println("Not Leap Year.");*/

        //6.
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        int ch=0;
        String str;
        if(url.endsWith(".com")) ch = 1;
        else if(url.endsWith(".org")) ch = 2;
        if(url.endsWith(".in")) ch = 3;
        switch(ch){
            case 1 -> System.out.println("Commercial Website");
            case 2 -> System.out.println("Organizational Website");
            case 3 -> System.out.println("Indian Website");
            default -> System.out.println("Not a valid url");
        }
    }
}
