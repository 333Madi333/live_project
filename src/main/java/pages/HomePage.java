package pages;


import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;


public class HomePage {
    public HomePage() {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

}
