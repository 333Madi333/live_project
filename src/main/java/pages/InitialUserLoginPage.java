package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class InitialUserLoginPage {
    public InitialUserLoginPage() {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }




    @FindBy(xpath = "//h4")
    public WebElement msg;

    @FindBy(name = "newPassword1")
    public WebElement newPassInput;

    @FindBy(name = "newPassword2")
    public WebElement newPassInput2;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitBtn;

    @FindBy(id = "welcome_msg")
    public WebElement welcomeM;

    }

