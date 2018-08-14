/*
 * Created by JFormDesigner on Thu Aug 02 21:35:59 COT 2018
 */

package com.perfiles.efectivos.views.observations;

import java.awt.*;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

/**
 * @author Ricardo Alonso
 */
public class ViewObservation extends JFrame {
    public ViewObservation() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ricardo Alonso
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        lblId = new JLabel();
        txtId = new JTextField();
        lblObservation = new JLabel();

        //======== this ========
        setTitle("Perfiles Efectivos");
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setRowSelectionAllowed(false);
            table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null},
                },
                new String[] {
                    "Fecha", "Observaci\u00f3n"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    String.class, String.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            {
                TableColumnModel cm = table1.getColumnModel();
                cm.getColumn(0).setPreferredWidth(105);
                cm.getColumn(1).setPreferredWidth(400);
            }
            table1.setBorder(null);
            table1.setFont(new Font(".SF NS Text", Font.PLAIN, 16));
            scrollPane1.setViewportView(table1);
        }

        //---- lblId ----
        lblId.setText("C\u00e9dula");
        lblId.setHorizontalAlignment(SwingConstants.CENTER);
        lblId.setFont(new Font(".SF NS Text", Font.PLAIN, 16));

        //---- txtId ----
        txtId.setHorizontalAlignment(SwingConstants.LEFT);

        //---- lblObservation ----
        lblObservation.setText("Ver observaciones");
        lblObservation.setFont(new Font(".SF NS Text", Font.PLAIN, 18));
        lblObservation.setHorizontalAlignment(SwingConstants.CENTER);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 576, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(lblId, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(txtId, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(lblObservation, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                            .addGap(197, 197, 197)))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(30, Short.MAX_VALUE)
                    .addComponent(lblObservation)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblId))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ricardo Alonso
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel lblId;
    private JTextField txtId;
    private JLabel lblObservation;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
