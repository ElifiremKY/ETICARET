package ui;

import javax.swing.*;
import java.awt.*;

<<<<<<< HEAD
<<<<<<< HEAD
public class SellerPanel extends JFrame
{
    public SellerPanel()
    {
=======
public class SellerPanel extends JFrame {
    public SellerPanel() {
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
public class SellerPanel extends JFrame {
    public SellerPanel() {
>>>>>>> fa0ea9d (değişiklikler eklendi)
        setTitle("Satıcı Paneli");
        setSize(800, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
<<<<<<< HEAD
<<<<<<< HEAD
=======

        // 'seller' rolüyle ürün panelini oluşturuyoruz, sepete ekleme işlemi yapılmadığı için CartManager gereksiz
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======

        // 'seller' rolüyle ürün panelini oluşturuyoruz, sepete ekleme işlemi yapılmadığı için CartManager gereksiz
>>>>>>> fa0ea9d (değişiklikler eklendi)
        ProductTablePanel tablePanel = new ProductTablePanel("seller");
        mainPanel.add(tablePanel, BorderLayout.CENTER);

        // Butonlar paneli
        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton addButton = new JButton("Ürün Ekle");
        JButton removeButton = new JButton("Ürün Sil");
        JButton exitButton = new JButton("Çıkış Yap");

        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(exitButton);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Buton işlevleri
<<<<<<< HEAD
<<<<<<< HEAD
        exitButton.addActionListener(e ->
        {
=======
        exitButton.addActionListener(e -> {
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
        exitButton.addActionListener(e -> {
>>>>>>> fa0ea9d (değişiklikler eklendi)
            dispose();
            new LoginFrame();
        });

<<<<<<< HEAD
<<<<<<< HEAD
        addButton.addActionListener(e ->
        {
            tablePanel.showAddProductDialog();
        });

        removeButton.addActionListener(e ->
        {
=======
=======
>>>>>>> fa0ea9d (değişiklikler eklendi)
        addButton.addActionListener(e -> {
            tablePanel.showAddProductDialog();
        });

        removeButton.addActionListener(e -> {
<<<<<<< HEAD
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
>>>>>>> fa0ea9d (değişiklikler eklendi)
            tablePanel.removeSelectedProduct();
        });

        add(mainPanel);
        setVisible(true);
    }
}
