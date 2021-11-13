package impl;

import pages.HomePage;
import pages.studentNavPage;
import utils.ConfigReader;
import utils.WebDriverUtils;

public class studentNavImpl {

    studentNavPage page;

    public studentNavPage getPage() {
        if (page == null)
            page = new studentNavPage();
        return page;
    }

    public void navigateToHomepage() {
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));

    }

    public String getTitle() {
        return WebDriverUtils.getDriver().getTitle();
    }

    public void clickButton(String button) {
        switch (button.toLowerCase()) {
            case "login":
                getPage().loginBtn.click();
                break;
            case "homeworks":
                getPage().HomeworkLink.click();
                break;
            case "meeting":
                getPage().MeetingsLink.click();
                break;
        }
    }
}
