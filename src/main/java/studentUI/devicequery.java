/*
 * Created by JFormDesigner on Fri Mar 31 21:08:38 CST 2017
 */

package studentUI;

import jdbc.UserDaoImpl;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

/**
 * @author Brainrain
 */
public class devicequery extends JTabbedPane {
    public devicequery() {
        initComponents();
    }

    private void thisStateChanged(ChangeEvent e) {
        // TODO add your code here
        if(this.getSelectedIndex() == 0){
            rowData = new UserDaoImpl().selectRows("device");
            columnNames = new UserDaoImpl().selectCloums("device");

            table1 = new JTable(rowData, columnNames){
                public boolean isCellEditable(int row,int column){
                    return false;
                }
            };
            scrollPane1.setViewportView(table1);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();

        //======== this ========
        addChangeListener(e -> thisStateChanged(e));
        addTab("query", scrollPane1);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private Object [][] rowData;
    private String [] columnNames;
    private JTable table1;
}
