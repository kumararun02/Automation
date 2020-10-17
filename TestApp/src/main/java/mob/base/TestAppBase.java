package mob.base;

import com.quantum.utils.ConsoleUtils;
import com.quantum.utils.DriverUtils;

public class TestAppBase extends DriverUtils{

	protected String title = "";
	
	// Element Declaration
	public TestElement getTitle() {
		return new TestElementHandle().getStaticTextContains(title);
	}
	
	// is page Active
	public boolean isPageActive() {
		return getTitle().isPresent();
	}
	
	//Sleep
	public static void testWait(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//Launch App
	public void launchApp() {
		ConsoleUtils.logInfoBlocks("launching the app");
		DriverUtils.getAndroidDriver().launchApp();
		ConsoleUtils.logInfoBlocks("testApp Launched");
		testWait(5000);
	}
}
