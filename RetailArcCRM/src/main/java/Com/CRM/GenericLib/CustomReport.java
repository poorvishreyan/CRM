package Com.CRM.GenericLib;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustomReport {
	
	public static void main(String[] args)
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("./CustomReports/myreport.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("RetailArc Report");
		spark.config().setReportName("Extent Reports 5");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("verify customer");
		test.info(MarkupHelper.createLabel("Customer is Displayed", ExtentColor.BLUE));
		test.pass(MarkupHelper.createLabel("Method is passed", ExtentColor.GREEN));
		test.fail(MarkupHelper.createLabel("failed", ExtentColor.RED));
		
		extent.flush();
		
		System.out.println("Done");
	}

}
