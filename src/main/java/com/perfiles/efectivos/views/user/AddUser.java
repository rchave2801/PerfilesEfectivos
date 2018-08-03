/*
 * Created by JFormDesigner on Sun Jul 29 17:33:49 COT 2018
 */

package com.perfiles.efectivos.views.user;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Ricardo Alonso
 */
public class AddUser extends JFrame {
    public AddUser() {
        initComponents();
    }

    private void btnCancelarActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void btnAgregarActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ricardo Alonso
        label1 = new JLabel();
        txtId = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        txtName = new JTextField();
        label4 = new JLabel();
        txtPhone = new JTextField();
        label5 = new JLabel();
        txtEmail = new JTextField();
        label6 = new JLabel();
        txtAddress = new JTextField();
        label7 = new JLabel();
        txtProfession = new JTextField();
        btnAdd = new JButton();
        btnCancel = new JButton();

        //======== this ========
        setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        setTitle("Perfil del trabajador");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Nombre");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- txtId ----
        txtId.setHorizontalAlignment(SwingConstants.LEFT);

        //---- label2 ----
        label2.setText("Nuevo perfil");
        label2.setFont(new Font(".SF NS Text", Font.PLAIN, 18));
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label3 ----
        label3.setText("C\u00e9dula");
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- txtName ----
        txtName.setHorizontalAlignment(SwingConstants.LEFT);

        //---- label4 ----
        label4.setText("Tel\u00e9fono");
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- txtPhone ----
        txtPhone.setHorizontalAlignment(SwingConstants.LEFT);

        //---- label5 ----
        label5.setText("Direcci\u00f3n");
        label5.setHorizontalAlignment(SwingConstants.CENTER);
        label5.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- txtEmail ----
        txtEmail.setHorizontalAlignment(SwingConstants.LEFT);

        //---- label6 ----
        label6.setText("Email");
        label6.setHorizontalAlignment(SwingConstants.CENTER);
        label6.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- txtAddress ----
        txtAddress.setHorizontalAlignment(SwingConstants.LEFT);

        //---- label7 ----
        label7.setText("Profesi\u00f3n");
        label7.setHorizontalAlignment(SwingConstants.CENTER);
        label7.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- txtProfession ----
        txtProfession.setHorizontalAlignment(SwingConstants.LEFT);

        //---- btnAdd ----
        btnAdd.setText("Agregar");
        btnAdd.setFont(new Font(".SF NS Text", Font.PLAIN, 16));
        btnAdd.addActionListener(e -> btnAgregarActionPerformed(e));

        //---- btnCancel ----
        btnCancel.setText("Cancelar");
        btnCancel.setFont(new Font(".SF NS Text", Font.PLAIN, 16));
        btnCancel.addActionListener(e -> btnCancelarActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(153, Short.MAX_VALUE)
                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(190, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 215, Short.MAX_VALUE)
                            .addComponent(btnAdd)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancel))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label6, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(label5, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
                                .addComponent(label3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtId, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtProfession, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 69, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(txtId, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6)
                        .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label7)
                        .addComponent(txtProfession, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(22, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ricardo Alonso
    private JLabel label1;
    private JTextField txtId;
    private JLabel label2;
    private JLabel label3;
    private JTextField txtName;
    private JLabel label4;
    private JTextField txtPhone;
    private JLabel label5;
    private JTextField txtEmail;
    private JLabel label6;
    private JTextField txtAddress;
    private JLabel label7;
    private JTextField txtProfession;
    private JButton btnAdd;
    private JButton btnCancel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
