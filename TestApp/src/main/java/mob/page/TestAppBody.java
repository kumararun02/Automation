package mob.page;

import mob.base.TestElement;
import mob.base.TestElementHandle;

public class TestAppBody extends TestAppFooter {

	protected String message = "";

	// Body - Elements
	public TestElement getPageContent() {
		return new TestElementHandle().getElementByID("com.interview.testapp:id/message");
	}

	// is text
	public boolean isMessageDisplayed() {
		String text = getPageContent().getText();
		return text.contains(message);
	}
}
