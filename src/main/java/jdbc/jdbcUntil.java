package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Created by Administrator on 2017/4/4.
 */
public class jdbcUntil {
    private static String driverName = "";
    private static String url = "";
    private static String user = "";
    private static String password = "";

    private jdbcUntil() {

    }

    static {
        Properties pros = new Properties();
        try {
            String path = System.getProperty("user.dir")+"\\src\\main\\java\\jdbc\\database.properties";
//            System.out.println(path);
            pros.load(new FileInputStream(path));
            driverName = pros.getProperty("drivername");
            url = pros.getProperty("url");
            user = pros.getProperty("user");
            password = pros.getProperty("password");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }

    public static void free(ResultSet rs, Statement st, Connection conn) {
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null)
                    st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(conn != null)
                        conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
