package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

import java.util.List;


public class    HomePage {
    public HomePage() {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy(id = "welcome_msg")
    public WebElement welcomeMSG;



}
