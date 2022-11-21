public class triangle {
    public static int banyak = 5;
    //membuat triangle seperti berikut:
    // *
    // **
    // ***
    // ****
    // *****
    public static void triangle1(){
        for (int i = 1; i <= banyak; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // membuat triangle seperti berikut 
    // *****
    // ****
    // ***
    // **
    // *
    public static void triangle2(){
        for (int i = banyak; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // membuat triangle seperti berikut 
    //     *
    //    **
    //   ***
    //  ****
    // ***** 
    public static void triangle3(){
        for (int i = 1; i <= banyak; i++) {
            for (int j = banyak - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // membuat triangle seperti berikut 
    //         *
    //        * *
    //       * * *
    //      * * * *
    //     * * * * *
    public static void triangle4(){
        for (int i = 1; i <= banyak; i++) {
            for (int j = banyak - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle1();
        triangle2();
        triangle3();
        triangle4();
    }
}