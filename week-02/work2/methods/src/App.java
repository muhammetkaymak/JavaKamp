public class App {
    public static void main(String[] args) throws Exception {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi:sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            mesajVer(aranacak);
        } else {
            System.out.println("Sayi mevcut degildir : " + aranacak);
        }
    }

    public static void mesajVer(int aranacak) {
        System.out.println("Sayi mevcuttur : " + aranacak);
    }
}
