package helper;



import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentManager {
	
    private static ExtentReports extent;

    public static ExtentReports getInstance() throws IOException {
        if (extent == null) {
        	 String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
             String repname = "Test-Report-" + timestamp + ".html";
            String reportPath = System.getProperty("user.dir") + "/reports/"+repname;
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
            sparkReporter.loadXMLConfig(System.getProperty("user.dir") + "/src/test/java/resources/config.xml");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
        }
        return extent;
    }
}