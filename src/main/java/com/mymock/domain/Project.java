package com.mymock.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rkavya on 4/10/2015.
 */
public class Project {

    @Id
    private int proj_id;

    private String project_name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Employee_id")
    private Employee manager;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Employee_id")
    private Employee tl;

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_MODIFIED")
    private Date last_modified;

    public Project() {
    }

    public Project(int proj_id, String project_name, Employee manager, Employee tl, Date last_modified) {
        this.proj_id = proj_id;
        this.project_name = project_name;
        this.manager = manager;
        this.tl = tl;
        this.last_modified = last_modified;
    }

    public int getProj_id() {
        return proj_id;
    }

    public void setProj_id(int proj_id) {
        this.proj_id = proj_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Employee getTl() {
        return tl;
    }

    public void setTl(Employee tl) {
        this.tl = tl;
    }

    public Date getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(Date last_modified) {
        this.last_modified = last_modified;
    }
}
