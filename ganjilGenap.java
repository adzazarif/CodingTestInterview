public class ganjilGenap {
    public static void tampilGanjilGenap(int banyak){
        for(int i = 1; i <= banyak ; i++){
            if(i % 2 == 0){
                System.out.println( i + " adalah bilangan genap");
            }else{
                System.out.println(i + " adalah bilangan ganjil");
            }
        }
    }

    public static void cekGanjilGenap(int bil){
        if(bil % 2 == 0){
            System.out.println(bil + " adalah bilangan genap");
        }else{
            System.out.println(bil + " adalah bilangan ganjil");
        }
    }

    public static void main(String[] args) {
        tampilGanjilGenap(10);
        cekGanjilGenap(5);
    }
}
