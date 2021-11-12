package impl;

import pages.EditUserPage;
import pages.LoginPage;
import utils.SeleniumUtils;

import java.util.HashMap;
import java.util.Map;

public class EditUserImpl {
    EditUserPage page;

    public EditUserPage getPage() {
        if (page == null) {
            page = new EditUserPage();
        }
        return page;
    }

    Map<String, String> userFieldInputsMap = new HashMap<>();

    public void fillCreateNewUser(String inputFieldName, String value) {
        switch (inputFieldName.toLowerCase()) {
            case "first name": getPage().firstNameInput.sendKeys(value);
                break;
            case "last name": getPage().lastNameInput.sendKeys(value);
                break;
            case "e-mail": getPage().emailInput.sendKeys(value);
                break;
            case "role":
                SeleniumUtils.selectByVisibleText(getPage().selectRole, value);
                break;
            case  "batch":
                SeleniumUtils.selectByVisibleText(getPage().selectBatch, value);
                break;
            default:
                System.out.println("Field name was not found....!!");
        }
        userFieldInputsMap.put(inputFieldName, value);
    }
}
