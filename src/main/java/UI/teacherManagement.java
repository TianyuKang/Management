/*
 * Created by JFormDesigner on Sun Mar 26 13:08:06 CST 2017
 */

package UI;

import java.awt.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class teacherManagement extends JTabbedPane {
    public teacherManagement() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel1 = new JPanel();
        panel6 = new JPanel();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        panel7 = new JPanel();
        label4 = new JLabel();
        textField4 = new JTextField();
        label5 = new JLabel();
        textField5 = new JTextField();
        panel8 = new JPanel();
        label6 = new JLabel();
        textField6 = new JTextField();
        label7 = new JLabel();
        textField7 = new JTextField();
        panel9 = new JPanel();
        button3 = new JButton();
        button4 = new JButton();
        panel2 = new JPanel();
        panel10 = new JPanel();
        label8 = new JLabel();
        textField8 = new JTextField();
        label9 = new JLabel();
        textField9 = new JTextField();
        panel11 = new JPanel();
        label10 = new JLabel();
        textField10 = new JTextField();
        label11 = new JLabel();
        textField11 = new JTextField();
        panel12 = new JPanel();
        label12 = new JLabel();
        textField12 = new JTextField();
        label13 = new JLabel();
        textField13 = new JTextField();
        panel13 = new JPanel();
        button5 = new JButton();
        button6 = new JButton();
        panel3 = new JPanel();
        panel4 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        panel5 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        addTab("query", scrollPane1);

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout(4, 1));

            //======== panel6 ========
            {
                panel6.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label2 ----
                label2.setText("  ID           :");
                panel6.add(label2);

                //---- textField2 ----
                textField2.setColumns(10);
                panel6.add(textField2);

                //---- label3 ----
                label3.setText("   Name      :");
                panel6.add(label3);

                //---- textField3 ----
                textField3.setColumns(10);
                panel6.add(textField3);
            }
            panel1.add(panel6);

            //======== panel7 ========
            {
                panel7.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label4 ----
                label4.setText(" Dept        :");
                panel7.add(label4);

                //---- textField4 ----
                textField4.setColumns(10);
                panel7.add(textField4);

                //---- label5 ----
                label5.setText("   Email      :");
                panel7.add(label5);

                //---- textField5 ----
                textField5.setColumns(10);
                panel7.add(textField5);
            }
            panel1.add(panel7);

            //======== panel8 ========
            {
                panel8.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label6 ----
                label6.setText("Username  :");
                panel8.add(label6);

                //---- textField6 ----
                textField6.setColumns(10);
                panel8.add(textField6);

                //---- label7 ----
                label7.setText("Password  :");
                panel8.add(label7);

                //---- textField7 ----
                textField7.setColumns(10);
                panel8.add(textField7);
            }
            panel1.add(panel8);

            //======== panel9 ========
            {
                panel9.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- button3 ----
                button3.setText("add");
                panel9.add(button3);

                //---- button4 ----
                button4.setText("reset");
                panel9.add(button4);
            }
            panel1.add(panel9);
        }
        addTab("add", panel1);

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayout(4, 1));

            //======== panel10 ========
            {
                panel10.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label8 ----
                label8.setText("  ID           :");
                panel10.add(label8);

                //---- textField8 ----
                textField8.setColumns(10);
                panel10.add(textField8);

                //---- label9 ----
                label9.setText("   Name      :");
                panel10.add(label9);

                //---- textField9 ----
                textField9.setColumns(10);
                panel10.add(textField9);
            }
            panel2.add(panel10);

            //======== panel11 ========
            {
                panel11.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label10 ----
                label10.setText(" Dept        :");
                panel11.add(label10);

                //---- textField10 ----
                textField10.setColumns(10);
                panel11.add(textField10);

                //---- label11 ----
                label11.setText("   Email      :");
                panel11.add(label11);

                //---- textField11 ----
                textField11.setColumns(10);
                panel11.add(textField11);
            }
            panel2.add(panel11);

            //======== panel12 ========
            {
                panel12.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- label12 ----
                label12.setText("Username  :");
                panel12.add(label12);

                //---- textField12 ----
                textField12.setColumns(10);
                panel12.add(textField12);

                //---- label13 ----
                label13.setText("Password  :");
                panel12.add(label13);

                //---- textField13 ----
                textField13.setColumns(10);
                panel12.add(textField13);
            }
            panel2.add(panel12);

            //======== panel13 ========
            {
                panel13.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- button5 ----
                button5.setText("update");
                panel13.add(button5);

                //---- button6 ----
                button6.setText("reset");
                panel13.add(button6);
            }
            panel2.add(panel13);
        }
        addTab("update", panel2);

        //======== panel3 ========
        {
            panel3.setLayout(new GridLayout(2, 1));

            //======== panel4 ========
            {
                panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 80));

                //---- label1 ----
                label1.setText("ID       :");
                panel4.add(label1);

                //---- textField1 ----
                textField1.setColumns(10);
                panel4.add(textField1);
            }
            panel3.add(panel4);

            //======== panel5 ========
            {
                panel5.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));

                //---- button1 ----
                button1.setText("delete");
                panel5.add(button1);

                //---- button2 ----
                button2.setText("reset");
                panel5.add(button2);
            }
            panel3.add(panel5);
        }
        addTab("delete", panel3);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel1;
    private JPanel panel6;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JPanel panel7;
    private JLabel label4;
    private JTextField textField4;
    private JLabel label5;
    private JTextField textField5;
    private JPanel panel8;
    private JLabel label6;
    private JTextField textField6;
    private JLabel label7;
    private JTextField textField7;
    private JPanel panel9;
    private JButton button3;
    private JButton button4;
    private JPanel panel2;
    private JPanel panel10;
    private JLabel label8;
    private JTextField textField8;
    private JLabel label9;
    private JTextField textField9;
    private JPanel panel11;
    private JLabel label10;
    private JTextField textField10;
    private JLabel label11;
    private JTextField textField11;
    private JPanel panel12;
    private JLabel label12;
    private JTextField textField12;
    private JLabel label13;
    private JTextField textField13;
    private JPanel panel13;
    private JButton button5;
    private JButton button6;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel label1;
    private JTextField textField1;
    private JPanel panel5;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
