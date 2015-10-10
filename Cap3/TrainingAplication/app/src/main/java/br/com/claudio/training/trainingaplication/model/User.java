package br.com.claudio.training.trainingaplication.model;

/**
 * Created by cjunior on 09/10/15.
 */
public class User {
    private String username;
    private String password;

    public User() {
        initComponents(null,null);
    }

    public User(String username, String password) {
        initComponents(username,password);
    }

    private void initComponents(String username, String password) {
        this.username = username;
        this.password = password;
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
}
