/*
 * Created by JFormDesigner on Mon Jul 30 22:45:51 COT 2018
 */

package com.perfiles.efectivos.views.observations;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Ricardo Chaverra
 */
public class AddObservation extends JFrame {
    public AddObservation() {
        initComponents();
    }

    private void btnAgregarActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void btnAddActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void btnCancelActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ricardo Alonso
        lblId = new JLabel();
        txtId = new JTextField();
        lblObservation = new JLabel();
        lblText = new JLabel();
        scrollPane1 = new JScrollPane();
        txaObservation = new JTextArea();
        btnCancel = new JButton();
        btnAdd = new JButton();

        //======== this ========
        setTitle("Perfiles Efectivos");
        Container contentPane = getContentPane();

        //---- lblId ----
        lblId.setText("C\u00e9dula");
        lblId.setHorizontalAlignment(SwingConstants.CENTER);
        lblId.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- txtId ----
        txtId.setHorizontalAlignment(SwingConstants.LEFT);

        //---- lblObservation ----
        lblObservation.setText("A\u00f1adir observaci\u00f3n");
        lblObservation.setFont(new Font(".SF NS Text", Font.PLAIN, 18));
        lblObservation.setHorizontalAlignment(SwingConstants.CENTER);

        //---- lblText ----
        lblText.setText("Observaci\u00f3n");
        lblText.setHorizontalAlignment(SwingConstants.CENTER);
        lblText.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(txaObservation);
        }

        //---- btnCancel ----
        btnCancel.setText("Cancelar");
        btnCancel.setFont(new Font(".SF NS Text", Font.PLAIN, 16));
        btnCancel.addActionListener(e -> {
			btnAgregarActionPerformed(e);
			btnCancelActionPerformed(e);
		});

        //---- btnAdd ----
        btnAdd.setText("Agregar");
        btnAdd.setFont(new Font(".SF NS Text", Font.PLAIN, 16));
        btnAdd.addActionListener(e -> {
			btnAgregarActionPerformed(e);
			btnAddActionPerformed(e);
		});

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(lblId, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblText))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(scrollPane1, GroupLayout.Alignment.LEADING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(btnAdd)
                            .addGap(18, 121, Short.MAX_VALUE)
                            .addComponent(btnCancel))
                        .addComponent(txtId, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(114, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(177, Short.MAX_VALUE)
                    .addComponent(lblObservation, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(188, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(22, Short.MAX_VALUE)
                    .addComponent(lblObservation)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblId)
                        .addComponent(txtId, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(lblText)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(23, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ricardo Alonso
    private JLabel lblId;
    private JTextField txtId;
    private JLabel lblObservation;
    private JLabel lblText;
    private JScrollPane scrollPane1;
    private JTextArea txaObservation;
    private JButton btnCancel;
    private JButton btnAdd;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
