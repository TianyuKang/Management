/*
 * Created by JFormDesigner on Mon Mar 27 22:02:05 CST 2017
 */

package UI;

import jdbc.UserDaoImpl;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 * @author Brainrain
 */
public class syllabusManagement extends JTabbedPane {
    public syllabusManagement() {
        initComponents();
    }

    //select
    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        String tableName = textField1.getText().trim();
        rowData = new UserDaoImpl().selectRows(tableName);
        columnNames = new UserDaoImpl().selectCloums(tableName);
        if (rowData == null | columnNames == null){
            JOptionPane.showMessageDialog(null, "Select error", "Update",JOptionPane.ERROR_MESSAGE);
        }

        table1 = new JTable(rowData, columnNames);
        table1.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                int SID = table1.getSelectedRow() + 1;
                String tableName = textField1.getText().trim();
                String columnNmae = table1.getColumnName(table1.getSelectedColumn());
                String value = table1.getValueAt(SID - 1, table1.getSelectedColumn()).toString();
                int i = new UserDaoImpl().updateSyllabus(SID, tableName, columnNmae, value);
                if ( i > 0){
                    JOptionPane.showConfirmDialog(null, "Update successfully!", "Update", JOptionPane.PLAIN_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Update error", "Update",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        scrollPane1.setViewportView(table1);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        panel2 = new JPanel();
        label2 = new JLabel();
        textField2 = new JTextField();
        button2 = new JButton();

        //======== this ========

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("ID     :");
            panel1.add(label1);
            label1.setBounds(130, 18, 45, 25);
            panel1.add(textField1);
            textField1.setBounds(190, 20, 110, textField1.getPreferredSize().height);

            //---- button1 ----
            button1.setText("select");
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(390, 16), button1.getPreferredSize()));
            panel1.add(scrollPane1);
            scrollPane1.setBounds(25, 50, 620, 310);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        addTab("teacher ", panel1);

        //======== panel2 ========
        {
            panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 150));

            //---- label2 ----
            label2.setText("Class  :");
            panel2.add(label2);

            //---- textField2 ----
            textField2.setColumns(10);
            panel2.add(textField2);

            //---- button2 ----
            button2.setText("delete");
            panel2.add(button2);
        }
        addTab("delete", panel2);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JPanel panel2;
    private JLabel label2;
    private JTextField textField2;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private Object [][] rowData;
    private String [] columnNames;
    private JTable table1;
}
