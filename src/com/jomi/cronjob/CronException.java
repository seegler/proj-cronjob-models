package com.jomi.cronjob;

public class CronException extends Exception{
	private String taskid;
	private String accountId;
	private String message;
	
	
	public CronException(String taskid, String accountId, String message) {
		super();
		this.taskid = taskid;
		this.accountId = accountId;
		this.message = message;
	}
	public String getTaskid() {
		return taskid;
	}
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String toString(){
		return message+"(accountId="+accountId+", taskid="+taskid+")";
	}
	

}
