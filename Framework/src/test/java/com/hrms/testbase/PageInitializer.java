package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.testbase.BaseClass;

public class PageInitializer extends BaseClass{
	
	protected static LoginPageElements login;
	protected static DashboardPageElements dashboard;
	protected static AddEmployeePageElements addEmp;
	protected static PersonalDetailsPageElements pdetails;
	protected static LeaveListPageElements leave;

	public static void initializeAllPages() {

		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		pdetails = new PersonalDetailsPageElements();
		leave=new LeaveListPageElements();
		
	}
}