package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

import java.util.List;

public class AccesMngPage {
    public AccesMngPage() {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy (id = "Firstname")
    public WebElement fristNameInput;

    @FindBy (id = "Lastname")
    public WebElement lastNameInput;

    @FindBy (id = "Email")
    public WebElement emailInput;

    @FindBy (id = "Role")
    public WebElement roleInput;

    @FindBy (id = "Batch")
    public WebElement batchInput;

    @FindBy (xpath = "//button[text()='Add User']")
    public WebElement addUserBtn;

    @FindBy (xpath = "//tr/td[3]")
    public List<WebElement> userNameList;

    @FindBy (xpath = "//tr/td[4]")
    public List<WebElement> passwordsList;

    @FindBy (xpath = "//button[text()='Manage Access']")
    public WebElement mngAcsBtn;



}
