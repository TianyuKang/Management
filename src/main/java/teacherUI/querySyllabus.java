/*
 * Created by JFormDesigner on Mon Mar 27 23:17:46 CST 2017
 */

package teacherUI;

import javax.swing.event.*;
import jdbc.UserDaoImpl;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class querySyllabus extends JTabbedPane {
    public querySyllabus() {
        initComponents();
    }

    public querySyllabus(String teacherUserName) {
        this.teacherUserName = teacherUserName;
        initComponents();
    }

    private void thisStateChanged(ChangeEvent e) {
        // TODO add your code here
        if( this.getSelectedIndex() == 0){
            rowData = new UserDaoImpl().selectRows(teacherUserName);
            columnNames = new UserDaoImpl().selectCloums(teacherUserName);

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
    private String teacherUserName;
}
