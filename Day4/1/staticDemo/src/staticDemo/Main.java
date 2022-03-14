package staticDemo;

public class Main {
    public static void main(String[] args) {
        Product product1=new Product();
        product1.id=1;
        product1.name=" ";
        product1.price=2;
        ProductManager productManager=new ProductManager();
        productManager.add(product1);
    }
}
