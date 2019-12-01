package sql1;

public class User {
    private String username;
    private int pasword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPasword() {
        return pasword;
    }

    public void setPasword(int pasword) {
        this.pasword = pasword;
    }

    public User(String username, int pasword) {
        this.username = username;
        this.pasword = pasword;
    }
}
