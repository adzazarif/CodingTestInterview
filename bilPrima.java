public class bilPrima {
    public static void cekBilPrima(int bil){
        int a = 0;
        for(int i = 1; i <= bil; i++){
                if(bil % i == 0){
                    a++;
                }
        }
        if(a == 2){
            System.out.println(bil + "bilangan Prima"); 
        }else{
            System.out.println( bil + "bukan bilangan prima");
        }
    }
    public static void main(String[] args) throws Exception {
        cekBilPrima(5);
    }
}
