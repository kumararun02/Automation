package mob.steps;

import com.qmetry.qaf.automation.step.QAFTestStep;

import mob.base.TestAppVerify;
import mob.page.TestPageDashBoard;
import mob.page.TestPageHome;
import mob.page.TestPageNotifications;

public class TestStepsNotifications {
	
	@QAFTestStep(description = "Test_Notifications_Page is the current page")
	public void testStepsNotificationsCur() {
		
		TestAppVerify.verify(new TestPageNotifications().isPageActive());
	}

	@QAFTestStep(description = "Test_Notifications_Page Only Notifications icon is highlighted")
	public void testStepsNotificationsVerify1() {
		TestAppVerify.verify(!new TestPageHome().isFooterTextHighlighted());
		TestAppVerify.verify(!new TestPageDashBoard().isFooterTextHighlighted());
		TestAppVerify.verify(new TestPageNotifications().isFooterTextHighlighted());
	}
	
	@QAFTestStep(description = "Test_Notifications_Page I can see text Notifications on the main screen")
	public void testStepsNotificationsVerify2() {
		TestAppVerify.verify(new TestPageNotifications().isMessageDisplayed());
	}
}
