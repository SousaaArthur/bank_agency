package org.example.windows;

import javax.swing.*;
import java.awt.*;

public class MainScreen {

    public static void main(String[] args) {
        new MainScreen();
    }

    public MainScreen(){
        JFrame frame = new JFrame("Main Screen");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(47, 47, 145));

        JLabel titleLabel = new JLabel("Bank agency", SwingConstants.CENTER);
        titleLabel.setBounds(50, 30, 700, 30);
        titleLabel.setForeground(new Color(250, 250, 250));
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(titleLabel);

        JLabel userNameLabel = new JLabel("User name:" + " Admin", SwingConstants.CENTER);
        userNameLabel.setBounds(50, 100, 700, 30);
        userNameLabel.setForeground(new Color(191, 191, 191));
        userNameLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(userNameLabel);

        JLabel balanceLabel = new JLabel("Balance: " + "1.200,59", SwingConstants.CENTER);
        balanceLabel.setBounds(50, 130, 700, 30);
        balanceLabel.setForeground(new Color(191, 191, 191));
        balanceLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(balanceLabel);

        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(120, 200, 250, 50);
        depositButton.setForeground(new Color(27, 27, 27));
        depositButton.setBackground(new Color(198, 198, 198));
        depositButton.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(depositButton);

        depositButton.addActionListener(e -> {
            depositScreen();
        });

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(420, 200, 250, 50);
        withdrawButton.setForeground(new Color(27, 27, 27));
        withdrawButton.setBackground(new Color(198, 198, 198));
        withdrawButton.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(withdrawButton);

        withdrawButton.addActionListener(e -> {
            withdrawScreen();
        });

        JTextArea historicArea = new JTextArea();
        historicArea.setBounds(50, 300, 700, 200);
        historicArea.setBackground(new Color(198, 198, 198));
        historicArea.setFont(new Font("Arial", Font.BOLD, 14));
        historicArea.setLineWrap(true);
        historicArea.setEditable(false);
        panel.add(historicArea);

        JButton backButton = new JButton("Back");
        backButton.setBounds(280, 530, 250, 50);
        backButton.setForeground(new Color(27, 27, 27));
        backButton.setBackground(new Color(198, 198, 198));
        backButton.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(backButton);

        backButton.addActionListener(e -> {
            frame.dispose();
            new LoginScreen();
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    void depositScreen(){
        JFrame frame = new JFrame("Deposit Screen");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(47, 47, 145));

        JLabel titleLabel = new JLabel("Deposit", SwingConstants.CENTER);
        titleLabel.setBounds(50, 30, 300, 30);
        titleLabel.setForeground(new Color(250, 250, 250));
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(titleLabel);

        JTextField valueField = new JTextField();
        valueField.setBounds(50, 70, 300, 30);
        panel.add(valueField);

        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(50, 110, 300, 30);
        depositButton.setForeground(new Color(27, 27, 27));
        depositButton.setBackground(new Color(198, 198, 198));
        panel.add(depositButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(50, 150, 300, 30);
        cancelButton.setForeground(new Color(27, 27, 27));
        cancelButton.setBackground(new Color(246, 75, 75));
        panel.add(cancelButton);

        cancelButton.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    void withdrawScreen(){
        JFrame frame = new JFrame("Withdraw Screen");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(47, 47, 145));

        JLabel titleLabel = new JLabel("Withdraw", SwingConstants.CENTER);
        titleLabel.setBounds(50, 30, 300, 30);
        titleLabel.setForeground(new Color(250, 250, 250));
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(titleLabel);

        JTextField valueField = new JTextField();
        valueField.setBounds(50, 70, 300, 30);
        panel.add(valueField);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(50, 110, 300, 30);
        withdrawButton.setForeground(new Color(27, 27, 27));
        withdrawButton.setBackground(new Color(198, 198, 198));
        panel.add(withdrawButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(50, 150, 300, 30);
        cancelButton.setForeground(new Color(27, 27, 27));
        cancelButton.setBackground(new Color(246, 75, 75));
        panel.add(cancelButton);

        cancelButton.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
