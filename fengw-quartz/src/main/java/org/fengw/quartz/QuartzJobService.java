package org.fengw.quartz;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Spring整合Quartz定时任务在集群、分布式系统中的应用
 *
 * @author 封伟
 */
@Service("quartzJobService")
public class QuartzJobService {

    /**
     * 执行定时任务
     */
    public void doTimedTask() {
        System.out.printf("执行定时任务 - %tT%n", new Date());
    }
}
