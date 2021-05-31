package com.jomi.cronjob;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class Job {

	/*
	 * Id 
	 */
	private String id;
	/*
	 * Is active in CronRunner
	 */
	private CronJobStatus status;
	
	/*
	 * Start time
	 */
	private String startTime;
	/*
	 * End time
	 */
	private String endTime;
	/*
	 * Preferred Time
	 * This should fall withing the schedule window for task runner to execute it
	 */
	private String preferredTime;
	/*
	 * cron type
	 */
	private CronType cronType;
	
	/*
	 * Timezone of this Job
	 *
	 */
	private String timeZone;
	/*
	 * action string to identify who will execute the task.
	 * Cron Runner does not use this identifier. Task processor should use this to identify the 
	 * how to process this task
	 */
	private String task;
	
	private String taskId;
	
	private String tenantId;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public CronJobStatus getStatus() {
		return status;
	}
	public void setStatus(CronJobStatus status) {
		this.status = status;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getPreferredTime() {
		return preferredTime;
	}
	public void setPreferredTime(String preferredTime) {
		this.preferredTime = preferredTime;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String action) {
		this.task = action;
	}
	public CronType getCronType() {
		return cronType;
	}
	public void setCronType(CronType cronType) {
		this.cronType = cronType;
	}
		
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String actionId) {
		this.taskId = actionId;
	}
	
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	
	
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public static Job createJob(CronType cronType, String id, String startTime, 
									String preferredTime, String endTime, 
									String timeZone, String taskId, 
									String task, CronJobStatus status){
		/*if(startTime <0){
			//set to now
			startTime = TimeZoneUtils.getCurrentTime();
		}
		if(endTime <0 ){
			long ts = Long.MAX_VALUE;
			endTime = TimeZoneUtils.getCurrentTime();
		}
		if(preferredTime <0) throw new IllegalArgumentException("Cron task should have a preferred time set");
	*/
		Job t = new Job();
		t.setId(id);
		t.setCronType(cronType);
		t.setTask(task);
		t.setTaskId(taskId);
		t.setStartTime(startTime);
		t.setPreferredTime(preferredTime);
		t.setTimeZone(timeZone);
		t.setEndTime(endTime);
		t.setStatus(status);
		return t;
	}
	
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("Job:{").append("\nid:").append(id)
			.append("\nstatus:").append(status)
			.append("\ncronType:").append(cronType)
			.append("\ntimeZone:").append(timeZone)
			.append("\nstartTime:").append(startTime)
			.append("\npreferredTime:").append(preferredTime)
			.append("\nendTime:").append(endTime)
			.append("\ntaskId:").append(taskId)
			.append("\ntask:").append(task)
			.append("\n}");
		return sb.toString();
	}
}
