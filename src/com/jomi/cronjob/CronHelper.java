package com.jomi.cronjob;

import com.jomi.timeutils.TimeZoneUtils;

public class CronHelper {

	public static String formatActivateTime(
			CronType type, long time, String tzd){
		
		switch(type){
			case HOURLY:
				return 	"Hourly@ 00:"+
						TimeZoneUtils.formatAbsoluteTime(time,  tzd, "mm")+
						" mins. "+TimeZoneUtils.formatAbsoluteTime(time,  tzd, "z");
			case DAILY:
				return 	"Daily@ "+
						TimeZoneUtils.formatAbsoluteTime(time,  tzd, "KK:mm a z");
			case MONTHLY:
				return 	"Monthly@ "+
						TimeZoneUtils.formatAbsoluteTime(time,  tzd, "dd, KK:mm a z");
			case YEARLY:
				return 	"Yearly@ "+
						TimeZoneUtils.formatAbsoluteTime(time,  tzd, "dd MMM, KK:mm a z");
			case WEEKLY:
				return 	"Weekly@ "+
						TimeZoneUtils.formatAbsoluteTime(time,  tzd, "EEE, KK:mm a z");
			case AT:
				return 	"Once@ "+
						TimeZoneUtils.formatAbsoluteTime(time, tzd, "EEE, dd MMM yyyy, KK:mm a z");
		}
		return String.valueOf(time);
	}
	
	public static void main(String[] args){
		long now = System.currentTimeMillis();
		System.out.println(TimeZoneUtils.formatAbsoluteTime(now, "Asia/Kolkata","EEE, dd MMM yyyy, KK:mm z"));
		
	}
	
}
