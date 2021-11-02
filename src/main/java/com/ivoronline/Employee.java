package com.ivoronline;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "https://ivoronline.com/employee")
public class Employee {
    private String name;
    private int id;
    private String role;
    private Address address;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @XmlAttribute
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }


    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }
}
