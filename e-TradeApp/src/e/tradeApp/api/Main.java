package e.tradeApp.api;

import e.tradeApp.bussines.concretes.ProductManager;
import e.tradeApp.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {

        ProductManager productManager=new ProductManager();
        Product product1=new Product(1,"Keyboard",15,1);
        Product product2=new Product(3,"Mouse",25,1);
        Product product3=new Product(2,"Mouse",25,1);
        Product product4=new Product(2,"Table",25,1);




        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        productManager.add(product4);
        System.out.println(product1.getUnitPrice());


        for (Product products :productManager.getAll()
             ) {
            System.out.println(products.getName());
            
        }
    }

}
