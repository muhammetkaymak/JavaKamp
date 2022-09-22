public class App {
    public static void main(String[] args) throws Exception {
        int number = 2;
        boolean isPrime = true;

        if(number == 1){
            System.out.println(number + " asal degil.");
            return;
        } else if (number<1) {
            System.out.println("Gecersiz sayi!");
        }


        for (int i=2; i<number; i++) {
            if(number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " asal.");
        } else {
            System.out.println(number + " asal degil");
        }
    }
}
