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
import javax.persistence.Temporal;

/**
 *
 *
 */
@Entity
@Table(name = "staffs")
public class Staff implements Serializable {

    public Staff() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private String name;
    private String gender;
    private String registrationNumber;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date registrationDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date qualificationDate;
    private String grade;
    private boolean prescribing;
    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class Builder {

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
        private String type;

        private Builder() {
        }

        public Builder id(final int value) {
            this.id = value;
            return this;
        }

        public Builder username(final String value) {
            this.username = value;
            return this;
        }

        public Builder password(final String value) {
            this.password = value;
            return this;
        }

        public Builder name(final String value) {
            this.name = value;
            return this;
        }

        public Builder gender(final String value) {
            this.gender = value;
            return this;
        }

        public Builder registrationNumber(final String value) {
            this.registrationNumber = value;
            return this;
        }

        public Builder registrationDate(final Date value) {
            this.registrationDate = value;
            return this;
        }

        public Builder qualificationDate(final Date value) {
            this.qualificationDate = value;
            return this;
        }

        public Builder grade(final String value) {
            this.grade = value;
            return this;
        }

        public Builder prescribing(final boolean value) {
            this.prescribing = value;
            return this;
        }

        public Builder type(final String value) {
            this.type = value;
            return this;
        }

        public Staff build() {
            return new com.tbc.clinic.model.Staff(id, username, password, name, gender, registrationNumber, registrationDate, qualificationDate, grade, prescribing, type);
        }
    }

    public static Staff.Builder builder() {
        return new Staff.Builder();
    }

    private Staff(final int id, final String username, final String password, final String name, final String gender, final String registrationNumber, final Date registrationDate, final Date qualificationDate, final String grade, final boolean prescribing, final String type) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.registrationNumber = registrationNumber;
        this.registrationDate = registrationDate;
        this.qualificationDate = qualificationDate;
        this.grade = grade;
        this.prescribing = prescribing;
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
