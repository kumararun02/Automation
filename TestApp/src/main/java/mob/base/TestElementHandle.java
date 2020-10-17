package mob.base;

import org.openqa.selenium.By;

public class TestElementHandle {

	// xPath Generator -- content-desc
	public String xPathContains(String tag, String identifier, String text) {
		String xPath = "//"+tag+"[contains(@" + identifier + ",'" + text + "')]";
		return xPath;
	}
	
	public String xPathContains(String tag, String identifier, String text, String childType) {
		String xPath = "//"+tag+"[contains(@" + identifier + ",'" + text + "')]//"+childType;
		return xPath;
	}

	public String xPathEquals(String tag, String identifier, String text) {
		String xPath = "//"+tag+"[@" + identifier + "='" + text + "']";
		return xPath;
	}

	public String xPathEquals(String tag, String identifier, String text, String childType) {
		String xPath = "//"+tag+"[@" + identifier + "='" + text + "']//" + childType;
		return xPath;
	}

	public String xPathIndex(String xPath, int index) {
		return "(" + xPath + ")[" + index + "]";
	}

	//
	public TestElement getElementContains(String text) {
		return new TestElement(text);
	}

	// Static Text Element
	public TestElement getStaticTextContains() {
		return new TestElement(By.xpath("//android.widget.TextView"));
	}

	public TestElement getStaticTextContains(String text) {
		return new TestElement(By.xpath(xPathContains("android.widget.TextView", "text", text)));
	}

	public TestElement getStaticTextContains(String text, int index) {
		String xPath = xPathContains("android.widget.TextView", "text", text);
		xPath = xPathIndex(xPath, index);
		return new TestElement(By.xpath(xPath));
	}

	// Frame Element

	public TestElement getButtonContains(String text) {
		return new TestElement(By.xpath(xPathContains("android.widget.FrameLayout", "content-desc", text)));
	}

	public TestElement getButtonContains(String text, String childType) {
		return new TestElement(By.xpath(xPathContains("android.widget.FrameLayout", "content-desc", text,childType)));
	}
	
	public TestElement getButtonContains(String text, int index) {
		String xPath = xPathContains("android.widget.FrameLayout", "content-desc", text);
		xPath = xPathIndex(xPath, index);
		return new TestElement(By.xpath(xPath));
	}

	// Element by ID
	public TestElement getElementByID(String text) {
		return new TestElement(By.xpath(xPathEquals("*", "resource-id", text)));
	}

	public TestElement getElementByID(String text, String childType) {
		return new TestElement(By.xpath(xPathEquals("*", "resource-id", text, childType)));
	}
	
	//android.widget.ImageView
	
	public TestElement getImageViewContains() {
		return new TestElement(By.xpath("//android.widget.ImageView"));
	}

	public TestElement getImageViewContains(int index) {
		String xPath = "//android.widget.ImageView";
		xPath = xPathIndex(xPath, index);
		return new TestElement(By.xpath(xPath));
	}
}
