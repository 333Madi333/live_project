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
    public WebElement roleSel;

    @FindBy (id = "Batch")
    public WebElement batchSel;

    @FindBy (xpath = "//button[text()='Add User']")
    public WebElement addUserBtn;

    @FindBy (xpath = "//button[text()='Manage Access']")
    public WebElement mngAcsBtn;

    @FindBy (xpath = "//button[text()='Delete']")
    public List<WebElement> deleteBtnList;

    @FindBy (xpath = "//button[@class='btn btn-danger mt-3']")
    public WebElement del;


    @FindBy (xpath = "//tr/td[3]")
    public List<WebElement> usersList;

    @FindBy (xpath = "//tr/td[4]")
    public List<WebElement> passwordsList;

    @FindBy (xpath = "//tr/td[7]")
    public List<WebElement> dropDownList;



}
