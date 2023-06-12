public class cwh_33_varargs {
    static int sum(int x, int... arr){
    // Available as int [] arr
        int res=0;
        for(int a:arr){
            res+=a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 2,3 is: " + sum(2, 3));
        System.out.println("The sum of 2,3 and4 is: " + sum(2, 3, 4));
        System.out.println("The sum of 2,3, 4 ans 5 is: " + sum(2,3,4,5));
    }
}
