package e.tradeApp.bussines.concretes;

import e.tradeApp.dataAccess.concretes.ProductDao;
import e.tradeApp.entities.concretes.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ProductManager {

    ProductDao productDao = new ProductDao();
    ArrayList<Product> products;
    private boolean check;

    public ProductManager() {
        products = new ArrayList<Product>();
    }


    public void add(Product product) {

        if (getAll().stream().noneMatch(p1 -> Objects.equals(p1.getName(), product.getName()))) {
            productDao.add(product);
        }

        /*
        check = control(product);
        if (!check) {
            productDao.add(product);
        }*/


    }

    public boolean control(Product product) {

        for (Product p : productDao.getAll()
        ) {
            if (Objects.equals(p.getName(), product.getName())) {
                return true;

            }

        }
        return false;
    }


    public List<Product> getAll() {
        return productDao.getAll();
    }
}
