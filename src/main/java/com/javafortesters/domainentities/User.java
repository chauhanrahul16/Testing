package com.javafortesters.domainentities;

public class User {

    private int a=10;

    private String username;
    private String password;

    public User(){
        username = "username";
        password = "password";
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername()
    { return username;
    }
    public String getPassword() {
        return password;
    }


    public static void main(String[] args) {

        User obj = new User();
        System.out.println(obj.a);
    }
}
