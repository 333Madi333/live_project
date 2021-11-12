package pages;

import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class InitialUserLoginpage {
    public InitialUserLoginpage() {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    }

