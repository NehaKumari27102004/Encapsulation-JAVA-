public class User {
    
private String username;
private String password;

public User(String username, String password )
{
    this.username = username;
    setPassword(password);  // using setter to apply validation
}

public String getUsername() {
    return username;
}

public void setUsername(String username)
{
    this.username =username;  
}

public String getPassword() {
    return "*********";
}

public void setPassword(String password){
    //APply validation and hashing for security

    if( password.length() >=8){
        this.password=hashPassword(password);
    }else{
        System.out.println("Password must be at least 8 characters long");
    }
}

private String hashPassword(String password){

    return Integer.toHexString(password.hashCode());
}

public static void main(String [] args){
    User user = new User("john_doe","securePassword123");
    System.out.println("Username: " + user.getUsername());
    System.out.println("Password:"+user.getPassword());
}

}
