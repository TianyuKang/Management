/*
 * Created by JFormDesigner on Mon Mar 27 00:43:23 CST 2017
 */

package studentUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class student extends JFrame {
    public student() {
        initComponents();
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dispose();
    }

    private void toggleButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        splitPane1.setRightComponent(new studentSyllabus());
    }

    private void toggleButton2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        splitPane1.setRightComponent(new devicequery());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        separator1 = new JSeparator();
        button2 = new JButton();
        splitPane1 = new JSplitPane();
        panel2 = new JPanel();
        toggleButton1 = new JToggleButton();
        toggleButton2 = new JToggleButton();
        toggleButton3 = new JToggleButton();
        toggleButton4 = new JToggleButton();
        label3 = new JLabel();

        //======== this ========
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setForeground(Color.darkGray);
        setTitle("student management");
        setBackground(Color.darkGray);
        Container contentPane = getContentPane();
        contentPane.setLayout(new CardLayout());

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("Teaching Management System");
            label1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
            label1.setForeground(new Color(187, 187, 188));
            panel1.add(label1);
            label1.setBounds(0, 0, 380, 60);

            //---- separator1 ----
            separator1.setBackground(Color.lightGray);
            separator1.setForeground(Color.lightGray);
            panel1.add(separator1);
            separator1.setBounds(0, 65, 395, 6);

            //---- button2 ----
            button2.setText("logoff");
            button2.addActionListener(e -> button2ActionPerformed(e));
            panel1.add(button2);
            button2.setBounds(655, 15, 75, 40);

            //======== splitPane1 ========
            {
                splitPane1.setDividerLocation(80);

                //======== panel2 ========
                {
                    panel2.setLayout(null);

                    //---- toggleButton1 ----
                    toggleButton1.setText("syllabus");
                    toggleButton1.addActionListener(e -> {
			toggleButton1ActionPerformed(e);
			toggleButton1ActionPerformed(e);
		});
                    panel2.add(toggleButton1);
                    toggleButton1.setBounds(0, 0, 78, 35);

                    //---- toggleButton2 ----
                    toggleButton2.setText("device");
                    toggleButton2.addActionListener(e -> {
			toggleButton2ActionPerformed(e);
			toggleButton2ActionPerformed(e);
		});
                    panel2.add(toggleButton2);
                    toggleButton2.setBounds(0, 30, 78, 35);

                    //---- toggleButton3 ----
                    toggleButton3.setText("result");
                    toggleButton3.addActionListener(e -> toggleButton2ActionPerformed(e));
                    panel2.add(toggleButton3);
                    toggleButton3.setBounds(0, 60, 78, 35);

                    //---- toggleButton4 ----
                    toggleButton4.setText("statistic");
                    toggleButton4.addActionListener(e -> toggleButton2ActionPerformed(e));
                    panel2.add(toggleButton4);
                    toggleButton4.setBounds(0, 90, 78, 35);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel2.getComponentCount(); i++) {
                            Rectangle bounds = panel2.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel2.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel2.setMinimumSize(preferredSize);
                        panel2.setPreferredSize(preferredSize);
                    }
                }
                splitPane1.setLeftComponent(panel2);

                //---- label3 ----
                label3.setText("      Please select operation");
                label3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 36));
                label3.setForeground(new Color(187, 187, 186));
                splitPane1.setRightComponent(label3);
            }
            panel1.add(splitPane1);
            splitPane1.setBounds(0, 76, 760, 390);

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
        contentPane.add(panel1, "card1");
        setSize(780, 510);
        setLocationRelativeTo(null);

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(toggleButton1);
        buttonGroup1.add(toggleButton2);
        buttonGroup1.add(toggleButton3);
        buttonGroup1.add(toggleButton4);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JSeparator separator1;
    private JButton button2;
    private JSplitPane splitPane1;
    private JPanel panel2;
    private JToggleButton toggleButton1;
    private JToggleButton toggleButton2;
    private JToggleButton toggleButton3;
    private JToggleButton toggleButton4;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
