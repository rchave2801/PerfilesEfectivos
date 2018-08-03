/*
 * Created by JFormDesigner on Sun Jul 29 16:07:05 COT 2018
 */

package com.perfiles.efectivos.views.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Ricardo Chaverra
 */
public class MainView extends JFrame {
    public MainView() {
        initComponents();
    }

    private void btnSearchOnClick(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ricardo Alonso
        btnAddUser = new JButton();

        //======== this ========
        setTitle("Perfiles Efectivos");
        setIconImage(new ImageIcon("/Users/rchave/Documents/Projects/PerfilesEfectivos/App/src/main/resources/images/AddUser.png").getImage());
        Container contentPane = getContentPane();

        //---- btnAddUser ----
        btnAddUser.setText("Nuevo perfil");
        btnAddUser.setIcon(new ImageIcon("/Users/rchave/Documents/Projects/PerfilesEfectivos/App/src/main/resources/images/AddUser.png"));
        btnAddUser.setBackground(SystemColor.window);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddUser, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(348, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(btnAddUser, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(222, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ricardo Alonso
    private JButton btnAddUser;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
