package mob.page;

import mob.base.TestAppBase;
import mob.base.TestElement;
import mob.base.TestElementHandle;

public class TestAppFooter extends TestAppBase {

	protected String footerText = "";
	protected int index = 1;

	// Footer - Elements

	public TestElement getHome() {
		return new TestElementHandle().getElementByID("com.interview.testapp:id/navigation_home");
	}

	public TestElement getDashboard() {
		return new TestElementHandle().getElementByID("com.interview.testapp:id/navigation_dashboard");
	}

	public TestElement getNotifications() {
		return new TestElementHandle().getElementByID("com.interview.testapp:id/navigation_notifications");
	}

	// Footer attributes
	public TestElement getFooterIcon() {
		return new TestElementHandle().getImageViewContains(index);
	}

	public TestElement getFooterText() {
		return new TestElementHandle().getButtonContains(footerText,"android.widget.TextView");
	}

	// Navigation

	public TestPageHome tapHome() {
		getHome().click();
		return new TestPageHome();
	}

	public TestPageDashBoard tapDashBoard() {
		getDashboard().click();
		return new TestPageDashBoard();
	}

	public TestPageNotifications tapNotification() {
		getNotifications().click();
		return new TestPageNotifications();
	}

	// is page Active
	public boolean isPageActive() {
		return getTitle().isPresent();
	}

	public boolean isFooterTextHighlighted() {
		String text = getFooterText().getAttribute("resource-id");
		return text.contains("large");
	}

}
