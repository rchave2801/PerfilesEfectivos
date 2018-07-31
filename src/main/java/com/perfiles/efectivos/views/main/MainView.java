/*
 * Created by JFormDesigner on Sun Jul 29 16:07:05 COT 2018
 */

package com.perfiles.efectivos.views.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
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
        lbid = new JLabel();
        txtTextSearch = new JTextField();
        btnSearch = new JButton();
        label2 = new JLabel();

        //======== this ========
        setTitle("Perfiles Efectivos");
        Container contentPane = getContentPane();

        //---- lbid ----
        lbid.setText("C\u00e9dula:");
        lbid.setHorizontalAlignment(SwingConstants.CENTER);

        //---- txtTextSearch ----
        txtTextSearch.setHorizontalAlignment(SwingConstants.CENTER);

        //---- btnSearch ----
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(e -> {
			btnSearchOnClick(e);
			btnSearchOnClick(e);
		});

        //---- label2 ----
        label2.setText("Buscar hoja de vida");
        label2.setFont(new Font(".SF NS Text", Font.PLAIN, 16));
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(label2)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(lbid, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTextSearch, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lbid, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTextSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch))
                    .addContainerGap(53, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ricardo Alonso
    private JLabel lbid;
    private JTextField txtTextSearch;
    private JButton btnSearch;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
