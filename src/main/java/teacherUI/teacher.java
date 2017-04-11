/*
 * Created by JFormDesigner on Sun Mar 26 23:13:34 CST 2017
 */

package teacherUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class teacher extends JFrame {
    public teacher() {
        initComponents();
    }

    public teacher(String teacherUserName) {
        this.teacherUserName = teacherUserName;
        initComponents();
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dispose();
    }

    private void toggleButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        splitPane1.setRightComponent(new querySyllabus(teacherUserName));
    }

    private void toggleButton2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        splitPane1.setRightComponent(new deviceManagement());
    }

    private void toggleButton4ActionPerformed(ActionEvent e) {
        // TODO add your code here
        splitPane1.setRightComponent(new teacherStatistic());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        separator1 = new JSeparator();
        button2 = new JButton();
        splitPane1 = new JSplitPane();
        panel1 = new JPanel();
        toggleButton1 = new JToggleButton();
        toggleButton2 = new JToggleButton();
        toggleButton4 = new JToggleButton();
        label3 = new JLabel();

        //======== this ========
        setTitle("teacher management");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Teaching Management System");
        label1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
        label1.setForeground(new Color(187, 187, 188));
        contentPane.add(label1);
        label1.setBounds(0, 0, 380, 60);

        //---- separator1 ----
        separator1.setBackground(Color.lightGray);
        separator1.setForeground(Color.lightGray);
        contentPane.add(separator1);
        separator1.setBounds(0, 55, 395, 6);

        //---- button2 ----
        button2.setText("logoff");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2);
        button2.setBounds(655, 15, 75, 40);

        //======== splitPane1 ========
        {
            splitPane1.setDividerLocation(80);

            //======== panel1 ========
            {
                panel1.setLayout(null);

                //---- toggleButton1 ----
                toggleButton1.setText("syllabus");
                toggleButton1.addActionListener(e -> toggleButton1ActionPerformed(e));
                panel1.add(toggleButton1);
                toggleButton1.setBounds(0, 0, 78, 35);

                //---- toggleButton2 ----
                toggleButton2.setText("device");
                toggleButton2.addActionListener(e -> toggleButton2ActionPerformed(e));
                panel1.add(toggleButton2);
                toggleButton2.setBounds(0, 31, 78, 35);

                //---- toggleButton4 ----
                toggleButton4.setText("statistic");
                toggleButton4.addActionListener(e -> toggleButton4ActionPerformed(e));
                panel1.add(toggleButton4);
                toggleButton4.setBounds(0, 62, 78, 35);

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
            splitPane1.setLeftComponent(panel1);

            //---- label3 ----
            label3.setText("      Please select operation");
            label3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 36));
            label3.setForeground(new Color(187, 187, 186));
            splitPane1.setRightComponent(label3);
        }
        contentPane.add(splitPane1);
        splitPane1.setBounds(0, 75, 760, 390);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        setSize(780, 510);
        setLocationRelativeTo(null);

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(toggleButton1);
        buttonGroup1.add(toggleButton2);
        buttonGroup1.add(toggleButton4);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JSeparator separator1;
    private JButton button2;
    private JSplitPane splitPane1;
    private JPanel panel1;
    private JToggleButton toggleButton1;
    private JToggleButton toggleButton2;
    private JToggleButton toggleButton4;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private String teacherUserName;
}
