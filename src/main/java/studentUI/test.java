/*
 * Created by JFormDesigner on Sun Apr 02 23:16:55 CST 2017
 */

package studentUI;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * @author Brainrain
 */
public class test extends JTabbedPane {
    public test() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        //======== this ========

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout());
        }
        addTab("tt", panel1);

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayout());
        }
        addTab("kk", panel2);

        //======== panel3 ========
        {
            panel3.setLayout(new GridLayout());
        }
        addTab("text", panel3);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
