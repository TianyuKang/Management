package jdbc;

import com.mysql.jdbc.*;
import com.mysql.jdbc.Clob;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.StringReader;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;


/**
 * Created by Administrator on 2017/4/4.
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int addUser(String tableName, String... value) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int j = 0;
        String values = "";
        for(int i = 0; i < value.length; i++){
            if( value[i].length() == 0 )
                return -1;
        }
        for( int i =0; i < value.length; i++){
            values = values + "'"+ value[i] + "'"+ ",";
        }
        values = values.substring( 0, values.length() - 1);
        System.out.println(values);
        try {
            conn = jdbcUntil.getConnection();
            String sql = "insert into "+tableName+" values ("+values+")";
            ps = conn.prepareStatement(sql);
            j = ps.executeUpdate();
//            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUntil.free(rs, ps, conn);
        }
        return j;
    }

    @Override
    public int addDevice(String tableName, String... value) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int j = 0;
        try {
            conn = jdbcUntil.getConnection();
            String sql = "insert into "+tableName+" values ( ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < value.length; i++){
                ps.setString(i+1, value[i]);
            }
            ps.setDate(6,new java.sql.Date(new java.util.Date().getTime()));
            j = ps.executeUpdate();
//            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUntil.free(rs, ps, conn);
        }
        return j;
    }

    @Override
    public int addAchievement(int SID, String studentID, String resultName, String clobContent) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int i =0, j=0;
        try {
            conn = jdbcUntil.getConnection();
            String sql = "insert into studentachievement values ( ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, SID);
            ps.setString(2, resultName);
            ps.setString(3, studentID);
            ps.setDate(4, new java.sql.Date(new java.util.Date().getTime()));
            i = ps.executeUpdate();

            sql = "insert into achievement (SID, Achievement) values (?, ?)";
            Reader reader = new StringReader(clobContent);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, SID);
//            ps.setClob(2, reader, clobContent.length());
            ps.setCharacterStream(2, reader, clobContent.length());
            j = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return  -2;
        }finally {
            jdbcUntil.free(rs, ps, conn);
        }
        return i + j;
    }

    @Override
    public int addComent(int SID, String teacherID, String clobContent) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int i =0;
        try {
            conn = jdbcUntil.getConnection();
            String sql = "update achievement set TeacherID = ?, Coment = ? where SID = ?";
            Reader reader = new StringReader(clobContent);
            ps = conn.prepareStatement(sql);
            ps.setString(1, teacherID);
            ps.setCharacterStream(2, reader, clobContent.length());
            ps.setInt(3, SID);
            i = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUntil.free(rs, ps, conn);
        }
        return i;
    }

    @Override
    public int deleteUser(String tableName, String ID) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int j = 0;
        try {
            conn = jdbcUntil.getConnection();
            String sql = "delete from " + tableName + " where ID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID+"");
//            System.out.println(sql);
            j = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUntil.free(rs, ps, conn);
        }
        return j;
    }

    @Override
    public int updateUser(String ID, String different1, String different2, String tableName,String ... value) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int j = 0;
        for(int i = 0; i < value.length; i++){
            if( value[i].length() == 0 )
                return -1;
        }
        try {
            conn = jdbcUntil.getConnection();
            String sql = "update " + tableName + " set Name = ?, " + different1 + " = ?, " + different2 + " = ?, UserName = ?, Password = ? where ID = '" + ID + "'";
//            System.out.println(sql);
            ps = conn.prepareStatement(sql);
            for(int i = 0; i < value.length; i++){
                ps.setString(i+1,value[i]+"");
            }
            j = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUntil.free(rs, ps, conn);
        }
        return j;
    }

    //update syllabus jtable
    @Override
    public int updateSyllabus(int SID, String tableName, String columnName, String value) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int j = 0;
        try {
            conn = jdbcUntil.getConnection();
            String sql = "update " + tableName + " set " + columnName + " = ? where SID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, value);
            ps.setInt(2, SID);
            j = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUntil.free(rs, ps, conn);
        }
        return j;
    }

    @Override
    public User findUser(String userName, String password) {
        return null;
    }

    @Override
    public String login(String userName, String tableName) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String psw =null;
        try {
            conn = jdbcUntil.getConnection();
            String sql = "select password from " + tableName + " where username = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            rs = ps.executeQuery();
            while (rs.next()){
                psw = rs.getString("password");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUntil.free(rs, ps, conn);
        }
        return psw;
    }

    @Override
    public String [] selectCloums( String tableName ) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String [] columnNames = null;
        int i = 0;
        try {
            conn = jdbcUntil.getConnection();
            String sql = "show columns from "+tableName;
            ps = conn.prepareStatement(sql);
//          ps.setString(1, tableName);
            rs = ps.executeQuery();

            //get the columns amount
            rs.last();
            int col = rs.getRow();
            rs.beforeFirst();
            columnNames  = new String [col] ;
//            rs.last();
//            int row = rs.getRow();
            while (rs.next()){
                columnNames [i] = rs.getString(1);
                i++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUntil.free(rs, ps, conn);
        }
        return columnNames;
    }

    @Override
    public Object[][] selectRows(String tableName) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Object [][] rowData = null;
        int i = 0;
        try {
            conn = jdbcUntil.getConnection();
            String sql = "select * from "+tableName;
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            //get columns amount
            ResultSetMetaData rsm = rs.getMetaData();
            int col = rsm.getColumnCount();
            rs.beforeFirst();

            //get row amount
            rs.last();
            int row = rs.getRow();
            rs.beforeFirst();
            rowData = new Object[row][col];

            while (rs.next()){
                for ( int j =0; j < col; j++){
                    rowData [i][j] = rs.getString(j+1);
                }
                i++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUntil.free(rs, ps, conn);
        }

        return rowData;
    }

    @Override
    public String selectClob(String tableName, int ID, String columnName) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String value = "";
        try {
            conn = jdbcUntil.getConnection();
            String sql = "select " + columnName + " from " + tableName + " where SID = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, ID);
            rs = ps.executeQuery();
            while (rs.next()){
                com.mysql.jdbc.Clob clob = (Clob) rs.getClob( columnName );
                value = value + clob.getSubString(1, (int)clob.length());
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return "";
        }finally {
            jdbcUntil.free(rs, ps, conn);
        }
        return value;
    }
}
