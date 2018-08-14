/*
 * Created by JFormDesigner on Sun Jul 29 18:02:53 COT 2018
 */

package com.perfiles.efectivos.views.user;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Ricardo Alonso
 */
public class EditUser extends JFrame {
    public EditUser() {
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
        label2 = new JLabel();
        label3 = new JLabel();
        label1 = new JLabel();
        label4 = new JLabel();
        label6 = new JLabel();
        label5 = new JLabel();
        label7 = new JLabel();
        btnEdit = new JButton();
        btnCancel = new JButton();
        txtProfession = new JTextField();
        txtEmail = new JTextField();
        txtPhone = new JTextField();
        txtName = new JTextField();
        txtId = new JTextField();
        txtAddress = new JTextField();

        //======== this ========
        setTitle("Perfiles Efectivos");
        Container contentPane = getContentPane();

        //---- label2 ----
        label2.setText("Editar perfil");
        label2.setFont(new Font(".SF NS Text", Font.PLAIN, 18));
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label3 ----
        label3.setText("C\u00e9dula");
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- label1 ----
        label1.setText("Nombre");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- label4 ----
        label4.setText("Tel\u00e9fono");
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- label6 ----
        label6.setText("Email");
        label6.setHorizontalAlignment(SwingConstants.CENTER);
        label6.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- label5 ----
        label5.setText("Direcci\u00f3n");
        label5.setHorizontalAlignment(SwingConstants.CENTER);
        label5.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- label7 ----
        label7.setText("Profesi\u00f3n");
        label7.setHorizontalAlignment(SwingConstants.CENTER);
        label7.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- btnEdit ----
        btnEdit.setText("Editar");
        btnEdit.setFont(new Font(".SF NS Text", Font.PLAIN, 16));
        btnEdit.addActionListener(e -> btnAgregarActionPerformed(e));

        //---- btnCancel ----
        btnCancel.setText("Cancelar");
        btnCancel.setFont(new Font(".SF NS Text", Font.PLAIN, 16));
        btnCancel.addActionListener(e -> btnCancelarActionPerformed(e));

        //---- txtProfession ----
        txtProfession.setHorizontalAlignment(SwingConstants.LEFT);

        //---- txtEmail ----
        txtEmail.setHorizontalAlignment(SwingConstants.LEFT);

        //---- txtPhone ----
        txtPhone.setHorizontalAlignment(SwingConstants.LEFT);

        //---- txtName ----
        txtName.setHorizontalAlignment(SwingConstants.LEFT);

        //---- txtId ----
        txtId.setHorizontalAlignment(SwingConstants.LEFT);

        //---- txtAddress ----
        txtAddress.setHorizontalAlignment(SwingConstants.LEFT);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(47, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 255, Short.MAX_VALUE)
                            .addComponent(btnEdit)
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addComponent(btnCancel))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label6, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label7, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtProfession, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtId, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(29, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(26, Short.MAX_VALUE)
                    .addComponent(label2)
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(txtId, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 30, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 28, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 22, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 28, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label7)
                        .addComponent(txtProfession, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEdit, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(26, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ricardo Alonso
    private JLabel label2;
    private JLabel label3;
    private JLabel label1;
    private JLabel label4;
    private JLabel label6;
    private JLabel label5;
    private JLabel label7;
    private JButton btnEdit;
    private JButton btnCancel;
    private JTextField txtProfession;
    private JTextField txtEmail;
    private JTextField txtPhone;
    private JTextField txtName;
    private JTextField txtId;
    private JTextField txtAddress;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
