package org.fengw.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * LOGBack示例
 *
 * @author 封伟
 */
public class App {

    /**
     * 日志类对象
     */
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    /**
     * 主方法
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        logger.debug("Debug日志");
        logger.info("Info日志");
        logger.error("Error日志");
    }
}
