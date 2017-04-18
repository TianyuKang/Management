/*
 * Created by JFormDesigner on Mon Apr 03 19:38:51 CST 2017
 */

package studentUI;

import jdbc.UserDaoImpl;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.event.*;

/**
 * @author Brainrain
 */
public class studentStatistic extends JTabbedPane {
    public studentStatistic() {
        initComponents();
    }

    private void thisStateChanged(ChangeEvent e) {
        // TODO add your code here
        if(this.getSelectedIndex() == 0){
            rowData = new UserDaoImpl().selectRows("studentachievement");
            columnNames = new UserDaoImpl().selectCloums("studentachievement");

            table1 = new JTable(rowData, columnNames){
                public boolean isCellEditable(int row,int column){
                    return false;
                }
            };
            table1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    // TODO Auto-generated method stub
                    if (e.getClickCount() == 2) {
                        textArea1.setText("");
                        int row = table1.getSelectedRow();
//                        int column = table1.getSelectedColumn();
                        int SID =  Integer.parseInt( table1.getValueAt(row, 0).toString() );
                        String value = new UserDaoImpl().selectClob("achievement", SID, "Coment");
                        textArea1.append(""+value);
                    }
                }
            });
            scrollPane1.setViewportView(table1);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        panel2 = new JPanel();
        label1 = new JLabel();
        panel3 = new JPanel();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== this ========
        addChangeListener(e -> thisStateChanged(e));

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout(2, 0));
            panel1.add(scrollPane1);

            //======== panel2 ========
            {
                panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

                //---- label1 ----
                label1.setText("comment on achievement   :");
                panel2.add(label1);

                //======== panel3 ========
                {
                    panel3.setLayout(new GridLayout());

                    //======== scrollPane2 ========
                    {
                        scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                        //---- textArea1 ----
                        textArea1.setLineWrap(true);
                        textArea1.setWrapStyleWord(true);
                        scrollPane2.setViewportView(textArea1);
                    }
                    panel3.add(scrollPane2);
                }
                panel2.add(panel3);
            }
            panel1.add(panel2);
        }
        addTab("query", panel1);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JPanel panel2;
    private JLabel label1;
    private JPanel panel3;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private Object [][] rowData;
    private String [] columnNames;
    private JTable table1;
    private String studentUserName;
}
