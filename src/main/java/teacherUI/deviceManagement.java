/*
 * Created by JFormDesigner on Thu Mar 30 22:34:22 CST 2017
 */

package teacherUI;

import jdbc.UserDaoImpl;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * @author Brainrain
 */
public class deviceManagement extends JTabbedPane {
    public deviceManagement() {
        initComponents();
    }


    //select device
    private void thisStateChanged(ChangeEvent e) {
        // TODO add your code here
        if( this.getSelectedIndex() == 0){
            rowData = new UserDaoImpl().selectRows("device");
            columnNames = new UserDaoImpl().selectCloums("device");

            table1 = new JTable(rowData, columnNames);
            table1.getModel().addTableModelListener(new TableModelListener() {
                @Override
                public void tableChanged(TableModelEvent e) {
                    int SID = table1.getSelectedRow() + 1;
                    String tableName = "device";
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
    }

    //add
    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        int i = new UserDaoImpl().addDevice("device", textField1.getText().trim(), textField2.getText().trim(), textField3.getText().trim(), textField4.getText().trim(), textField5.getText().trim()," ");
        if ( i > 0){
            JOptionPane.showConfirmDialog(null, "Add successfully!", "Add", JOptionPane.PLAIN_MESSAGE);
        }else if ( i == -1){
            JOptionPane.showMessageDialog(null, "Fill in the blanks", "Add",JOptionPane.ERROR_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "Add error", "Add",JOptionPane.ERROR_MESSAGE);
        }
    }

    //delete
    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here
        int i = new UserDaoImpl().deleteUser("device", textField7.getText().trim());
        if ( i > 0){
            JOptionPane.showConfirmDialog(null, "Delete successfully!", "Delete", JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Delete error", "Delete",JOptionPane.ERROR_MESSAGE);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        panel2 = new JPanel();
        panel4 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        panel5 = new JPanel();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        panel6 = new JPanel();
        label5 = new JLabel();
        textField5 = new JTextField();
        panel7 = new JPanel();
        button2 = new JButton();
        button3 = new JButton();
        panel3 = new JPanel();
        panel8 = new JPanel();
        panel9 = new JPanel();
        label7 = new JLabel();
        textField7 = new JTextField();
        panel10 = new JPanel();
        button4 = new JButton();
        button5 = new JButton();

        //======== this ========
        addChangeListener(e -> thisStateChanged(e));

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout());
            panel1.add(scrollPane1);
        }
        addTab("query", panel1);

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayout(4, 0));

            //======== panel4 ========
            {
                panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label1 ----
                label1.setText("Device ID :");
                panel4.add(label1);

                //---- textField1 ----
                textField1.setColumns(10);
                panel4.add(textField1);

                //---- label2 ----
                label2.setText("   Device       :");
                panel4.add(label2);

                //---- textField2 ----
                textField2.setColumns(10);
                panel4.add(textField2);
            }
            panel2.add(panel4);

            //======== panel5 ========
            {
                panel5.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label3 ----
                label3.setText("Class        :");
                panel5.add(label3);

                //---- textField3 ----
                textField3.setColumns(10);
                panel5.add(textField3);

                //---- label4 ----
                label4.setText("   Name       :");
                panel5.add(label4);

                //---- textField4 ----
                textField4.setColumns(10);
                panel5.add(textField4);
            }
            panel2.add(panel5);

            //======== panel6 ========
            {
                panel6.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label5 ----
                label5.setText("return  Y/N  :");
                panel6.add(label5);

                //---- textField5 ----
                textField5.setColumns(10);
                panel6.add(textField5);
            }
            panel2.add(panel6);

            //======== panel7 ========
            {
                panel7.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- button2 ----
                button2.setText("submit");
                button2.addActionListener(e -> button2ActionPerformed(e));
                panel7.add(button2);

                //---- button3 ----
                button3.setText("reset");
                panel7.add(button3);
            }
            panel2.add(panel7);
        }
        addTab("add", panel2);

        //======== panel3 ========
        {
            panel3.setLayout(new GridLayout());

            //======== panel8 ========
            {
                panel8.setLayout(new GridLayout(2, 0));

                //======== panel9 ========
                {
                    panel9.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 80));

                    //---- label7 ----
                    label7.setText("Device ID   :");
                    panel9.add(label7);

                    //---- textField7 ----
                    textField7.setColumns(10);
                    panel9.add(textField7);
                }
                panel8.add(panel9);

                //======== panel10 ========
                {
                    panel10.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                    //---- button4 ----
                    button4.setText("delete");
                    button4.addActionListener(e -> button4ActionPerformed(e));
                    panel10.add(button4);

                    //---- button5 ----
                    button5.setText("reset");
                    panel10.add(button5);
                }
                panel8.add(panel10);
            }
            panel3.add(panel8);
        }
        addTab("delete", panel3);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JPanel panel2;
    private JPanel panel4;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JPanel panel5;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    private JPanel panel6;
    private JLabel label5;
    private JTextField textField5;
    private JPanel panel7;
    private JButton button2;
    private JButton button3;
    private JPanel panel3;
    private JPanel panel8;
    private JPanel panel9;
    private JLabel label7;
    private JTextField textField7;
    private JPanel panel10;
    private JButton button4;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private Object [][] rowData;
    private String [] columnNames;
    private JTable table1;
}
