package service.model;

import java.io.Serializable;

public class User implements Serializable {
    private Long id;
    private String fname;
    private String email;
    private String password;

    public User(Long id, String fname, String email, String password) {
        this.id = id;
        this.fname = fname;
        this.email = email;
        this.password = password;
    }

    public User() {
        this.fname = "";
        this.email = "";
        this.password = "";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
