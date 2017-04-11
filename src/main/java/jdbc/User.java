package jdbc;

/**
 * Created by Administrator on 2017/4/4.
 */
public class User {
    private  String ID;
    private  String name;
    private  String grade;
    private  String major;
    private  String username;
    private  String  password;
    private  String  dept;
    private  String  email;

    public User(String ID, String name, String grade, String major, String username, String password) {
        this.ID = ID;
        this.name = name;
        this.grade = grade;
        this.major = major;
        this.username = username;
        this.password = password;
    }

    public User(String ID, String name, String dept, String email, String username, String password, String phone) {
        this.ID = ID;
        this.name = name;
        this.dept = dept;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
