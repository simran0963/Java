import java.util.Scanner;

public class cwh_26_arrays {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        // for each loop
        for(int i:arr){
            System.out.println(i);
        }
    }
}
