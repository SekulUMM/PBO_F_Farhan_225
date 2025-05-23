package Tugas_PBO.src.com.praktikum.users;

public abstract class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }

    public abstract boolean login(String u, String p);
    public abstract void displayAppMenu();
}

