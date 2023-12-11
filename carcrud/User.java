import java.util.Scanner;

class User
{
    public int user_id;
    public String Username;
    public String Password;
    public String email;
    public String first_name;
    public String last_name;
    public String User_type;

    
    public User(int user_id, String username, String password, String email, String first_name, String last_name,
            String user_type) {
        this.user_id = user_id;
        Username = username;
        Password = password;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        User_type = user_type;
    }


    public int getUser_id() {
        return user_id;
    }


    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    public String getUsername() {
        return Username;
    }


    public void setUsername(String username) {
        Username = username;
    }


    public String getPassword() {
        return Password;
    }


    public void setPassword(String password) {
        Password = password;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getFirst_name() {
        return first_name;
    }


    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }


    public String getLast_name() {
        return last_name;
    }


    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    public String getUser_type() {
        return User_type;
    }


    public void setUser_type(String user_type) {
        User_type = user_type;
    }


    @Override
    public String toString() {
        return "User [user_id=" + user_id + ", Username=" + Username + ", Password=" + Password + ", email=" + email
                + ", first_name=" + first_name + ", last_name=" + last_name + ", User_type=" + User_type + "]";
    }

    public void add()
    {
        
    }

}