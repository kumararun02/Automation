package mob.steps;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;

import mob.base.TestAppBase;
import mob.base.TestAppVerify;
import mob.page.TestAppFooter;
import mob.page.TestAppHeader;

@QAFTestStepProvider
public class TestStepsBase {

	@QAFTestStep(description = "Test_Base Launch the app")
	public void testStepsBaseLaunchApp() {
		new TestAppBase().launchApp();
	}

	@QAFTestStep(description = "Test_Base Tap on Home icon")
	public void testStepsBaseNav1() {
		new TestAppFooter().tapHome();
	}

	@QAFTestStep(description = "Test_Base Tap on Dashboard icon")
	public void testStepsBaseNav2() {
		new TestAppFooter().tapDashBoard();
	}
	
	@QAFTestStep(description = "Test_Base Tap on Notifications icon")
	public void testStepsBaseNav3() {
		new TestAppFooter().tapNotification();
	}

	@QAFTestStep(description = "Test_Base Top bar is visible")
	public void testStepsBaseVerify1() {
		TestAppVerify.verify(new TestAppHeader().isTopBarDisplayed());
	}

	@QAFTestStep(description = "Test_Base I can see text testApplication on the bar")
	public void testStepsBaseVerify2() {
		TestAppVerify.verify(new TestAppHeader().isTopBarTextDisplayed());
	}

}
