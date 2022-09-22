public class App {
    public static void main(String[] args) throws Exception
    {
        int sayi1 = 50;
        int sayi2 = 25;
        int sayi3 = 30;

        if ( sayi1 > sayi2 && sayi1 > sayi3)
        {
            System.out.println("sayi1 en buyuk");
        }
        else if (sayi2 > sayi1 && sayi2 > sayi3)
        {
            System.out.println("sayi2 en buyuk");
        }
        else
        {
            System.out.println("sayi3 en buyuk");
        }
    }
}