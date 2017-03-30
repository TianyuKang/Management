/*
 * Created by JFormDesigner on Mon Mar 27 22:02:05 CST 2017
 */

package UI;

import java.awt.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class syllabusManagement extends JTabbedPane {
    public syllabusManagement() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button3 = new JButton();
        panel2 = new JPanel();
        label2 = new JLabel();
        textField2 = new JTextField();
        button2 = new JButton();

        //======== this ========

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("Class  :");
            panel1.add(label1);
            label1.setBounds(130, 18, 45, 25);
            panel1.add(textField1);
            textField1.setBounds(190, 20, 110, textField1.getPreferredSize().height);

            //---- button1 ----
            button1.setText("select");
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(390, 16), button1.getPreferredSize()));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(table1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(25, 50, 620, 310);

            //---- button3 ----
            button3.setText("update");
            panel1.add(button3);
            button3.setBounds(new Rectangle(new Point(510, 16), button3.getPreferredSize()));

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
    private JTable table1;
    private JButton button3;
    private JPanel panel2;
    private JLabel label2;
    private JTextField textField2;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
