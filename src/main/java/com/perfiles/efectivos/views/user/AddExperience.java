/*
 * Created by JFormDesigner on Sun Jul 29 18:24:07 COT 2018
 */

package com.perfiles.efectivos.views.user;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Ricardo Alonso
 */
public class AddExperience extends JFrame {
    public AddExperience() {
        initComponents();
    }

    private void btnAgregarActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void btnCancelarActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ricardo Alonso
        label1 = new JLabel();
        label3 = new JLabel();
        txtPosition = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        txtInitialDate = new JTextField();
        txtEndDate = new JTextField();
        txtCompany = new JTextField();
        scrollPane1 = new JScrollPane();
        taFunctions = new JTextArea();
        label8 = new JLabel();
        txtSearch = new JTextField();
        lblName = new JLabel();
        btnCancel = new JButton();
        btnAdd = new JButton();

        //======== this ========
        setTitle("Perfiles Efectivos");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Nueva Experiencia Laboral");
        label1.setFont(new Font(".SF NS Text", Font.PLAIN, 18));
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label3 ----
        label3.setText("Cargo");
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- txtPosition ----
        txtPosition.setHorizontalAlignment(SwingConstants.LEFT);
        txtPosition.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- label4 ----
        label4.setText("Fecha inicio");
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- label5 ----
        label5.setText("Fecha fin");
        label5.setHorizontalAlignment(SwingConstants.CENTER);
        label5.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- label6 ----
        label6.setText("Empresa");
        label6.setHorizontalAlignment(SwingConstants.CENTER);
        label6.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- label7 ----
        label7.setText("Funciones");
        label7.setHorizontalAlignment(SwingConstants.CENTER);
        label7.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- txtInitialDate ----
        txtInitialDate.setHorizontalAlignment(SwingConstants.LEFT);
        txtInitialDate.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- txtEndDate ----
        txtEndDate.setHorizontalAlignment(SwingConstants.LEFT);
        txtEndDate.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- txtCompany ----
        txtCompany.setHorizontalAlignment(SwingConstants.LEFT);
        txtCompany.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //======== scrollPane1 ========
        {

            //---- taFunctions ----
            taFunctions.setFont(new Font("Monospaced", Font.PLAIN, 16));
            scrollPane1.setViewportView(taFunctions);
        }

        //---- label8 ----
        label8.setText("Buscar perfil");
        label8.setHorizontalAlignment(SwingConstants.CENTER);
        label8.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- txtSearch ----
        txtSearch.setHorizontalAlignment(SwingConstants.LEFT);
        txtSearch.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- lblName ----
        lblName.setFont(new Font(".SF NS Text", Font.ITALIC, 14));
        lblName.setHorizontalAlignment(SwingConstants.CENTER);

        //---- btnCancel ----
        btnCancel.setText("Cancelar");
        btnCancel.setFont(new Font(".SF NS Text", Font.PLAIN, 16));
        btnCancel.addActionListener(e -> btnAgregarActionPerformed(e));

        //---- btnAdd ----
        btnAdd.setText("Agregar");
        btnAdd.setFont(new Font(".SF NS Text", Font.PLAIN, 16));
        btnAdd.addActionListener(e -> btnAgregarActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 21, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(btnAdd)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCancel))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label6, GroupLayout.Alignment.TRAILING)
                                        .addComponent(label7, GroupLayout.Alignment.TRAILING)
                                        .addComponent(label8, GroupLayout.Alignment.TRAILING)
                                        .addComponent(label3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(txtPosition, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtInitialDate, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEndDate, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCompany, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label1)))))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addContainerGap(201, Short.MAX_VALUE)
                            .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)))
                    .addContainerGap(71, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(31, Short.MAX_VALUE)
                    .addComponent(label1)
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label8))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPosition, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtInitialDate, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEndDate, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCompany, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label6))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label7))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 18, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ricardo Alonso
    private JLabel label1;
    private JLabel label3;
    private JTextField txtPosition;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JTextField txtInitialDate;
    private JTextField txtEndDate;
    private JTextField txtCompany;
    private JScrollPane scrollPane1;
    private JTextArea taFunctions;
    private JLabel label8;
    private JTextField txtSearch;
    private JLabel lblName;
    private JButton btnCancel;
    private JButton btnAdd;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
