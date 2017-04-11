package jdbc;

/**
 * Created by Administrator on 2017/4/4.
 */
public interface UserDao {
    int addUser(String tableName,String ... value);

    int addDevice(String tableName, String ... value);

    int deleteUser(String tableName, String ID);

    int updateUser(String ID, String different1, String different2, String tableName,String ... value);

    int updateSyllabus(int SID, String tableName, String columnName, String value);

    User findUser(String userName,String password);

    String login(String userName, String tableName);

    String [] selectCloums( String tableName );

    Object [][] selectRows( String tableName );
}
