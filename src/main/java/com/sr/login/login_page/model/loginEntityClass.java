package com.sr.login.login_page.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@Entity
public class loginEntityClass {
    private String firstName;
    private String lastName;
    private int phoneNo;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Id
    @GeneratedValue
    private int Id;

    private String email;
    private String dateOfBirth;
    private String gender;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public loginEntityClass() {
    }

    public loginEntityClass(String firstName, String lastName, int phoneNo, int id, String email, String dateOfBirth, String gender, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        Id = id;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.password = password;
    }
}
