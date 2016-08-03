package com.nenu.pojo;

import java.util.Date;

public class Resource {
    private Integer resourceid;

    private String resourcedir;

    private String resourcename;

    private Integer userid;

    private Integer groupid;

    private Date rdate;

    private Integer dwnum;

    public Integer getResourceid() {
        return resourceid;
    }

    public void setResourceid(Integer resourceid) {
        this.resourceid = resourceid;
    }

    public String getResourcedir() {
        return resourcedir;
    }

    public void setResourcedir(String resourcedir) {
        this.resourcedir = resourcedir == null ? null : resourcedir.trim();
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename == null ? null : resourcename.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public Integer getDwnum() {
        return dwnum;
    }

    public void setDwnum(Integer dwnum) {
        this.dwnum = dwnum;
    }
}