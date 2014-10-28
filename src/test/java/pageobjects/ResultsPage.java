package pageobjects;

import static com.codeborne.selenide.Selenide.$;

/**
 * Google Results. Holds methods to interact with
 * results pages.
 * 
 */

public class ResultsPage {
	public String getResultsCount() {
		String resultStats = $("#resultStats").getText();
		return resultStats.substring(0, resultStats.indexOf("("));
	}
	
	public String getPageLoadTime() {
		String resultStats = $("#resultStats").getText();
		return resultStats.substring(resultStats.indexOf("(") + 1, resultStats.indexOf(")"));
	}
}
