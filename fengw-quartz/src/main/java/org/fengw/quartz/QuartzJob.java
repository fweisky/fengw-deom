package org.fengw.quartz;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.quartz.SchedulerException;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Spring整合Quartz定时任务在集群、分布式系统中的应用
 *
 * @author 封伟
 */
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class QuartzJob extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext job) throws JobExecutionException {
        QuartzJobService service = getApplicationContext(job).getBean("quartzJobService", QuartzJobService.class);
        service.doTimedTask();
    }

    /**
     * 取得应用上下文对象
     * @param job 任务执行上下文对象
     * @return 应用上下文对象
     */
    private ApplicationContext getApplicationContext(JobExecutionContext job) {
        try {
            return (ApplicationContext) job.getScheduler().getContext().get("applicationContextKey");
        } catch (SchedulerException e) {
            throw new RuntimeException(e);
        }
    }
}
