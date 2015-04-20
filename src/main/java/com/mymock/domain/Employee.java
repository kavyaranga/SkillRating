package com.mymock.domain;

import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rkavya on 4/9/2015.
 */
@Entity
public class Employee {

    @Id
    @Column(name = "Employee_id")
    private int employee_id;

    @Column(nullable = false)
    private String name;

    private String experience;

    private String designation;

    @Temporal(TemporalType.DATE)
    @Column(name = "DOB")
    private Date dob;

    @Temporal(TemporalType.DATE)
    @Column(name = "JOIN_DATE")
    private Date join_date;

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_MODIFIED")
    private Date last_modified;

    public Employee() {
    }

    public Employee(int employee_id, String name, String experience, String designation, Date dob, Date join_date, Date last_modified) {
        this.employee_id = employee_id;
        this.name = name;
        this.experience = experience;
        this.designation = designation;
        this.dob = dob;
        this.join_date = join_date;
        this.last_modified = last_modified;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public Date getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(Date last_modified) {
        this.last_modified = last_modified;
    }
}
