package com.perfiles.efectivos;

import javax.swing.JFrame;
import com.perfiles.efectivos.views.main.MainView;

public class ProfilesApplication {

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("MainView");
        mainFrame.setContentPane(new MainView().getContentPane());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
