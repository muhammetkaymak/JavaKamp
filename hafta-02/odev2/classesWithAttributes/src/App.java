public class App {
    public static void main(String[] args) throws Exception {
        Product product = new Product();
        product.set_name("Laptop");
        product.set_id(1);
        product.set_description("Asus Laptop");
        product.set_price(5000);
        product.set_stockAmount(3);

        ProductManager productManager = new ProductManager();

        productManager.Add(product);
    }
}
