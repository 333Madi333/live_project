package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class EditUserPage {
    public EditUserPage() {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy(xpath = "//tr[1]//button[@id='dropdownMenu2']")
    public WebElement actionBtn;

    @FindBy(xpath = "//tr[1]//button[text()='Edit']")
    public WebElement editBtn;

    @FindBy(xpath = "//tr[1]//button[text()='Delete']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//tr[1]//button[text()='Reset Password']")
    public WebElement resetPassBtn;

    @FindBy(xpath = "//*[@id='myModal']//button[text()='Delete']")
    public WebElement confirmDeleteBtn;

    @FindBy(xpath = "//*[@id='myModal']//h5")
    public WebElement updateUserPopUpHeader;

    @FindBy(xpath = "//*[@id='myModal']//h4")
    public WebElement deleteUserPopUpHeader;

    @FindBy(id = "Firstname")
    public WebElement firstNameInput;

    @FindBy(id ="Lastname")
    public WebElement lastNameInput;

    @FindBy(id = "Email")
    public WebElement emailInput;

    @FindBy(id ="Role")
    public WebElement selectRole;

    @FindBy(id = "Batch")
    public WebElement selectBatch;

    @FindBy(id = "submit-btn")
    public WebElement addUserBtn;

    @FindBy(xpath = "//*[@id='list-table']/tbody/tr")
    public WebElement uAccountInfo;

    @FindBy(xpath = "//*[@id='list-table']/tbody/tr[1]/td[1]")
    public WebElement uFName;

    @FindBy(xpath = "//*[@id='list-table']/tbody/tr[1]/td[2]")
    public WebElement uLName;

    @FindBy(xpath = "//*[@id='list-table']/tbody/tr[1]/td[3]")
    public WebElement uEmail;

    @FindBy(xpath = "//*[@id='list-table']/tbody/tr[1]/td[4]")
    public WebElement uPWord;

    @FindBy(xpath = "//*[@id='list-table']/tbody/tr[1]/td[5]")
    public WebElement uRole;

    @FindBy(xpath = "//*[@id='list-table']/tbody/tr[1]/td[6]")
    public WebElement uBatch;

    @FindBy(xpath = "//div[@id='myModal']//input[@id='Firstname']")
    public WebElement upFNameFillBox;

    @FindBy(xpath = "//div[@id='myModal']//input[@id='Lastname']")
    public WebElement upLNameFillBox;

    @FindBy(xpath = "//div[@id='myModal']//input[@id='Email']")
    public WebElement upEmailFillBox;

    @FindBy(xpath = "//div[@id='myModal']//select[@id='Role']")
    public WebElement upRoleSelectOpt;

    @FindBy(xpath = "//div[@id='myModal']//select[@id='Batch']")
    public WebElement upBatchSelectOpt;

    @FindBy(xpath = "//*[@id='myModal']//*[@id='submit-btn']")
    public WebElement upUserBtn;

}
