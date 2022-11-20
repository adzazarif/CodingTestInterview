class palindrom{

    // Palindrom adalah merupakan sebuah kata, bilangan, frasa, atau susunan karakter lain yang serupa
    //  jika dibaca dengan urutan terbalik ataupun tidak, seperti dalam kakak ataupun apa. 
    public static void pal(String value){
    for (int i = 0; i < value.length(); i++) {
        int awal = i;
        int akhir = value.length() - i - 1;
        if(value.indexOf(awal) != value.indexOf(akhir)){
            System.out.println(value + " bukan palindrom");
        }
    }
    System.out.println(value + " adalah palindrom");
    }
    public static void main(String[] args) {
        pal("katak");
    }
}