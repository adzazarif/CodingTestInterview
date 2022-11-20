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
    public static void main(String[] args) {
        triangle1();
    }
}
