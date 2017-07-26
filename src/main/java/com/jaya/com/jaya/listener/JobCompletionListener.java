package com.jaya.com.jaya.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;

/**
 * Created by jnaga1 on 7/26/2017.
 */
public class JobCompletionListener extends JobExecutionListenerSupport {

    public JobCompletionListener() {
        super();
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("Before Job execution");
        super.afterJob(jobExecution);
    }

    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("After Job Execution");
        super.beforeJob(jobExecution);
    }
}
