package com.xiguaapp.javaBean;

import java.util.Date;

public class BBSUsers {
	public BBSUsers() {
	
	}
	public BBSUsers(String uname, String upassword) {
		super();
		this.uname = uname;
		this.upassword = upassword;
	}
	private int uid;
	private String ueamil;
	public BBSUsers(int uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}
	public String getUeamil() {
		return ueamil;
	}
	public BBSUsers(int uid) {
		super();
		this.uid = uid;
	}
	public BBSUsers(String uname) {
		super();
		this.uname = uname;
	}
	public BBSUsers(String ueamil, String uname, String upassword, boolean usex) {
	
		this.ueamil = ueamil;
		this.uname = uname;
		this.upassword = upassword;
		this.usex = usex;
	}
	public void setUeamil(String ueamil) {
		this.ueamil = ueamil;
	}
	
	public BBSUsers(int uid, String ueamil, String uname, String upassword, boolean usex, Date uregDate) {
	
		this.uid = uid;
		this.ueamil = ueamil;
		this.uname = uname;
		this.upassword = upassword;
		this.usex = usex;
		this.uregDate = uregDate;
	}
	private String uname;
	private String upassword;
	public Date getUregDate() {
		return uregDate;
	}
	public void setUregDate(Date uregDate) {
		this.uregDate = uregDate;
	}
	private boolean usex;
	private Date uregDate;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public boolean isUsex() {
		return usex;
	}
	public void setUsex(boolean usex) {
		this.usex = usex;
	}
}

