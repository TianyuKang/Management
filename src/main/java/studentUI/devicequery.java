/*
 * Created by JFormDesigner on Fri Mar 31 21:08:38 CST 2017
 */

package studentUI;

import javax.swing.*;

/**
 * @author Brainrain
 */
public class devicequery extends JTabbedPane {
    public devicequery() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        addTab("query", scrollPane1);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
