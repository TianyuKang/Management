/*
 * Created by JFormDesigner on Mon Apr 03 21:35:01 CST 2017
 */

package teacherUI;

import java.awt.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class teacherStatistic extends JTabbedPane {
    public teacherStatistic() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel7 = new JPanel();
        label4 = new JLabel();
        panel8 = new JPanel();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();
        label5 = new JLabel();
        panel9 = new JPanel();
        scrollPane3 = new JScrollPane();
        textArea2 = new JTextArea();
        panel2 = new JPanel();
        button1 = new JButton();

        //======== this ========

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout(2, 0));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(table1);
            }
            panel1.add(scrollPane1);

            //======== panel7 ========
            {
                panel7.setAlignmentX(0.0F);
                panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));

                //---- label4 ----
                label4.setText("achievement content   :");
                panel7.add(label4);

                //======== panel8 ========
                {
                    panel8.setLayout(new GridLayout());

                    //======== scrollPane2 ========
                    {
                        scrollPane2.setViewportView(textArea1);
                    }
                    panel8.add(scrollPane2);
                }
                panel7.add(panel8);

                //---- label5 ----
                label5.setText("coment  :");
                panel7.add(label5);

                //======== panel9 ========
                {
                    panel9.setLayout(new GridLayout());

                    //======== scrollPane3 ========
                    {
                        scrollPane3.setViewportView(textArea2);
                    }
                    panel9.add(scrollPane3);
                }
                panel7.add(panel9);

                //======== panel2 ========
                {
                    panel2.setAlignmentX(0.0F);
                    panel2.setPreferredSize(new Dimension(61, -25));
                    panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));

                    //---- button1 ----
                    button1.setText("submit");
                    button1.setPreferredSize(new Dimension(80, 20));
                    panel2.add(button1);
                }
                panel7.add(panel2);
            }
            panel1.add(panel7);
        }
        addTab("text", panel1);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel7;
    private JLabel label4;
    private JPanel panel8;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    private JLabel label5;
    private JPanel panel9;
    private JScrollPane scrollPane3;
    private JTextArea textArea2;
    private JPanel panel2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
