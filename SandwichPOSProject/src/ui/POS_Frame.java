package ui;

import javax.swing.*;
import java.awt.*;

public class POS_Frame extends JFrame {
    JPanel mainPanel = new JPanel();
    JPanel resultPanel = new JPanel();
    JLabel baseMenuLabel = new JLabel();
    JLabel condimentMenuLabel = new JLabel();


    public POS_Frame() {
        initUI();

    }

    public final void initUI() {

        setVisible(true);
        setBounds(100, 100, 800, 750);
        setSize(985, 660);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        initButton();
        initLabel();

        mainPanel.setBackground(new Color(239, 255, 165));
        mainPanel.setBounds(0, 0, 684, 660);
        getContentPane().add(mainPanel);
        mainPanel.setLayout(null);


        resultPanel.setBounds(684, 0, 301, 660);
        resultPanel.setBackground(new Color(160, 255, 206));
        getContentPane().add(resultPanel);
        resultPanel.setLayout(null);


    }

    public final void initLabel(){
        baseMenuLabel.setBounds(60, 60, 200, 18);
        baseMenuLabel.setText("text");
        baseMenuLabel.setHorizontalAlignment(JLabel.CENTER);
        resultPanel.add(baseMenuLabel);

        condimentMenuLabel.setBounds(60, 160, 200, 18);
        condimentMenuLabel.setText("text");
        condimentMenuLabel.setHorizontalAlignment(JLabel.CENTER);
        resultPanel.add(condimentMenuLabel);
    }

    public final void initButton() {
        //main
        JButton btn_BLT = new JButton("BLT");
        btn_BLT.setBounds(50, 37, 150, 70);
        mainPanel.add(btn_BLT);

        JButton btn_ItalianBMT = new JButton("ItalianBMT");
        btn_ItalianBMT.setBounds(200, 37, 150, 70);
        mainPanel.add(btn_ItalianBMT);

        JButton btn_MeatballSandwich = new JButton("MeatballSandwich");
        btn_MeatballSandwich.setBounds(350, 37, 150, 70);
        mainPanel.add(btn_MeatballSandwich);

        JButton btn_HamSandwich = new JButton("HamSandwich");
        btn_HamSandwich.setBounds(500, 37, 150, 70);
        mainPanel.add(btn_HamSandwich);

        btn_BLT.addActionListener(e -> {
            baseMenuLabel.setText(btn_BLT.getText());
        });

        btn_ItalianBMT.addActionListener(e -> {
            baseMenuLabel.setText(btn_ItalianBMT.getText());
        });

        btn_MeatballSandwich.addActionListener(e -> {
            baseMenuLabel.setText(btn_MeatballSandwich.getText());
        });

        btn_HamSandwich.addActionListener(e -> {
            baseMenuLabel.setText(btn_HamSandwich.getText());
        });


        //condiment
        JButton btn_Bacon = new JButton("Bacon");
        btn_Bacon.setBounds(50, 137, 150, 70);
        mainPanel.add(btn_Bacon);

        JButton btn_Cheese = new JButton("Cheese");
        btn_Cheese.setBounds(200, 137, 150, 70);
        mainPanel.add(btn_Cheese);

        JButton btn_EggMayo = new JButton("EggMayo");
        btn_EggMayo.setBounds(350, 137, 150, 70);
        mainPanel.add(btn_EggMayo);

        JButton btn_Pepperoni = new JButton("Pepperoni");
        btn_Pepperoni.setBounds(500, 137, 150, 70);
        mainPanel.add(btn_Pepperoni);


        btn_Bacon.addActionListener(e -> {
            condimentMenuLabel.setText(btn_Bacon.getText());
        });

        btn_Cheese.addActionListener(e -> {
            condimentMenuLabel.setText(btn_Cheese.getText());
        });

        btn_EggMayo.addActionListener(e -> {
            condimentMenuLabel.setText(btn_EggMayo.getText());
        });

        btn_Pepperoni.addActionListener(e -> {
            condimentMenuLabel.setText(btn_Pepperoni.getText());
        });

    }

}