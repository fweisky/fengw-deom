package org.fengw.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Cucumber运行类
 *
 * @author 封伟
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"json:target/cucumber/report.json"},
        features = {"classpath:feature/"},
        glue = {"org.fengw.cucumber.steps"}
)
public class RunCucumber {

    /**
     * 生成测试报告<br/>
     * 该在最后被执行，用来生成测试报告
     */
    @AfterClass
    public static void generateReport() {
        String buildNumber = "1";
        String projectName = "测试报告";

        // 生成报告路径
        File reportPath = new File("target/report");

        // JSON报告文件
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(System.getProperty("user.dir") + "/target/cucumber/report.json");

        // 配置
        Configuration configuration = new Configuration(reportPath, projectName);
        configuration.setRunWithJenkins(false);
        configuration.setBuildNumber(buildNumber);
        configuration.addClassifications("Platform", "Windows");

        // 生成报告
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
