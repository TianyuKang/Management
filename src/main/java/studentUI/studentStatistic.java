/*
 * Created by JFormDesigner on Mon Apr 03 19:38:51 CST 2017
 */

package studentUI;

import java.awt.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class studentStatistic extends JTabbedPane {
    public studentStatistic() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel2 = new JPanel();
        label1 = new JLabel();
        panel3 = new JPanel();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== this ========

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout(2, 0));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(table1);
            }
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
    private JTable table1;
    private JPanel panel2;
    private JLabel label1;
    private JPanel panel3;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
