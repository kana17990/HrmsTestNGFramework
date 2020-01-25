package com.hrms.utils;
public class  Constants {

public static final String CHROME_DRIVER_PATH = "/Users/assel/eclipse-workspace/HRMS/src/test/resources/drivers/chromedriver";

	public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir")
			+ "/src/test/resources/drivers/geckodriver";
	
public static final int PAGE_LOAD_TIME=30;

public static final int IMPLICIT_LOAD_TIME=10;

public static final int EXPLICIT_LOAD_TIME=30;

public static final String CREDENTIALS_FILEPATH="/Users/assel/eclipse-workspace/HRMS/src/test/resources/config/Configuration.properties";

public static final  String HRMS_URL="http://166.62.36.207/Syntax_HRM";

public static  final String XL_DATA_FILEPATH="/Users/assel/eclipse-workspace/HRMS/src/test/resources/testdata/HrmsTestData.xlsx";

public static final String REPORT_FILEPATH=System.getProperty("user.dir")+"/target/report/Hrms.html";

public static final String  OS_NAME=System.getenv("os.name");

public static final String USER_NAME=System.getProperty("ueser.name");

public static final String SCREENSHOTS_FILEPATH=System.getProperty("user.dir")+"target/screenshots/";

}


