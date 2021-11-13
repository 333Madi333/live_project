package impl;

import pages.HomePage;
import utils.ConfigReader;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

public class HomeImpl {
    HomePage page;

    public HomePage getPage() {
        if (page == null)
            page = new HomePage();
        return page;
    }
}
