package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

import java.util.List;

public class MainNavPage {

    public MainNavPage() {

        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy(css = "a[href='/homeworks']")
    public WebElement homeworksBtn;

    @FindBy(css = "a[href='/meeting-links']")
    public WebElement meetingLinksBtn;

    @FindBy(css = "a[href='/access-management']")
    public WebElement accessManagementBtn;

    @FindBy(css = "h2[id='welcome_msg']")
    public WebElement msg;

    @FindBy(css = "a > button")
    public List<WebElement> navBtn;

}