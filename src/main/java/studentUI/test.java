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

    private void thisStateChanged(ChangeEvent e) {
        // TODO add your code here
        System.out.println(1);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel2 = new JPanel();
        panel3 = new JPanel();

        //======== this ========
        addChangeListener(e -> thisStateChanged(e));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        addTab("text", scrollPane1);

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
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel2;
    private JPanel panel3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
