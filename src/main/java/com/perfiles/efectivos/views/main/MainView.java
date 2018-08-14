/*
 * Created by JFormDesigner on Sun Jul 29 16:07:05 COT 2018
 */
package com.perfiles.efectivos.views.main;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

import com.perfiles.efectivos.views.observations.AddObservation;
import com.perfiles.efectivos.views.observations.ViewObservation;
import com.perfiles.efectivos.views.user.AddExperience;
import com.perfiles.efectivos.views.user.AddUser;
import com.perfiles.efectivos.views.user.EditUser;

/**
 * @author Ricardo Chaverra
 */
public class MainView extends JFrame {
    public MainView() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ricardo Alonso
        btnAddUser = new JButton();
        btnEditUser = new JButton();
        btnAddExperience = new JButton();
        btnAddObservation = new JButton();
        btnViewObservation = new JButton();

        //======== this ========
        setTitle("Perfiles Efectivos");
        setIconImage(new ImageIcon("/Users/rchave/Documents/Projects/PerfilesEfectivos/App/src/main/resources/images/AddUser.png").getImage());
        Container contentPane = getContentPane();

        //---- btnAddUser ----
        btnAddUser.setText("Nuevo perfil");
        btnAddUser.setIcon(new ImageIcon("/Users/rchave/Documents/Projects/PerfilesEfectivos/App/src/main/resources/images/AddUser.png"));
        btnAddUser.setBackground(SystemColor.window);
        btnAddUser.addActionListener(e -> btnAddUserActionPerformed(e));

        //---- btnEditUser ----
        btnEditUser.setText("Editar perfil");
        btnEditUser.setIcon(new ImageIcon("/Users/rchave/Documents/Projects/PerfilesEfectivos/App/src/main/resources/images/EditUser.png"));
        btnEditUser.setBackground(SystemColor.window);
        btnEditUser.addActionListener(e -> btnEditUserActionPerformed(e));

        //---- btnAddExperience ----
        btnAddExperience.setText("A\u00f1adir experiencia");
        btnAddExperience.setIcon(new ImageIcon("/Users/rchave/Documents/Projects/PerfilesEfectivos/App/src/main/resources/images/AddExperience.png"));
        btnAddExperience.setBackground(SystemColor.window);
        btnAddExperience.addActionListener(e -> btnAddExperienceActionPerformed(e));

        //---- btnAddObservation ----
        btnAddObservation.setText("A\u00f1adir observaci\u00f3n");
        btnAddObservation.setIcon(new ImageIcon("/Users/rchave/Documents/Projects/PerfilesEfectivos/App/src/main/resources/images/AddObservation.png"));
        btnAddObservation.setBackground(SystemColor.window);
        btnAddObservation.addActionListener(e -> btnAddObservationActionPerformed(e));

        //---- btnViewObservation ----
        btnViewObservation.setText("Ver observaci\u00f3n");
        btnViewObservation.setIcon(new ImageIcon("/Users/rchave/Documents/Projects/PerfilesEfectivos/App/src/main/resources/images/AddUser.png"));
        btnViewObservation.setBackground(SystemColor.window);
        btnViewObservation.addActionListener(e -> btnViewObservationActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAddUser, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddObservation, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(btnEditUser, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnViewObservation, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(btnAddExperience, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddUser, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditUser, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddExperience, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddObservation, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnViewObservation, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(23, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ricardo Alonso
    private JButton btnAddUser;
    private JButton btnEditUser;
    private JButton btnAddExperience;
    private JButton btnAddObservation;
    private JButton btnViewObservation;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void btnAddUserActionPerformed(ActionEvent e) {
        JFrame mainFrame = new JFrame("AddUser");
        mainFrame.setContentPane(new AddUser().getContentPane());
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void btnEditUserActionPerformed(ActionEvent e) {
        JFrame mainFrame = new JFrame("EditUser");
        mainFrame.setContentPane(new EditUser().getContentPane());
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void btnAddExperienceActionPerformed(ActionEvent e) {
        JFrame mainFrame = new JFrame("AddExperience");
        mainFrame.setContentPane(new AddExperience().getContentPane());
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void btnAddObservationActionPerformed(ActionEvent e) {
        JFrame mainFrame = new JFrame("AddObservation");
        mainFrame.setContentPane(new AddObservation().getContentPane());
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void btnViewObservationActionPerformed(ActionEvent e) {
        JFrame mainFrame = new JFrame("ViewObservation");
        mainFrame.setContentPane(new ViewObservation().getContentPane());
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}