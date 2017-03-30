/*
 * Created by JFormDesigner on Sat Mar 25 09:21:36 CST 2017
 */

package UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.tree.*;

/**
 * @author Brainrain
 */
public class admin extends JFrame {
    public admin() {
        initComponents();
    }

    private void tree1TreeExpanded(TreeExpansionEvent e) {
        // TODO add your code here
    }

    private void toggleButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        splitPane1.setRightComponent(new teacherManagement());
    }

    private void toggleButton2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        splitPane1.setRightComponent(new studentManagement());
    }

    private void toggleButton3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        splitPane1.setRightComponent(new syllabusManagement());
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dispose();
    }

    public void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        separator1 = new JSeparator();
        button2 = new JButton();
        splitPane1 = new JSplitPane();
        panel1 = new JPanel();
        toggleButton1 = new JToggleButton();
        toggleButton2 = new JToggleButton();
        toggleButton3 = new JToggleButton();
        label3 = new JLabel();

        //======== this ========
        setTitle("admin management");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Teaching Management System");
        label1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
        label1.setForeground(new Color(187, 187, 188));
        contentPane.add(label1);
        label1.setBounds(0, 0, 380, 60);

        //---- separator1 ----
        separator1.setForeground(Color.lightGray);
        separator1.setBackground(Color.lightGray);
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
                toggleButton1.setText("teacher");
                toggleButton1.addActionListener(e -> toggleButton1ActionPerformed(e));
                panel1.add(toggleButton1);
                toggleButton1.setBounds(0, 0, 78, 35);

                //---- toggleButton2 ----
                toggleButton2.setText("student");
                toggleButton2.addActionListener(e -> toggleButton2ActionPerformed(e));
                panel1.add(toggleButton2);
                toggleButton2.setBounds(0, 30, 78, 35);

                //---- toggleButton3 ----
                toggleButton3.setText("syllabus");
                toggleButton3.addActionListener(e -> {
			toggleButton2ActionPerformed(e);
			toggleButton3ActionPerformed(e);
		});
                panel1.add(toggleButton3);
                toggleButton3.setBounds(0, 58, 78, 35);

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
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(toggleButton1);
        buttonGroup1.add(toggleButton2);
        buttonGroup1.add(toggleButton3);
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
    private JToggleButton toggleButton3;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
