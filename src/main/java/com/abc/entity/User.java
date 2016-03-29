package com.abc.entity;

public class User {
    private int id;
    private String name;
    private int age;
    private String address;
    
    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public User(){}
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "ID=" + id + ", Name=" + name + ", Age=" + age + ", Address=" + address;
    }
}
