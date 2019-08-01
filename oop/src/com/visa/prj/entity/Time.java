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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hrs;
		result = prime * result + min;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hrs != other.hrs)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	public Time addTime(Time t) {
		Time t3 = new Time(0,0);
		int AddMin = getMin() + t.getMin();
		t3.setMin(AddMin%60);
		t3.setHrs(this.getHrs()+t.getHrs()+AddMin/60);
		return t3;
	}
	
	
}
