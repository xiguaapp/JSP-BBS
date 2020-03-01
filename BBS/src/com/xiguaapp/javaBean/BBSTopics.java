package com.xiguaapp.javaBean;

import java.util.Date;

public class BBSTopics 
{
	private int tid;
	private int tuid;
	private String ttitlle;
	private String tinfo;
	public BBSTopics() {
		
	}
	
	private Date ttime;
	private BBSUsers bbsUsers;
	public BBSTopics(int tid, int tuid, String ttitlle, String tinfo) {
		super();
		this.tid = tid;
		this.tuid = tuid;
		this.ttitlle = ttitlle;
		this.tinfo = tinfo;
	}
	public BBSTopics(int tid, int tuid, String ttitlle, String tinfo, Date ttime, BBSUsers bbsUsers) {
		this.tid = tid;
		this.tuid = tuid;
		this.ttitlle = ttitlle;
		this.tinfo = tinfo;
		this.ttime = ttime;
		this.bbsUsers = bbsUsers;
	}
	public BBSUsers getBbsUsers() {
		return bbsUsers;
	}
	public void setBbsUsers(BBSUsers bbsUsers) {
		this.bbsUsers = bbsUsers;
	}
	public int getTid() {
		return tid;
	}
	public BBSTopics(int tuid, String ttitlle, String tinfo) {

		this.tuid = tuid;
		this.ttitlle = ttitlle;
		this.tinfo = tinfo;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getTuid() {
		return tuid;
	}
	public void setTuid(int tuid) {
		this.tuid = tuid;
	}
	public String getTtitlle() {
		return ttitlle;
	}
	public void setTtitlle(String ttitlle) {
		this.ttitlle = ttitlle;
	}
	public String getTinfo() {
		return tinfo;
	}
	public void setTinfo(String tinfo) {
		this.tinfo = tinfo;
	}
	public Date getTtime() {
		return ttime;
	}
	public void setTtime(Date ttime) {
		this.ttime = ttime;
	}
	
}
