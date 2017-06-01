package test.jdbc; 

import jdbc.UserDaoImpl;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.runners.MethodSorters;

/** 
* UserDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 1, 2017</pre> 
* @version 1.0 
*/

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class UserDaoImplTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: addUser(String tableName, String... value) 
* 
*/ 
@Test
public void test001AddUser() throws Exception {
//TODO: Test goes here...
    int i = new UserDaoImpl().addUser( "studentaccount", "B13050628", "Tianyu", "B130506", "CS", "B13050628", "123456");
    assertEquals( "Add user error!", 1,i);
} 

/** 
* 
* Method: addDevice(String tableName, String... value) 
* 
*/ 
@Test
public void testAddDevice() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: addAchievement(int SID, String studentID, String resultName, String clobContent) 
* 
*/ 
@Test
public void testAddAchievement() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: addComent(int SID, String teacherID, String clobContent) 
* 
*/ 
@Test
public void testAddComent() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: deleteUser(String tableName, String ID) 
* 
*/ 
@Test
public void test003DeleteUser() throws Exception {
//TODO: Test goes here...
    int i = new UserDaoImpl().deleteUser( "studentaccount", "B13050628");
    assertEquals( "Delete user error!", 1,i);
} 

/** 
* 
* Method: updateUser(String ID, String different1, String different2, String tableName, String ... value) 
* 
*/ 
@Test
public void test002UpdateUser() throws Exception {
//TODO: Test goes here...
    int i = new UserDaoImpl().updateUser( "B13050628", "Class", "Major", "studentaccount", "Tianyu", "B130506", "CS", "B13050628", "654321");
    assertEquals( "Update user error!", 1,i);
} 

/** 
* 
* Method: updateSyllabus(int SID, String tableName, String columnName, String value) 
* 
*/ 
@Test
public void testUpdateSyllabus() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findUser(String userName, String password) 
* 
*/ 
@Test
public void testFindUser() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: login(String userName, String tableName) 
* 
*/ 
@Test
public void testLogin() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: selectCloums(String tableName) 
* 
*/ 
@Test
public void testSelectCloums() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: selectRows(String tableName) 
* 
*/ 
@Test
public void testSelectRows() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: selectClob(String tableName, int ID, String columnName) 
* 
*/ 
@Test
public void testSelectClob() throws Exception { 
//TODO: Test goes here... 
} 


} 
