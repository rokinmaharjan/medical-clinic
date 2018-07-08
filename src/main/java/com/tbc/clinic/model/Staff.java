/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tbc.clinic.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 *
 */
@Entity
@Table(name = "staffs")
public class Staff implements Serializable {

    public enum StaffType {
        DOCTOR, NURSE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private String name;
    private String gender;
    private String registrationNumber;
    private Date registrationDate;
    private Date qualificationDate;
    private String grade;
    private boolean prescribing;
    private StaffType type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getQualificationDate() {
        return qualificationDate;
    }

    public void setQualificationDate(Date qualificationDate) {
        this.qualificationDate = qualificationDate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public boolean isPrescribing() {
        return prescribing;
    }

    public void setPrescribing(boolean prescribing) {
        this.prescribing = prescribing;
    }

    public StaffType getType() {
        return type;
    }

    public void setType(StaffType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Staff [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", gender="
                + gender + ", registrationNumber=" + registrationNumber + ", registrationDate=" + registrationDate
                + ", qualificationDate=" + qualificationDate + ", grade=" + grade + ", prescribing=" + prescribing
                + ", type=" + type + "]";
    }

}
