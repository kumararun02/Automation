package mob.page;

import mob.base.TestElement;
import mob.base.TestElementHandle;

public class TestAppHeader extends TestAppBody {

	// Header - Elements
	public TestElement getActionBar() {
		return new TestElementHandle().getElementByID("com.interview.testapp:id/action_bar");
	}

	public TestElement getActionBarText() {
		return new TestElementHandle().getElementByID("com.interview.testapp:id/action_bar","android.widget.TextView");
	}

	// Top bar is present
	public boolean isTopBarDisplayed() {
		return getActionBar().isDisplayed();
	}

	public boolean isTopBarTextDisplayed() {
		String text = getActionBarText().getText();
		return text.contains("testApp");
	}
}
