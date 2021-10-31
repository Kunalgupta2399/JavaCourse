public class Patterns {
    public static void main(String[] args) {
//    pattern1(10);
//        pattern2(6);
    }

    public static  void pattern1(int n){
        for (int row = 1; row <= n ; row++) {
            // for every row , column is also same
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
