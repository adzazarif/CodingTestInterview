class faktorial{
    public static void main(String[] args) {
        int a = 1;
        int bil = 5;
        for(int i = 1; i <= bil; i++){
            a *= i;
        }
        System.out.println("faktorial dari " + bil + " adalah " + a);
    }
}