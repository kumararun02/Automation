package mob.steps;

import com.qmetry.qaf.automation.step.QAFTestStep;

import mob.base.TestAppVerify;
import mob.page.TestPageDashBoard;
import mob.page.TestPageHome;
import mob.page.TestPageNotifications;

public class TestStepsHome {
	
	@QAFTestStep(description = "Test_Home_Page is the current page")
	public void testStepsHomeCur() {
		TestAppVerify.verify(new TestPageHome().isPageActive());
	}

	@QAFTestStep(description = "Test_Home_Page Only Home tab is selected")
	public void testStepsHomeVerify1() {
		TestAppVerify.verify(new TestPageHome().isFooterTextHighlighted());
		TestAppVerify.verify(!new TestPageDashBoard().isFooterTextHighlighted());
		TestAppVerify.verify(!new TestPageNotifications().isFooterTextHighlighted());
	}
	
	@QAFTestStep(description = "Test_Home_Page I can see text Home on the main screen")
	public void testStepsHomeVerify2() {
		TestAppVerify.verify(new TestPageHome().isMessageDisplayed());
	}

}
