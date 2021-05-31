package com.jomi.cronjob;

import java.util.concurrent.BlockingQueue;

public interface JobExecutor {

	public void listenToJobQueue(BlockingQueue<Job> q);
	
	public void start();
	public void shutdown();
}
