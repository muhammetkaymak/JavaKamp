public class App {
    public static void main(String[] args) throws Exception {
        int number = 27;
        int total = 0;

        for (int i=1; i<number ; i++) {
            if(number%i == 0) {
                total += i;
            }
        }

        if (number == total) {
            System.out.println(number + " Mukemmel sayidir.");
        } else {
            System.out.println(number + " Mukemmel sayi degildir.");
        }
    }
}
