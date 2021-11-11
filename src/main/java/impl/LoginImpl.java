package impl;

import pages.LoginPage;
import utils.ConfigReader;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

public class LoginImpl {
    private LoginPage page;

    public LoginPage getPage() {
        if(page == null){
            page = new LoginPage();
        }
        return page;
    }

    public void navigateToLoginPage(){
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
    }

    public void fillInputField(String inputFieldName, String value){
        switch (inputFieldName.toLowerCase()){
            case "username": getPage().userNameInput.sendKeys(value);
                break;
            case "password": getPage().passwordInput.sendKeys(value);
                break;
            default:
                System.out.println("Field name was not found...");
        }

    }
}
