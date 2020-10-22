package com.shadow.entity;

public class Student {
    private String id;
    private Integer age;
    private String address;

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
