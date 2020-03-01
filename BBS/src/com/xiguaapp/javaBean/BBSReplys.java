package com.xiguaapp.javaBean;

import java.util.Date;

public class BBSReplys 
{
	private int rid;
	private int rtid;
	private BBSTopics bbsTopics;
	private BBSUsers bbsUsers;
	public BBSUsers getBbsUsers() {
		return bbsUsers;
	}
	
	private int ruid;

	public BBSReplys(int rtid, int ruid, String rinfo) {
	
		this.rtid = rtid;
		this.ruid = ruid;
		this.rinfo = rinfo;
	}



	public int getRuid() {
		return ruid;
	}



	public void setRuid(int ruid) {
		this.ruid = ruid;
	}



	public BBSReplys(int rid, int rtid, BBSUsers bbsUsers, String rinfo) {

		this.rid = rid;
		this.rtid = rtid;
		this.bbsUsers = bbsUsers;
		this.rinfo = rinfo;
	}



	public void setBbsUsers(BBSUsers bbsUsers) {
		this.bbsUsers = bbsUsers;
	}
	public BBSTopics getBbsTopics() {
		return bbsTopics;
	}
	public void setBbsTopics(BBSTopics bbsTopics) {
		this.bbsTopics = bbsTopics;
	}
	public BBSReplys() {
	
	}
	
	public BBSReplys(int rid, int rtid, BBSTopics bbsTopics, BBSUsers bbsUsers, String rinfo, Date rtime) {
	
		this.rid = rid;
		this.rtid = rtid;
		this.bbsTopics = bbsTopics;
		this.bbsUsers = bbsUsers;
		this.rinfo = rinfo;
		this.rtime = rtime;
	}

	private String rinfo;
	private Date rtime;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getRtid() {
		return rtid;
	}
	public void setRtid(int rtid) {
		this.rtid = rtid;
	}
	public String getRinfo() {
		return rinfo;
	}
	public void setRinfo(String rinfo) {
		this.rinfo = rinfo;
	}
	public Date getRtime() {
		return rtime;
	}
	public void setRtime(Date rtime) {
		this.rtime = rtime;
	}
}
