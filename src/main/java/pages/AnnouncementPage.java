package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class AnnouncementPage {
    public AnnouncementPage(){
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn-success mt-4 mb-4']")
    public WebElement AddBtn;

    @FindBy (xpath = "//input[@placeholder='Title']")
    public WebElement titleInput;

    @FindBy (xpath = "//textarea[@placeholder='Enter your announcement...']")
    public WebElement announcementInput;

    @FindBy (xpath = "//button[@class=\'btn btn-secondary btn-sm mb-4\']")
    public WebElement postBtn;

    @FindBy (xpath = "//tbody/tr/td/b[1]")
    public WebElement announcementList;

    @FindBy(xpath = "(//div[@class='each_announcement mt-2'])[1]")
    public WebElement descriptionList;

    @FindBy (xpath = "(//u[@id='delete_post'])[1]")
    public WebElement deleteBtn;


}
