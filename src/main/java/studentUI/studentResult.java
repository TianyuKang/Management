/*
 * Created by JFormDesigner on Sun Apr 02 22:10:54 CST 2017
 */

package studentUI;

import java.awt.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class studentResult extends JTabbedPane {
    public studentResult() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        scrollPane2 = new JScrollPane();
        panel7 = new JPanel();
        label3 = new JLabel();
        panel8 = new JPanel();
        scrollPane4 = new JScrollPane();
        textArea3 = new JTextArea();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        panel5 = new JPanel();
        label2 = new JLabel();
        panel6 = new JPanel();
        scrollPane3 = new JScrollPane();
        textArea2 = new JTextArea();

        //======== this ========

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout(2, 0));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(table1);
            }
            panel1.add(scrollPane1);

            //======== scrollPane2 ========
            {

                //======== panel7 ========
                {
                    panel7.setAlignmentX(0.0F);
                    panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));

                    //---- label3 ----
                    label3.setText("achievement content   :");
                    panel7.add(label3);

                    //======== panel8 ========
                    {
                        panel8.setLayout(new GridLayout());

                        //======== scrollPane4 ========
                        {
                            scrollPane4.setViewportView(textArea3);
                        }
                        panel8.add(scrollPane4);
                    }
                    panel7.add(panel8);
                }
                scrollPane2.setViewportView(panel7);
            }
            panel1.add(scrollPane2);
        }
        addTab("query", panel1);

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayout());

            //======== panel3 ========
            {
                panel3.setLayout(new GridLayout(2, 0));

                //======== panel4 ========
                {
                    panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 80));

                    //---- label1 ----
                    label1.setText("achievement  \uff1a");
                    panel4.add(label1);

                    //---- textField1 ----
                    textField1.setColumns(10);
                    panel4.add(textField1);

                    //---- button1 ----
                    button1.setText("submit");
                    panel4.add(button1);
                }
                panel3.add(panel4);

                //======== panel5 ========
                {
                    panel5.setAlignmentX(0.0F);
                    panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));

                    //---- label2 ----
                    label2.setText("achievement content   :");
                    label2.setHorizontalAlignment(SwingConstants.LEFT);
                    label2.setAlignmentX(-1.0F);
                    panel5.add(label2);

                    //======== panel6 ========
                    {
                        panel6.setLayout(new GridLayout());

                        //======== scrollPane3 ========
                        {
                            scrollPane3.setViewportView(textArea2);
                        }
                        panel6.add(scrollPane3);
                    }
                    panel5.add(panel6);
                }
                panel3.add(panel5);
            }
            panel2.add(panel3);
        }
        addTab("addResult", panel2);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JScrollPane scrollPane2;
    private JPanel panel7;
    private JLabel label3;
    private JPanel panel8;
    private JScrollPane scrollPane4;
    private JTextArea textArea3;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JPanel panel5;
    private JLabel label2;
    private JPanel panel6;
    private JScrollPane scrollPane3;
    private JTextArea textArea2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
