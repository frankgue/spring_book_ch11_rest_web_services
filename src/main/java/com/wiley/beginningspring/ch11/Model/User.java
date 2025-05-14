package com.wiley.beginningspring.ch11.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {
    private int id;
    private String name;
    @JsonIgnore
    private String address;

    public User() {
    }

    public User(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
/*   public User(int id, String name) {
        this.id = id;
        this.name = name;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
