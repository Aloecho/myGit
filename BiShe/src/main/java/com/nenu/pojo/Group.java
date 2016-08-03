package com.nenu.pojo;

public class Group {
    private Integer groupid;

    private String groupname;

    private Integer usernum;

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public Integer getUsernum() {
        return usernum;
    }

    public void setUsernum(Integer usernum) {
        this.usernum = usernum;
    }

	@Override
	public String toString() {
		return "Group [groupid=" + groupid + ", groupname=" + groupname + ", usernum=" + usernum + "]";
	}
    
}