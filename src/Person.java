

public class Person {
    private String userName;
    private String email;
    private String role;
    private String password;

    public Person(){
        userName=null;
        email=null;
        role=null;
        password=null;
    }
    public Person(String userName,String email,String role,String password){
        this.userName=userName;
        this.email=email;
        this.role=role;
        this.password=password;
    }
    public Person(String role){
        this.role=role;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
