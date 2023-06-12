import java.util.Scanner;
import java.util.Random;

public class cwh_20_rock_paper_scissor {
    public static void main(String[] args) {
        int i=5, up=0,cp=0;
        Scanner sc = new Scanner(System.in);
        while(i!=0) {
            System.out.println("\n\n\n1: Rocks\t2: Papers\t 3. Scissors\n Enter your choice: ");
            int your = sc.nextInt();
            your%=3;
            switch (your) {
                case 1 -> System.out.println("You chose Rocks");
                case 2 -> System.out.println("You chose Papers");
                case 0 -> System.out.println("You chose Scissors");
            }
            Random rand = new Random();
            int comp = rand.nextInt(10);
            comp%=3;
            switch (comp) {
                case 1 -> System.out.println("Computer chose Rocks");
                case 2 -> System.out.println("Computer chose Papers");
                case 0 -> System.out.println("Computer chose Scissors");
            }//1:rocks 2: papers 3: scissors
            if((comp == 2 && your == 1) || (comp == 0 && your == 2) || (comp ==1 && your == 0)){
                cp++;
                System.out.println("\nComputer gets a point!\n"+"User = "+up+"\tComputer = "+cp);
            }
            else if((comp == 1 && your == 2) || (comp == 2 && your == 0) || (comp ==0 && your == 1)){
                up++;
                System.out.println("\nYou get a point!!\n"+"User = "+up+"\tcomputer = "+cp);
            }
            else System.out.println("\nIts a draw, no one gets the point\n"+"User = "+up+"\tComputer = "+cp);
            i--;
        }
        if(up > cp) System.out.println("\n\n\nCongratulations you win!\nYour score = " + up +"\nComputers score = " + cp);
        else if(up < cp) System.out.println("\n\n\nSorry you lose!\nYour score = " + up +"\nComputers score = " + cp);
        else System.out.println("\n\n\nIt's a draw...");
    }
}
