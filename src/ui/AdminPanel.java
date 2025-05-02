package ui;

import javax.swing.*;
import java.awt.*;
<<<<<<< HEAD
<<<<<<< HEAD

public class AdminPanel extends JFrame
{
    public AdminPanel()
    {
=======
=======
>>>>>>> fa0ea9d (değişiklikler eklendi)
import model.CartManager;

public class AdminPanel extends JFrame {
    public AdminPanel() {
<<<<<<< HEAD
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
>>>>>>> fa0ea9d (değişiklikler eklendi)
        setTitle("Admin Paneli");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
<<<<<<< HEAD
<<<<<<< HEAD
        mainPanel.add(new ProductTablePanel("admin"), BorderLayout.CENTER);

        JButton exitButton = new JButton("Çıkış Yap");
        exitButton.addActionListener(e ->
        {
=======
=======
>>>>>>> fa0ea9d (değişiklikler eklendi)

        // CartManager'ı oluşturuyoruz
        CartManager cartManager = new CartManager();

        // ProductTablePanel'e role ve cartManager parametrelerini geçiyoruz
        mainPanel.add(new ProductTablePanel("admin", cartManager), BorderLayout.CENTER);

        JButton exitButton = new JButton("Çıkış Yap");
        exitButton.addActionListener(e -> {
<<<<<<< HEAD
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
>>>>>>> fa0ea9d (değişiklikler eklendi)
            dispose();
            new LoginFrame();
        });
        mainPanel.add(exitButton, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }
<<<<<<< HEAD
<<<<<<< HEAD
}
=======
}
>>>>>>> fa0ea9d (değişiklikler eklendi)
=======
}
>>>>>>> fa0ea9d (değişiklikler eklendi)
