package oop1;

public class App {
    public static void main(String[] args) {
        // String mesaj = "Vade Orani ";

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("bilmemne.jpeg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(7500);
        product2.setDiscount(7);
        product2.setUnitsInStock(3);
        product2.setImageUrl("bilmemne.jpeg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(7500);
        product3.setDiscount(7);
        product3.setUnitsInStock(3);
        product3.setImageUrl("bilmemne.jpeg");

        Product[] products = { product1, product2, product3 };

        System.out.println("<ul>");

        for (Product product : products) {
            System.out.println("<li>"+product.getName()+"</li>");
        }

        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05111111111");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Muhammet");
        individualCustomer.setLastName("Kaymak");


        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("05333333333");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("54321");


        Customer[] customers = {individualCustomer, corporateCustomer};

        for (Customer customer : customers) {
            System.out.println(customer.getId());
        }
    }
}
