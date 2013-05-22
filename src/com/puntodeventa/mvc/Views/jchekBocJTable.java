/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntodeventa.mvc.Views;

import java.awt.Component;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Nato
 */
public class jchekBocJTable extends JFrame {

    private static final long serialVersionUID = 1L;

    class TABLE_MODEL extends DefaultTableModel {

        private static final long serialVersionUID = 1L;

        public TABLE_MODEL() {
            addColumn("A");
            for (int index = 0; index < 10; index++) {
                Object object6[] = {new Boolean(false)};
                addRow(object6);
            }
        }
    }

    class CELL_RENDERER extends JCheckBox implements TableCellRenderer {

        private static final long serialVersionUID = 1L;

        public CELL_RENDERER() {
            setHorizontalAlignment(JLabel.CENTER);
        }

        @Override
        public Component getTableCellRendererComponent(JTable arg0,
                Object value, boolean arg2, boolean arg3, int arg4, int arg5) {
            setSelected((value != null && ((Boolean) value).booleanValue()));
            setBackground(arg0.getBackground());
            setHorizontalAlignment(JLabel.CENTER);
            return this;
        }
    }

    class CELL_EDITOR extends DefaultCellEditor {

        private static final long serialVersionUID = 1L;

        public CELL_EDITOR(JCheckBox checkBox) {
            super(checkBox);
            checkBox.setHorizontalAlignment(JLabel.CENTER);
        }
    }
    static JTable table = null;

    public jchekBocJTable() {
        TABLE_MODEL name = new TABLE_MODEL();
        table = new JTable(name);
        table.getColumn("A").setCellRenderer(new CELL_RENDERER());
        table.getColumn("A").setMaxWidth(130);
        table.getColumn("A").setCellEditor(new CELL_EDITOR(new JCheckBox()));
        JScrollPane jScrollPane = new JScrollPane(table);
        table.setRowSelectionAllowed(true);

        add(jScrollPane);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new jchekBocJTable();
            }
        });
    }
}