package impl;

import pages.MainNavPage;
import utils.WebDriverUtils;

public class MainNavImpl {

    private MainNavPage mainNavPage;

    public MainNavPage getPage() {

        if (mainNavPage == null)
            mainNavPage = new MainNavPage();

        return mainNavPage;
    }

    public String getTitle() {

        return WebDriverUtils.getDriver().getTitle();
    }

    public void clickButton(String button) {

        switch (button.toLowerCase()) {
            case "homeworks":
                getPage().homeworksBtn.click();
                break;
            case "meeting":
                getPage().meetingLinksBtn.click();
                break;
            case "access":
                getPage().accessManagementBtn.click();
                break;
        }
    }
}