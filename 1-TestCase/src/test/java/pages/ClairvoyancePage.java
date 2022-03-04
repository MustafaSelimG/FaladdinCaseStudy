package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.Driver;

import java.net.MalformedURLException;
import java.time.Duration;

public class ClairvoyancePage {
    public ClairvoyancePage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    public AndroidDriver driver = Driver.getDriver();

    @AndroidFindBy(id = "com.faladdin.app:id/progressBarDurugoru")
    public AndroidElement btnProgressBar;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    public AndroidElement btnSelectionGeneral;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    public AndroidElement btnSelectionLove;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
    public AndroidElement btnSelectionCareerMoney;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]")
    public AndroidElement btnSelectionHealth;

    @AndroidFindBy(id = "com.faladdin.app:id/btnSend")
    public AndroidElement btnSend;

    @AndroidFindBy(id = "com.faladdin.app:id/layoutChange")
    public AndroidElement btnEditProfile;

    public void pressProgressBar() {
        new TouchAction(driver)
                .longPress(new LongPressOptions()
                        .withElement(ElementOption.element(btnProgressBar))
                        .withDuration(Duration.ofSeconds(5)))
                .release()
                .perform();
    }

    public void clickSelectionGeneral() {
        btnSelectionGeneral.click();
    }

    public void clickSelectionLove() {
        btnSelectionLove.click();
    }

    public void clickSelectionCareerMoney() {
        btnSelectionCareerMoney.click();
    }

    public void clickSelectionHealth() {
        btnSelectionHealth.click();
    }

    public void clickSend() {
        btnSend.click();
    }

    public void verifyTopicPageElements() {
        Assert.assertEquals(ExpectedConditions.visibilityOf(btnSelectionGeneral), true);
        Assert.assertEquals(ExpectedConditions.visibilityOf(btnSelectionLove), true);
        Assert.assertEquals(ExpectedConditions.visibilityOf(btnSelectionCareerMoney), true);
        Assert.assertEquals(ExpectedConditions.visibilityOf(btnSelectionHealth), true);
        Assert.assertEquals(ExpectedConditions.visibilityOf(btnEditProfile), true);
        Assert.assertEquals(ExpectedConditions.visibilityOf(btnSend), true);
    }

}
