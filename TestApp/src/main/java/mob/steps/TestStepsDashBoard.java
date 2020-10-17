package mob.steps;

import com.qmetry.qaf.automation.step.QAFTestStep;

import mob.base.TestAppVerify;
import mob.page.TestPageDashBoard;
import mob.page.TestPageHome;
import mob.page.TestPageNotifications;

public class TestStepsDashBoard {
	
	@QAFTestStep(description = "Test_DashBoard_Page is the current page")
	public void testStepsDashBoardCur() {
		TestAppVerify.verify(new TestPageDashBoard().isPageActive());
	}
	
	@QAFTestStep(description = "Test_DashBoard_Page Only Dashboard icon is highlighted")
	public void testStepsDashBoardVerify1() {
		TestAppVerify.verify(!new TestPageHome().isFooterTextHighlighted());
		TestAppVerify.verify(new TestPageDashBoard().isFooterTextHighlighted());
		TestAppVerify.verify(!new TestPageNotifications().isFooterTextHighlighted());
	}

	@QAFTestStep(description = "Test_DashBoard_Page I can see text Dashboard on the main screen")
	public void testStepsDashBoardVerify2() {
		TestAppVerify.verify(new TestPageDashBoard().isMessageDisplayed());
	}
}
