package karadag.oguzkaan.service;

import karadag.oguzkaan.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
