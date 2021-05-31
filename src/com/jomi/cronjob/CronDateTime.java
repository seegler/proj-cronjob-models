package com.jomi.cronjob;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;

public class CronDateTime {
	private MutableDateTime mdt;
	
	public CronDateTime(long datetime, String tsd){
		mdt = new MutableDateTime(
				datetime, DateTimeZone.forID(tsd));
	}
	
	public  int getMinuteOfHour(){
		return mdt.getMinuteOfHour();
	}
	
	public  int getHourOfDay(){
		return mdt.getHourOfDay();
	}
	
	public  int getYear(){
		return mdt.getYear();
	}
	
	public  int getDayOfMonth(){
		return mdt.getDayOfMonth();
	}
	
	public  int getMonthOfYear(){
		return mdt.getMonthOfYear();
	}
	
	public  int getDayOfWeek(){
		return mdt.getDayOfWeek();
	}
	
	public  void setMinuteOfHour(int m){
		mdt.setMinuteOfHour(m);
	}
	
	public  void setHourOfDay(int m){
		mdt.setHourOfDay(m);
	}
	
	public  void setYear(int m){
		mdt.setYear(m);
	}
	
	public  void setDayOfMonth(int m){
		mdt.setDayOfMonth(m);
	}
	
	public  void setMonthOfYear(int m){
		mdt.setMonthOfYear(m);
	}
	
	public  void setDayOfWeek(int m){
		mdt.setDayOfWeek(m);
	}
	
	public long getMillis(){
		return mdt.getMillis();
	}
}
