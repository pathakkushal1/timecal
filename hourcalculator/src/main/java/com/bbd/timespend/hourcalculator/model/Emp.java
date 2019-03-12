package com.bbd.timespend.hourcalculator.model;

import java.util.Date;


public class Emp {

	int id;
	String username;
	String sdate;
	String ldate;
	String day;
	int lunchTime;
	
	
	
	public Emp(String username, String sdate) {
		super();
		this.username = username;
		this.sdate = sdate;
		int ld = Integer.parseInt(sdate.substring(0, 1))+8;
		ldate = ld+":"+sdate.substring(2,3);
	}
	
	public String calLdate() {
		int ld = Integer.parseInt(this.sdate.substring(0, 2))+8;
		System.out.println("String form : "+this.sdate.substring(0, 1));
		System.out.println("First LD  : "+Integer.parseInt(this.sdate.substring(0, 2)));
		this.ldate = ld+":"+this.sdate.substring(3,5);
		return ldate;
	}
	
	
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Emp(String username, String sdate, int lunchTime) {
		super();
		this.username = username;
		this.sdate = sdate;
		this.lunchTime = lunchTime;
	}

	public Emp() {
		super();
	}
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", username=" + username + ", sdate=" + sdate + ", ldate=" + ldate + ", day=" + day
				+ ", lunchTime=" + lunchTime + "]";
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public String getLdate() {
		return ldate;
	}

	public void setLdate(String ldate) {
		this.ldate = ldate;
	}

	public int getLunchTime() {
		return lunchTime;
	}
	public void setLunchTime(int lunchTime) {
		this.lunchTime = lunchTime;
	}

	public void calLdateAfterLunch() {
		int ld = Integer.parseInt(this.sdate.substring(0, 2))+8;
		int pd = Integer.parseInt(this.sdate.substring(3,5))+lunchTime;
		while(pd>60) {
			ld++;
			pd = pd-60;
		}
		//System.out.println("String form : "+this.sdate.substring(0, 1));
		//System.out.println("First LD  : "+Integer.parseInt(this.sdate.substring(0, 2)));
		this.ldate = ld+":"+pd;
		convertTime(ldate);
	}
	
	private void convertTime(String tempLd) {
		int ld = Integer.parseInt(tempLd.substring(0, 2));
		int pd = Integer.parseInt(tempLd.substring(3,5));
		
		if(ld>12) {
			ld = ld-12;
		}
		this.ldate = ld+":"+pd;
	}
	
}
