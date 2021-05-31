# Project Cronjob Models

A BlockingQueue based job queue to execute jobs at intervals of HOURLY, DAILY, WEEKLY, MONTHLY, YEARLY, AT(exact time). Handles ingress and egress conversions and normalizations of timezone and locale from web browsers or other client devices. 

## Tech Stack

* Java POJO
* [Joda-Time](https://www.joda.org/joda-time/)
  * Timezone conversions
  * Locale conversions
* CronJob Executor 
  * Queued jobs using java.util.concurrent.BlockingQueue
* Mvn build

## Dependencies

* ```
  <dependency>
  	<groupId>com.jomi.timeutils</groupId>
  	<artifactId>proj-timeutils</artifactId>
  	<version>0.0.1-SNAPSHOT</version>
  	</dependency>
  </dependencies>
  ```

