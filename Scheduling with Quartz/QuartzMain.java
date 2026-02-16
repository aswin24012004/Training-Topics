package com.project;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzMain {

	public static void main(String[] args) throws SchedulerException {
		
//		1. create the 1st jobDetail
		JobDetail job = JobBuilder.newJob(MySimpleJob.class)
				.withIdentity("myJob", "group1")
				.build();
		
//		2. Create the Trigger (Run at every 5 seconds)
		Trigger trigger = TriggerBuilder.newTrigger()
					.withIdentity("myTrigger", "group1")
					.startNow()
					.withSchedule( SimpleScheduleBuilder.simpleSchedule()
							.withIntervalInSeconds(5)
							.repeatForever())
					.build();
		
//		3. Initialize the schedular and start it
		
		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
		scheduler.start();
		scheduler.scheduleJob(job,trigger);

	}

}
