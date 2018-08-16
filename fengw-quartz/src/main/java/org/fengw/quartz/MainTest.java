package org.fengw.quartz;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring整合Quartz定时任务在集群、分布式系统中的应用
 *
 * @author 封伟
 */
public class MainTest {

    /**
     * 主执行方法
     * @param args 参数
     * @throws BeansException 异常
     */
    public static void main(String[] args) throws BeansException {
        new ClassPathXmlApplicationContext(new String[] { "classpath:applicationContext-quartz.xml" });
    }
}
