package org.fengw.cucumber.steps;

import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.那么;

import static org.junit.Assert.assertEquals;

/**
 * 测试用例类
 *
 * @author 封伟
 */
public class Stepdefs {

    /**
     * 结果
     */
    private String result;

    @假如("^姓名：\"([^\"]*)\"$")
    public void getNewData(String name) {
        result = "Hello " + name;
    }

    @那么("^得到的结果应为：\"([^\"]*)\"$")
    public void compare(String sayHello) {
        assertEquals(result, sayHello);
    }
}
