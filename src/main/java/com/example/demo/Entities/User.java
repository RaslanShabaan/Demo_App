package com.example.demo.Entities;

import javax.persistence.*;

@Entity
@Table(name = "User", catalog = "Boot")
public class User {

    private String id;
    private String Name ;
    private String Phone;
    private String Salary;

    public User(){}
    public User(String id){
        this.id=id;
    }
    public User(String id, String Name ,String Phone, String Salary){
        this.id=id;
        this.Name=Name;
        this.Phone=Phone;
        this.Salary=Salary;
    }

@Id
@Column(name = "id")
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "Name")
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    @Column(name = "Salary")
    public String getSalary() {
        return Salary;
    }
    public void setSalary(String salary) {
        Salary = salary;
    }

    @Column(name = "Phone")
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }


}


