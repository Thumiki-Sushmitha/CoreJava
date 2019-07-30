package com.visa.prj.entity;

public class Time {
	private int hrs;
	private int min;
	public Time(int hrs, int min) {
		this.hrs = hrs;
		this.min = min;
	}
	
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
	public static Time addTime(Time t1, Time t2) {
		Time t3 = new Time(0,0);
		int AddMin = t1.getMin() + t2.getMin();
		t3.setMin(AddMin%60);
		t3.setHrs(t1.getHrs()+t2.getHrs()+AddMin/60);
		return t3;
	}
	
	public Time addTime(Time t) {
		Time t3 = new Time(0,0);
		int AddMin = getMin() + t.getMin();
		t3.setMin(AddMin%60);
		t3.setHrs(this.getHrs()+t.getHrs()+AddMin/60);
		return t3;
	}
	
	
}
