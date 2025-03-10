package org.example.windows;

import javax.swing.*;
import java.awt.*;

public class LoginScreen {
    public LoginScreen(){
        JFrame frame = new JFrame("Login Screen");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(47, 47, 145));

        JLabel title = new JLabel("Login", SwingConstants.CENTER);
        title.setBounds(50, 30, 700, 30);
        title.setForeground(new Color(250, 250, 250));
        title.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(title);

        JLabel loginLabel = new JLabel("Login:");
        loginLabel.setBounds(50, 155, 80, 25);
        loginLabel.setForeground(new Color(191, 191, 191));
        loginLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JTextField loginField = new JTextField();
        loginField.setBounds(280, 150, 250,40);
        panel.add(loginField);
        panel.add(loginLabel);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 225, 100, 25);
        passwordLabel.setForeground(new Color(191, 191, 191));
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(280, 220, 250, 40);
        panel.add(passwordLabel);
        panel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(280, 300, 250, 50);
        loginButton.setForeground(new Color(27, 27, 27));
        loginButton.setBackground(new Color(198, 198, 198));
        panel.add(loginButton);

        loginButton.addActionListener(e -> {
            frame.dispose();
            new MainScreen();
//            if(loginField.getText().equals("") && new String(passwordField.getPassword()).equals("")){
//                JOptionPane.showConfirmDialog(loginButton, "Erro!! \n Usuário ou senha invalido!","Aviso", JOptionPane.WARNING_MESSAGE);
//            } else {
//                frame.dispose();
//                new MainScreen();
//            }
        });

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(280, 370, 250, 50);
        registerButton.setForeground(new Color(27, 27, 27));
        registerButton.setBackground(new Color(198, 198, 198));
        panel.add(registerButton);

        registerButton.addActionListener(e -> {
            frame.dispose();
            new RegisterScreen();
        });

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(280, 440, 250, 50);
        exitButton.setForeground(new Color(250, 250, 250));
        exitButton.setBackground(new Color(253, 28, 28));
        panel.add(exitButton);

        exitButton.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
