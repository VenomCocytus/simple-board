package org.sehknet;

import javax.swing.*;
import java.awt.*;

public class BoardApp extends JFrame {

    public BoardApp(){
        initUI();
    }

    private void initUI(){
        add(new Board());
        setSize(500, 500);
//        setTitle("Sehkmet's Donut");
        setTitle("Sehkmet Profile picture");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            BoardApp app = new BoardApp();
            app.setVisible(true);
        });
    }
}