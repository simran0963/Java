public class cwh_29_ch6_ps {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3},{4,5,6}};
        int [][]brr = {{10,20,30},{40,50,60}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]+=brr[i][j];
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        int max = arr[0][0], min = arr[1][2];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) max = anInt;
                else if (anInt < min) min = anInt;
            }
        }
        System.out.println("Maximum = "+max+"\nMinimum = "+min);
    }
}
