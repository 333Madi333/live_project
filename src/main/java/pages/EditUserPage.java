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

    @FindBy(xpath = "//*[@id='myModal']//h5")
    public WebElement updateUserPopUpHeader;

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
}
