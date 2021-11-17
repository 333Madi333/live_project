package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

import java.util.List;

public class studentNavPage {

    public  studentNavPage () {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);

    }
    @FindBy(name = "email")
    public WebElement userNameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginBtn;

    @FindBy(linkText = "Homeworks")
    public WebElement HomeworkLink;

    @FindBy(linkText = "Meeting links")
    public WebElement MeetingsLink;

    @FindBy(css = "h2[id='welcome_msg']")
    public WebElement WelMsg;


}

