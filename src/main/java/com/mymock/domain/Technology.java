package com.mymock.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rkavya on 4/9/2015.
 */
@Entity
public class Technology {

    @Id
    @Column(name = "Tech_id")
    private int tech_id;

    private String tech_name;

    private String version;

    private String vendor;

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_MODIFIED")
    private Date last_modified;

    public Technology() {
    }

    public Technology(int tech_id, String tech_name, String version, String vendor, Date last_modified) {
        this.tech_id = tech_id;
        this.tech_name = tech_name;
        this.version = version;
        this.vendor = vendor;
        this.last_modified = last_modified;
    }

    public int getTech_id() {
        return tech_id;
    }

    public void setTech_id(int tech_id) {
        this.tech_id = tech_id;
    }

    public String getTech_name() {
        return tech_name;
    }

    public void setTech_name(String tech_name) {
        this.tech_name = tech_name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Date getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(Date last_modified) {
        this.last_modified = last_modified;
    }
}
