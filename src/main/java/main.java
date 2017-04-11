import UI.admin;
import UI.loggin;
import jdbc.UserDaoImpl;
import studentUI.student;
import studentUI.test;
import teacherUI.teacher;

/**
 * Created by Administrator on 2017/3/24.
 */
public class main {
    public static void main(String[] args) {
        loggin kk = new loggin();
        kk.setVisible(true);
//        int i = new UserDaoImpl().updateSyllabus(3, "b130506", "Teacher", "st");
//        System.out.println(i);
//        final Object rowData[][];
//        final String columnNames[];

//        columnNames = new UserDaoImpl().selectCloums("b130506");
//        for( String kk : columnNames){
//            System.out.println(kk);
//        }

////        rowData = new UserDaoImpl().selectRows("b130506");
//        for(int i = 0; i < rowData.length; i++){
//            for(int j =0; j < rowData[i].length; j++){
//                System.out.print(rowData[i][j]);
//            }
//            System.out.println("");
//        }
//        new UserDaoImpl().addUser("teacheraccount", "T0003", "kk", "hh", "jj","rr", "ii");
    }
}
