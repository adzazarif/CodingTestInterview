public class fizzBuzz {
    public static void FB(int jum){
        for(int i = 1; i <= jum; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizz buzz");
            }else if(i % 3 == 0){
                System.out.println("fizz");
            }else if(i % 5 == 0){
                System.out.println("buzz");
            }else{
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        FB(20);
    }
}
