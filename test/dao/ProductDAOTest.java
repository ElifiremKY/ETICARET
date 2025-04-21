package dao;

import model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List; // Bu satırı ekleyin

import static org.junit.jupiter.api.Assertions.*;

public class ProductDAOTest {

    private ProductDAO productDAO;

    @BeforeEach
    public void setUp() {
        productDAO = new ProductDAO();
    }

    @Test
    public void testListProducts() {
        List<Product> productList = productDAO.getAllProducts();
        assertNotNull(productList, "Ürün listesi null olmamalı");
        assertTrue(productList.size() > 0, "En az bir ürün olmalı");
    }

    @Test
    public void testGetProductDetails() {
        Product product = productDAO.getProductById(1); // örnek ürün ID
        assertNotNull(product, "Ürün bulunmalı");
        assertEquals(1, product.getId(), "Ürün ID eşleşmeli");
    }

    @Test
    public void testStockControl() {
        Product product = productDAO.getProductById(1); // örnek ürün ID
        assertNotNull(product, "Ürün bulunmalı");

        if (product.getStock() <= 0) {
            System.out.println("Stokta yok: " + product.getName());
        }

        assertTrue(product.getStock() >= 0, "Stok sayısı negatif olamaz");
    }
}
