package org.fengw.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Cucumber运行类
 *
 * @author 封伟
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCucumber {
}
