package week6.day3;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		// Step1:Setup physical report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		
		//to keep the report history
		reporter.setAppendExisting(false);

		// Step2:Create object for ExtentReports
		ExtentReports extent = new ExtentReports();
		// Step3: attach data with physical file
		extent.attachReporter(reporter);

		// Step 4:Create a testcase and assign test details
		// testName //testDescription
		ExtentTest test = extent.createTest("CreateLead", "CreateLead with mandatory details");
		test.assignCategory("Smoke");
		test.assignAuthor("Subraja");

		// Step5:step level status
		test.pass("Enter Username",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/image2.png").build());
		test.pass("Enter Password");
		test.pass("Click Login button");
		// testcase2
		ExtentTest test1 = extent.createTest("DuplicateLead", "DuplicateLead with credentials");
		test1.assignCategory("Regression");
		test1.assignAuthor("Princy");

		test1.pass("Enter Username as demo");
		test1.pass("Enter Password as crm");
		test1.fail("Click Login button");

		// Step 6:Mandatory step
		extent.flush();
		System.out.println("Done");

	}

}