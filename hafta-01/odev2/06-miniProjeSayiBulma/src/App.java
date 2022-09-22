public class App {
    public static void main(String[] args) throws Exception {
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;

        for (int sayi:sayilar) {
            if(sayi == aranacak) {
                System.out.println("Aranan sayi bulundu.");
                return;
            }
        }

        System.out.println("Aranan sayi bulunamadi");
    }
}
