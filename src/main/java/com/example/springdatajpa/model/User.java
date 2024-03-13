package com.example.springdatajpa.model;



import jakarta.persistence.*;


import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "user")

public class User implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "email", nullable = false)
    private String Email;

    @Column(name = "user_name", nullable = false)
    private String UserName;

    @Column(name = "pass_word", nullable = false)
    private String PassWord;

    public User(int id, String email, String userName, String passWord) {
        Id = id;
        Email = email;
        UserName = userName;
        PassWord = passWord;
    }

    public User(String email, String userName, String userDtoEmail, String passWork) {

    }

    public User(String email, String userName, String userName1, int i, String passWork, String creationDate) {
    }

    public User() {

    }


    public int getId() {
        return Id;
    }

    public void setId(String id) {
        Id = Integer.parseInt(id);
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public Set<Role> getRole() {
        return null;
    }
}
