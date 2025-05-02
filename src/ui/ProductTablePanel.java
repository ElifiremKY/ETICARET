package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import dao.ProductDAO;
<<<<<<< HEAD
<<<<<<< HEAD
import model.Product;


public class ProductTablePanel extends JPanel
{
    private JTable table;
    private DefaultTableModel model;
    private ProductDAO productDAO = new ProductDAO();

    public ProductTablePanel(String role)
    {
=======
=======
>>>>>>> fa0ea9d (değişiklikler eklendi)
import model.*;

public class ProductTablePanel extends JPanel {
    private JTable table;
    private DefaultTableModel model;
    private ProductDAO productDAO = new ProductDAO();
    private CartManager cartManager;

    // Bu constructor 'role' ve 'cartManager' parametrelerini kabul ediyor
    public ProductTablePanel(String role, CartManager cartManager) {
        this.cartManager = cartManager; // Sepet işlemleri için CartManager'ı kaydediyoruz
<<<<<<< HEAD
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
>>>>>>> fa0ea9d (değişiklikler eklendi)
        setLayout(new BorderLayout());

        String[] columns = {"ID", "Ad", "Açıklama", "Fiyat", "Stok"};
        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

<<<<<<< HEAD
<<<<<<< HEAD
        JButton detayBtn = new JButton("Detayları Göster");
        add(detayBtn, BorderLayout.SOUTH);

        detayBtn.addActionListener(e -> showSelectedProductDetails());

        loadProductsFromDatabase();
    }

    private void loadProductsFromDatabase()
    {
        model.setRowCount(0); // Tabloyu temizle

        List<Product> products = productDAO.getAllProducts();
        for (Product product : products)
        {
=======
=======
>>>>>>> fa0ea9d (değişiklikler eklendi)
        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton detayBtn = new JButton("Detayları Göster");
        buttonPanel.add(detayBtn);
        detayBtn.addActionListener(e -> showSelectedProductDetails());

        if (role.equals("customer")) {
            JButton addToCartBtn = new JButton("Sepete Ekle");
            JButton viewCartBtn = new JButton("Sepeti Görüntüle");

            buttonPanel.add(addToCartBtn);
            buttonPanel.add(viewCartBtn);

            addToCartBtn.addActionListener(e -> addSelectedProductToCart());
            viewCartBtn.addActionListener(e -> new CartDialog(cartManager));
        }

        add(buttonPanel, BorderLayout.SOUTH);
        loadProductsFromDatabase();
    }

    // Bu constructor sadece 'role' parametresini kabul ediyor
    public ProductTablePanel(String role) {
        this(role, new CartManager()); // Eğer sadece 'role' verilirse, yeni bir CartManager oluşturuyoruz
    }

    private void loadProductsFromDatabase() {
        model.setRowCount(0);
        List<Product> products = productDAO.getAllProducts();
        for (Product product : products) {
<<<<<<< HEAD
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
>>>>>>> fa0ea9d (değişiklikler eklendi)
            model.addRow(new Object[]{
                    product.getId(),
                    product.getName(),
                    product.getDescription(),
                    product.getPrice(),
                    product.getStock()
            });
        }
    }

<<<<<<< HEAD
<<<<<<< HEAD
    private void showSelectedProductDetails()
    {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1)
        {
=======
    private void showSelectedProductDetails() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
    private void showSelectedProductDetails() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
>>>>>>> fa0ea9d (değişiklikler eklendi)
            Product product = new Product.ProductBuilder()
                    .setId((int) model.getValueAt(selectedRow, 0))
                    .setName((String) model.getValueAt(selectedRow, 1))
                    .setDescription((String) model.getValueAt(selectedRow, 2))
                    .setPrice((double) model.getValueAt(selectedRow, 3))
                    .setStock((int) model.getValueAt(selectedRow, 4))
                    .build();

            new ProductDetailDialog(product);
<<<<<<< HEAD
<<<<<<< HEAD
        } else
        {
=======
        } else {
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
        } else {
>>>>>>> fa0ea9d (değişiklikler eklendi)
            JOptionPane.showMessageDialog(this, "Lütfen bir ürün seçin.");
        }
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public void showAddProductDialog()
    {
=======
=======
>>>>>>> fa0ea9d (değişiklikler eklendi)
    // Sepete ürün ekleme işlevi
    private void addSelectedProductToCart() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            Product product = new Product.ProductBuilder()
                    .setId((int) model.getValueAt(selectedRow, 0))
                    .setName((String) model.getValueAt(selectedRow, 1))
                    .setDescription((String) model.getValueAt(selectedRow, 2))
                    .setPrice((double) model.getValueAt(selectedRow, 3))
                    .setStock((int) model.getValueAt(selectedRow, 4))
                    .build();

            CartItem item = new ProductCartItem(product);

            int option = JOptionPane.showConfirmDialog(
                    this,
                    "Hediye paketi eklemek ister misiniz? (+10₺)",
                    "Hediye Paketi",
                    JOptionPane.YES_NO_OPTION
            );

            if (option == JOptionPane.YES_OPTION) {
                item = new GiftWrapDecorator(item);
            }

            cartManager.addToCart(item);
            JOptionPane.showMessageDialog(this, "Ürün sepete eklendi.");
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen bir ürün seçin.");
        }
    }

    public void showAddProductDialog() {
<<<<<<< HEAD
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
>>>>>>> fa0ea9d (değişiklikler eklendi)
        JTextField nameField = new JTextField();
        JTextField descField = new JTextField();
        JTextField priceField = new JTextField();
        JTextField stockField = new JTextField();

        JPanel panel = new JPanel(new GridLayout(0, 2));
        panel.add(new JLabel("Ad:"));
        panel.add(nameField);
        panel.add(new JLabel("Açıklama:"));
        panel.add(descField);
        panel.add(new JLabel("Fiyat:"));
        panel.add(priceField);
        panel.add(new JLabel("Stok:"));
        panel.add(stockField);

        int result = JOptionPane.showConfirmDialog(this, panel, "Yeni Ürün Ekle",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

<<<<<<< HEAD
<<<<<<< HEAD
        if (result == JOptionPane.OK_OPTION)
        {
            try
            {
=======
        if (result == JOptionPane.OK_OPTION) {
            try {
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
        if (result == JOptionPane.OK_OPTION) {
            try {
>>>>>>> fa0ea9d (değişiklikler eklendi)
                String name = nameField.getText();
                String desc = descField.getText();
                double price = Double.parseDouble(priceField.getText());
                int stock = Integer.parseInt(stockField.getText());

                Product product = new Product.ProductBuilder()
                        .setName(name)
                        .setDescription(desc)
                        .setPrice(price)
                        .setStock(stock)
                        .build();

                productDAO.addProduct(product);
                loadProductsFromDatabase();

<<<<<<< HEAD
<<<<<<< HEAD
            } catch (Exception e)
            {
=======
            } catch (Exception e) {
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
            } catch (Exception e) {
>>>>>>> fa0ea9d (değişiklikler eklendi)
                JOptionPane.showMessageDialog(this, "Lütfen geçerli bilgiler girin.", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public void removeSelectedProduct()
    {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1)
        {
            int confirm = JOptionPane.showConfirmDialog(this, "Bu ürünü silmek istediğinize emin misiniz?", "Onay", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION)
            {
=======
=======
>>>>>>> fa0ea9d (değişiklikler eklendi)
    public void removeSelectedProduct() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Bu ürünü silmek istediğinize emin misiniz?", "Onay", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
<<<<<<< HEAD
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
>>>>>>> fa0ea9d (değişiklikler eklendi)
                int id = (int) model.getValueAt(selectedRow, 0);
                productDAO.deleteProduct(id);
                loadProductsFromDatabase();
            }
<<<<<<< HEAD
<<<<<<< HEAD
        } else
        {
=======
        } else {
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
        } else {
>>>>>>> fa0ea9d (değişiklikler eklendi)
            JOptionPane.showMessageDialog(this, "Lütfen silmek için bir ürün seçin.");
        }
    }
}
