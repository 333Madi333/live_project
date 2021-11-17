package impl;

import org.openqa.selenium.WebElement;
import pages.AccesMngPage;
import pages.InitialUserLoginPage;
import utils.SeleniumUtils;

import java.util.List;


public class InitialUserLoginImpl {
    InitialUserLoginPage page;
    AccesMngPage accesMngPage;

    public InitialUserLoginPage getPage(){
        if(page==null)
            page = new InitialUserLoginPage();
        return page;
    }

    public AccesMngPage getAccesMngPage(){
        if(accesMngPage==null)
            accesMngPage = new AccesMngPage();
        return accesMngPage;
    }


    public String  CheckPassword(String userName, String password){

        String passValue = "";
        List <WebElement> users = getAccesMngPage().usersList;
        List <WebElement> pass = getAccesMngPage().passwordsList;

        for (int i=0; i<users.size(); i++) {
            if (users.get(i).getText().equals(userName)) {
                passValue = pass.get(i).getText();
                SeleniumUtils.highlightElement(users.get(i));
                SeleniumUtils.highlightElement(pass.get(i));
            }

        }

        return passValue;


    }




}
