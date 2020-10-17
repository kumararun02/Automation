package mob.base;

import org.openqa.selenium.By;

import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;

public class TestElement extends QAFExtendedWebElement{

	public TestElement(By by) {
		super(by);
		// TODO Auto-generated constructor stub
	}
	
	public TestElement(String locator) {
		super(locator);
	}

	public TestElement(TestElement parentElement, String locator) {
		super(parentElement, locator);
	}
	
	//action
	public void click() {
		super.click();
		TestAppBase.testWait(500);
	}
}
