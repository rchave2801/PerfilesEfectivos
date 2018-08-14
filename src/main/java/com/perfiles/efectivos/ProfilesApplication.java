package com.perfiles.efectivos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import com.perfiles.efectivos.views.main.MainView;

public class ProfilesApplication {

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("MainView");
        mainFrame.setContentPane(new MainView().getContentPane());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);

        mainFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                int i= JOptionPane.showConfirmDialog(null, "Desea cerrar la aplicación?");
                if(i==0)
                    System.exit(0);//cierra aplicacion
            }
        });
    }
}
