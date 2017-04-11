/*
 * Created by JFormDesigner on Sun Mar 26 13:52:35 CST 2017
 */

package UI;

import java.awt.event.*;
import jdbc.UserDaoImpl;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * @author Brainrain
 */
public class studentManagement extends JTabbedPane {
    public studentManagement() {
        initComponents();
    }

    private void thisStateChanged(ChangeEvent e) {
        // TODO add your code here
        if( this.getSelectedIndex() == 0){
            rowData = new UserDaoImpl().selectRows("studentaccount");
            columnNames = new UserDaoImpl().selectCloums("studentaccount");

            table1 = new JTable(rowData, columnNames){
                public boolean isCellEditable(int row,int column){
                    return false;
                }
            };
            scrollPane1.setViewportView(table1);
        }
    }

    //Add
    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        int i = new UserDaoImpl().addUser("studentaccount", textField3.getText().trim(), textField4.getText().trim(), textField7.getText().trim(), textField8.getText().trim(), textField5.getText().trim(), textField6.getText().trim());
        if ( i > 0){
            JOptionPane.showConfirmDialog(null, "Add successfully!", "Add", JOptionPane.PLAIN_MESSAGE);
        }else if ( i == -1){
            JOptionPane.showMessageDialog(null, "Fill in the blanks", "Add",JOptionPane.ERROR_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "Add error", "Add",JOptionPane.ERROR_MESSAGE);
        }
    }

    //Update
    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here
        int i = new UserDaoImpl().updateUser(textField9.getText().trim(), "Class", "Major", "studentaccount", textField10.getText().trim(), textField11.getText().trim(), textField12.getText().trim(),textField13.getText().trim(), textField14.getText().trim());
        if ( i > 0){
            JOptionPane.showConfirmDialog(null, "Update successfully!", "Update", JOptionPane.PLAIN_MESSAGE);
        }else if ( i == -1){
            JOptionPane.showMessageDialog(null, "Fill in the blanks", "Update",JOptionPane.ERROR_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "Update error", "Update",JOptionPane.ERROR_MESSAGE);
        }
    }

    //delete
    private void button6ActionPerformed(ActionEvent e) {
        // TODO add your code here
        int i = new UserDaoImpl().deleteUser("studentaccount", textField15.getText().trim());
        if ( i > 0){
            JOptionPane.showConfirmDialog(null, "Delete successfully!", "Delete", JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Delete error", "Delete",JOptionPane.ERROR_MESSAGE);
        }
    }

    //add reset
    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        textField8.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
        textField7.setText("");
    }

    //update reset
    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here
        textField14.setText("");
        textField9.setText("");
        textField10.setText("");
        textField11.setText("");
        textField12.setText("");
        textField13.setText("");
    }

    //delete reset
    private void button7ActionPerformed(ActionEvent e) {
        // TODO add your code here
        textField15.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        panel1 = new JPanel();
        panel3 = new JPanel();
        label6 = new JLabel();
        textField3 = new JTextField();
        label7 = new JLabel();
        textField4 = new JTextField();
        panel5 = new JPanel();
        label10 = new JLabel();
        textField7 = new JTextField();
        label11 = new JLabel();
        textField8 = new JTextField();
        panel4 = new JPanel();
        label8 = new JLabel();
        textField5 = new JTextField();
        label9 = new JLabel();
        textField6 = new JTextField();
        panel6 = new JPanel();
        button2 = new JButton();
        button3 = new JButton();
        panel2 = new JPanel();
        panel8 = new JPanel();
        label12 = new JLabel();
        textField9 = new JTextField();
        label13 = new JLabel();
        textField10 = new JTextField();
        panel9 = new JPanel();
        label14 = new JLabel();
        textField11 = new JTextField();
        label15 = new JLabel();
        textField12 = new JTextField();
        panel10 = new JPanel();
        label16 = new JLabel();
        textField13 = new JTextField();
        label17 = new JLabel();
        textField14 = new JTextField();
        panel11 = new JPanel();
        button4 = new JButton();
        button5 = new JButton();
        panel7 = new JPanel();
        panel12 = new JPanel();
        label18 = new JLabel();
        textField15 = new JTextField();
        panel13 = new JPanel();
        button6 = new JButton();
        button7 = new JButton();

        //======== this ========
        addChangeListener(e -> thisStateChanged(e));
        addTab("query", scrollPane1);

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout(4, 1));

            //======== panel3 ========
            {
                panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label6 ----
                label6.setText("  ID          :");
                label6.setVerticalAlignment(SwingConstants.TOP);
                panel3.add(label6);

                //---- textField3 ----
                textField3.setColumns(10);
                panel3.add(textField3);

                //---- label7 ----
                label7.setText("   Name       :");
                panel3.add(label7);

                //---- textField4 ----
                textField4.setColumns(10);
                panel3.add(textField4);
            }
            panel1.add(panel3);

            //======== panel5 ========
            {
                panel5.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label10 ----
                label10.setText("Class        :");
                panel5.add(label10);

                //---- textField7 ----
                textField7.setColumns(10);
                panel5.add(textField7);

                //---- label11 ----
                label11.setText("   Major       :");
                panel5.add(label11);

                //---- textField8 ----
                textField8.setColumns(10);
                panel5.add(textField8);
            }
            panel1.add(panel5);

            //======== panel4 ========
            {
                panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label8 ----
                label8.setText("Username  :");
                panel4.add(label8);

                //---- textField5 ----
                textField5.setColumns(10);
                panel4.add(textField5);

                //---- label9 ----
                label9.setText("Password  :");
                panel4.add(label9);

                //---- textField6 ----
                textField6.setColumns(10);
                panel4.add(textField6);
            }
            panel1.add(panel4);

            //======== panel6 ========
            {
                panel6.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- button2 ----
                button2.setText("submit");
                button2.addActionListener(e -> button2ActionPerformed(e));
                panel6.add(button2);

                //---- button3 ----
                button3.setText("reset");
                button3.addActionListener(e -> button3ActionPerformed(e));
                panel6.add(button3);
            }
            panel1.add(panel6);
        }
        addTab("add", panel1);

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayout(4, 1));

            //======== panel8 ========
            {
                panel8.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label12 ----
                label12.setText("  ID          :");
                panel8.add(label12);

                //---- textField9 ----
                textField9.setColumns(10);
                panel8.add(textField9);

                //---- label13 ----
                label13.setText("   Name       :");
                panel8.add(label13);

                //---- textField10 ----
                textField10.setColumns(10);
                panel8.add(textField10);
            }
            panel2.add(panel8);

            //======== panel9 ========
            {
                panel9.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label14 ----
                label14.setText("Class        :");
                panel9.add(label14);

                //---- textField11 ----
                textField11.setColumns(10);
                panel9.add(textField11);

                //---- label15 ----
                label15.setText("   Major       :");
                panel9.add(label15);

                //---- textField12 ----
                textField12.setColumns(10);
                panel9.add(textField12);
            }
            panel2.add(panel9);

            //======== panel10 ========
            {
                panel10.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label16 ----
                label16.setText("Username  :");
                panel10.add(label16);

                //---- textField13 ----
                textField13.setColumns(10);
                panel10.add(textField13);

                //---- label17 ----
                label17.setText("Password  :");
                panel10.add(label17);

                //---- textField14 ----
                textField14.setColumns(10);
                panel10.add(textField14);
            }
            panel2.add(panel10);

            //======== panel11 ========
            {
                panel11.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- button4 ----
                button4.setText("update");
                button4.addActionListener(e -> button4ActionPerformed(e));
                panel11.add(button4);

                //---- button5 ----
                button5.setText("reset");
                button5.addActionListener(e -> button5ActionPerformed(e));
                panel11.add(button5);
            }
            panel2.add(panel11);
        }
        addTab("update", panel2);

        //======== panel7 ========
        {
            panel7.setLayout(new GridLayout(2, 1));

            //======== panel12 ========
            {
                panel12.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 80));

                //---- label18 ----
                label18.setText("ID       :");
                panel12.add(label18);

                //---- textField15 ----
                textField15.setColumns(10);
                panel12.add(textField15);
            }
            panel7.add(panel12);

            //======== panel13 ========
            {
                panel13.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- button6 ----
                button6.setText("delete");
                button6.addActionListener(e -> button6ActionPerformed(e));
                panel13.add(button6);

                //---- button7 ----
                button7.setText("reset");
                button7.addActionListener(e -> button7ActionPerformed(e));
                panel13.add(button7);
            }
            panel7.add(panel13);
        }
        addTab("delete", panel7);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JPanel panel1;
    private JPanel panel3;
    private JLabel label6;
    private JTextField textField3;
    private JLabel label7;
    private JTextField textField4;
    private JPanel panel5;
    private JLabel label10;
    private JTextField textField7;
    private JLabel label11;
    private JTextField textField8;
    private JPanel panel4;
    private JLabel label8;
    private JTextField textField5;
    private JLabel label9;
    private JTextField textField6;
    private JPanel panel6;
    private JButton button2;
    private JButton button3;
    private JPanel panel2;
    private JPanel panel8;
    private JLabel label12;
    private JTextField textField9;
    private JLabel label13;
    private JTextField textField10;
    private JPanel panel9;
    private JLabel label14;
    private JTextField textField11;
    private JLabel label15;
    private JTextField textField12;
    private JPanel panel10;
    private JLabel label16;
    private JTextField textField13;
    private JLabel label17;
    private JTextField textField14;
    private JPanel panel11;
    private JButton button4;
    private JButton button5;
    private JPanel panel7;
    private JPanel panel12;
    private JLabel label18;
    private JTextField textField15;
    private JPanel panel13;
    private JButton button6;
    private JButton button7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private Object [][] rowData;
    private String [] columnNames;
    private JTable table1;
}
