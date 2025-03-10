package org.example.windows;

import javax.swing.*;
import java.awt.*;

public class RegisterScreen {
    public RegisterScreen(){
        JFrame frame = new JFrame("Register Screen");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(47, 47, 145));

        JLabel titleLabel = new JLabel("Register", SwingConstants.CENTER);
        titleLabel.setBounds(50, 30, 700, 30);
        titleLabel.setForeground(new Color(250, 250, 250));
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(titleLabel);

        JLabel nameLabel = new JLabel("Full name:");
        nameLabel.setBounds(50, 155, 100, 25);
        nameLabel.setForeground(new Color(191, 191, 191));
        nameLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JTextField nameField = new JTextField();
        nameField.setBounds(280, 150, 250, 40);
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel cpfLabel = new JLabel("CPF:");
        cpfLabel.setBounds(50, 225, 100, 25);
        cpfLabel.setForeground(new Color(191, 191, 191));
        cpfLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JTextField cpfField = new JTextField();
        cpfField.setBounds(280, 220, 250, 40);
        panel.add(cpfLabel);
        panel.add(cpfField);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(50, 295, 100, 25);
        phoneLabel.setForeground(new Color(191, 191, 191));
        phoneLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JTextField phoneField = new JTextField();
        phoneField.setBounds(280, 295, 250, 40);
        panel.add(phoneLabel);
        panel.add(phoneField);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(280, 400, 250, 50);
        registerButton.setForeground(new Color(27, 27, 27));
        registerButton.setBackground(new Color(198, 198, 198));
        panel.add(registerButton);
        
        JButton backButton = new JButton("Back");
        backButton.setBounds(280, 470, 250, 50);
        backButton.setForeground(new Color(27, 27, 27));
        backButton.setBackground(new Color(198, 198, 198));
        panel.add(backButton);

        backButton.addActionListener(e -> {
            frame.dispose();
            new LoginScreen();
        });

        frame.add(panel);
        frame.setVisible(true);
    }


}
