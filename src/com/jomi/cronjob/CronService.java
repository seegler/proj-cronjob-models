package com.jomi.cronjob;

public interface CronService {

	Job addJob(Job t) throws CronException;
	Job updateJob(Job t) throws CronException;
	//void registerJobExecutor(JobExecutor jobExecutor,String sessionId);
}
