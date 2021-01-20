package org.PlanCanadaTestAutomation.utilities;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import net.rcarz.jiraclient.JiraException;


public class TestJiraListener implements ITestListener {


	  
	/*
	 * public void onTestSuccess(ITestResult result) { // TODO Auto-generated method
	 * stub ITestListener.super.onTestSuccess(result); }
	 * 
	 */
	
		
	/*
	  public void onTestStart(ITestResult result) 
	  {

		JiraPolicy jiraPolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
		boolean isTicketReady = jiraPolicy.logTicketReady();
		
		if(isTicketReady)
		{
			//raise ticket in jira
			System.out.println("is ticket ready for Jira:" + isTicketReady);
			JiraServiceProvider jiraSp = new JiraServiceProvider("https://plancanada.atlassian.net", "adeige@plancanada.ca", "pvQxwPSpyV81YnVvOxP7DD43", "IWD");
			String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName() + "failed due to some assertion or exception";
			
			try {
				jiraSp.updateTestcase("IWD");
			} catch (JiraException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//String issueDescription = result.getThrowable().getMessage() + "\n";
			//issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
			//jiraSp.createJiraTicket("Bug", issueSummary, issueDescription, "AD Test Report");
	
		}
	  
	  }
	  */
	  
	
	public void onTestFailure(ITestResult result) {

		JiraPolicy jiraPolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
		boolean isTicketReady = jiraPolicy.logTicketReady();
		
		if(isTicketReady)
		{
			//raise ticket in jira
			System.out.println("is ticket ready for Jira:" + isTicketReady);
			JiraServiceProvider jiraSp = new JiraServiceProvider("https://plancanada.atlassian.net", "dsathavara@plancanada.ca", "DuHGoGrctHzRjUt0Yyr71129", "IWD");
			String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName() + "failed due to some assertion or exception";
			String issueDescription = result.getThrowable().getMessage() + "\n";
			issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
			jiraSp.createJiraTicket("Bug", issueSummary, issueDescription, "Dhaval Sathavara");
	
		}
	}
	

	
	/*
	 * public void onTestSkipped(ITestResult result) { // TODO Auto-generated method
	 * stub ITestListener.super.onTestSkipped(result); }
	 * 
	 * public void onTestFailedButWithinSuccessPercentage(ITestResult result) { //
	 * TODO Auto-generated method stub
	 * ITestListener.super.onTestFailedButWithinSuccessPercentage(result); }
	 * 
	 * public void onTestFailedWithTimeout(ITestResult result) { // TODO
	 * Auto-generated method stub
	 * ITestListener.super.onTestFailedWithTimeout(result); }
	 * 
	 * public void onStart(ITestContext context) { // TODO Auto-generated method
	 * stub ITestListener.super.onStart(context); }
	 * 
	 * public void onFinish(ITestContext context) { // TODO Auto-generated method
	 * stub ITestListener.super.onFinish(context); }
	 */
	
}
