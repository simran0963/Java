public class cwh_28_milti_d_arr {
    public static void main(String[] args) {
        int flats[][] = {{1,2,3,},{4,5,6}};
        for(int[] ele : flats){
            for(int el : ele){
                System.out.print(el + " ");
            }
            System.out.println("");
        }
    }
}
