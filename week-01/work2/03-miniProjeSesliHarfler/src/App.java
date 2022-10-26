public class App {
    public static void main(String[] args) throws Exception {
        char harf = 'İ';

        switch (harf) {
            case 'A':
            case 'I':
            case 'U':
            case 'O':
                System.out.println("Kalin Sesli Harf");
                break;
            case 'E':
            case 'İ':
            case 'Ü':
            case 'Ö':
                System.out.println("Ince Sesli Harf");
                break;
            default:
                System.out.println("Sessiz Harf");
        }
    }
}
