public class App {
    public static void main(String[] args) throws Exception {
        // 220-284
        int n1 = 220;
        int n2 = 284;
        int t1 = 0;
        int t2 = 0;

        for (int i=1; i<n1; i++) {
            if (n1 % i == 0) {
                t1 += i;
            }
        }
        for (int i=1; i<n2; i++) {
            if (n2 % i == 0) {
                t2 += i;
            }
        }

        if(n1 == t2 && n2 == t1) {
            System.out.println("Arkadas sayidir.");
        } else {
            System.out.println("Arkadas sayi degildir.");
        }
    }
}
