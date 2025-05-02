package ui;

<<<<<<< HEAD
import javax.swing.*;
import java.awt.*;

public class CustomerPanel extends JFrame
{
    public CustomerPanel()
    {
        setTitle("Müşteri Paneli");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(new ProductTablePanel("customer"), BorderLayout.CENTER);

        JButton exitButton = new JButton("Çıkış Yap");
        exitButton.addActionListener(e ->
        {
            dispose();
            new LoginFrame();
        });
        mainPanel.add(exitButton, BorderLayout.SOUTH);
=======
import model.CartManager;
import model.OrderManager;

import javax.swing.*;
import java.awt.*;

public class CustomerPanel extends JFrame {
    public CustomerPanel() {
        setTitle("Müşteri Paneli");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Sepet ve Sipariş yöneticileri
        OrderManager orderManager = new OrderManager();
        CartManager cartManager = new CartManager();
        cartManager.addObserver(orderManager); // Observer bağlantısı

        // Ürün paneli
        ProductTablePanel productPanel = new ProductTablePanel("customer", cartManager);
        mainPanel.add(productPanel, BorderLayout.CENTER);

        // Alt panel
        JPanel bottomPanel = new JPanel(new FlowLayout());

        JButton ordersButton = new JButton("Siparişlerim");
        ordersButton.addActionListener(e -> new OrderDialog(orderManager));

        JButton exitButton = new JButton("Çıkış Yap");
        exitButton.addActionListener(e -> {
            dispose();
            new LoginFrame();
        });

        bottomPanel.add(ordersButton);
        bottomPanel.add(exitButton);

        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
>>>>>>> fa0ea9d (değişiklikler eklendi)

        add(mainPanel);
        setVisible(true);
    }
<<<<<<< HEAD
=======

    // Sipariş tamamlama işlemi
    private void checkout(CartManager cartManager) {
        if (cartManager.isCartEmpty()) {
            JOptionPane.showMessageDialog(this, "Sepete ürün ekleyin.", "Hata", JOptionPane.ERROR_MESSAGE);
        } else {
            cartManager.checkout(); // Siparişi tamamla
            JOptionPane.showMessageDialog(this, "Siparişiniz başarıyla oluşturuldu.", "Sipariş", JOptionPane.INFORMATION_MESSAGE);
        }
    }

>>>>>>> fa0ea9d (değişiklikler eklendi)
}
