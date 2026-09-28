interface Authenticable{
    boolean login(String email,String password);
    void logout();
}
enum UserRole{
    Student,Recruiter,Admin;
}
interface User extends   Authenticable{
    int userId;
    String name;
    String email;
    String password;
    UserRole role;
    boolean active;
    String getprofile();
    void updateProfile();
    void changePassword(String newPassword);


}


public class cw1java {

    
}
