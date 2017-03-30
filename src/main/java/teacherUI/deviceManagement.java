/*
 * Created by JFormDesigner on Thu Mar 30 22:34:22 CST 2017
 */

package teacherUI;

import java.awt.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class deviceManagement extends JTabbedPane {
    public deviceManagement() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
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

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("select");
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(300, 16), button1.getPreferredSize()));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(table1);
            }
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
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTable table1;
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
}
