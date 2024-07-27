package com.sr.login.login_page.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class loginEntityClass {

    @Size(min=1, max=10, message="firstname must be between 1 and 10 characters")
    private String firstName;

    @Size(min=1, max=10, message="lastname must be between 1 and 10 characters")
    private String lastName;

    @Size(min=10, max=10, message="phone number must have 10 characters")
    private String phoneNo;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Id
    @GeneratedValue
    private int Id;

    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    private String email;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private LocalDate dateOfBirth;
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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = String.valueOf(gender);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public loginEntityClass() {
    }

    public loginEntityClass(String firstName, String lastName, String phoneNo, int id, String email, LocalDate dateOfBirth, Gender gender, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        Id = id;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = String.valueOf(gender);
        this.password = password;
    }
}
