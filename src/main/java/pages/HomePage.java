package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

import java.util.List;


public class HomePage {
    public HomePage() {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }
    @FindBy(xpath = "//td/b")
    public List<WebElement> Title;

    @FindBy(xpath = "//div[@class='each_announcement mt-2']")
    public List<WebElement> Message;

    @FindBy(xpath = "//td[@class='each_announcement mt-2']")
    public List<WebElement> TimeStamp;
}
