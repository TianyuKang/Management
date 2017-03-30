/*
 * Created by JFormDesigner on Fri Mar 24 21:41:01 CST 2017
 */

package UI;

import studentUI.student;
import teacherUI.teacher;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Brainrain
 */
public class loggin extends JFrame {
    public loggin() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        progressBar1.setVisible(true);
        progressBar1.setStringPainted(true);
        progressBar1.setString("Loading....");
        button1.setEnabled(false);
        new progress(progressBar1, button1).start();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        username = new JFormattedTextField();
        passwordField1 = new JPasswordField();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        button1 = new JButton();
        button2 = new JButton();
        progressBar1 = new JProgressBar();

        //======== this ========
        setTitle("Teaching Management System");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.darkGray);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("          LOGIN");
        label1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 48));
        label1.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
        label1.setForeground(Color.white);
        label1.setBackground(Color.gray);
        label1.setOpaque(true);
        contentPane.add(label1);
        label1.setBounds(0, 45, 495, 75);

        //---- label2 ----
        label2.setText("user name :");
        label2.setForeground(new Color(187, 187, 188));
        contentPane.add(label2);
        label2.setBounds(80, 150, 75, 30);

        //---- label3 ----
        label3.setText("password :");
        label3.setForeground(new Color(187, 187, 188));
        contentPane.add(label3);
        label3.setBounds(80, 200, 70, 20);

        //---- username ----
        username.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        contentPane.add(username);
        username.setBounds(165, 155, 200, username.getPreferredSize().height);
        contentPane.add(passwordField1);
        passwordField1.setBounds(165, 195, 200, passwordField1.getPreferredSize().height);

        //---- radioButton1 ----
        radioButton1.setText("admin");
        radioButton1.setSelected(true);
        contentPane.add(radioButton1);
        radioButton1.setBounds(new Rectangle(new Point(105, 240), radioButton1.getPreferredSize()));

        //---- radioButton2 ----
        radioButton2.setText("teacher");
        contentPane.add(radioButton2);
        radioButton2.setBounds(new Rectangle(new Point(195, 240), radioButton2.getPreferredSize()));

        //---- radioButton3 ----
        radioButton3.setText("student");
        contentPane.add(radioButton3);
        radioButton3.setBounds(new Rectangle(new Point(295, 240), radioButton3.getPreferredSize()));

        //---- button1 ----
        button1.setText("login");
        button1.setBackground(new Color(60, 63, 66));
        button1.setForeground(new Color(187, 187, 188));
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(135, 305), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("reset");
        button2.setBackground(new Color(60, 63, 66));
        button2.setForeground(new Color(187, 187, 188));
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(260, 305), button2.getPreferredSize()));

        //---- progressBar1 ----
        progressBar1.setVisible(false);
        contentPane.add(progressBar1);
        progressBar1.setBounds(125, 275, 230, 20);

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
        setSize(500, 400);
        setLocationRelativeTo(null);

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        buttonGroup1.add(radioButton3);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private class progress extends Thread {
        JProgressBar progressBar;
        JButton button;
        int[] progressValues = {6, 27, 51, 81, 100};

        progress(JProgressBar progressBar, JButton button) {
            this.progressBar = progressBar;
            this.button = button;
        }

        public void run() {
            for (int i = 0; i < progressValues.length; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                progressBar.setValue(progressValues[i]);
            }
            progressBar.setIndeterminate(false);
            progressBar.setString("Load successfully!");
            button.setEnabled(true);
            progressBar.setVisible(false);

            //verfy the user and paaword
            if( radioButton1.isSelected() ){
                new admin().setVisible(true);
            }
            if( radioButton2.isSelected() ){
                new teacher().setVisible(true);
            }
            if( radioButton3.isSelected() ){
                new student().setVisible(true);
            }
        }
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JFormattedTextField username;
    private JPasswordField passwordField1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JButton button1;
    private JButton button2;
    private JProgressBar progressBar1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
