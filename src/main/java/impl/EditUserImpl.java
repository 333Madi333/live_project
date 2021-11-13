package impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.EditUserPage;
import pages.LoginPage;
import utils.SeleniumUtils;

import java.util.HashMap;
import java.util.List;
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
            case "password":
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

    public String verifyUserInformationIsUpdated() {
        String result = "success";
        List<WebElement> firstRowDetails = getPage().uAccountInfo.findElements(By.xpath(".//td"));

        for(String eachField : userFieldInputsMap.keySet()) {
            boolean missing = true;
            for(int i=0; i<firstRowDetails.size(); i++) {
                if (i==3) {
                    break;
                }
                if (firstRowDetails.get(i).getText().equals(userFieldInputsMap.get(eachField))) {
                    missing = false;
                    break;
                }
            }
            if (missing) {
                result = "fail";
            }
            return result;
        }
        return result;
    }

    public String verifyDeleteUserInformation() {
        String result = "success";
        List<WebElement> firstRowDetails = getPage().uAccountInfo.findElements(By.xpath(".//td"));

        for(String eachField : userFieldInputsMap.keySet()) {
            boolean missing = true;
            for(int i=0; i<firstRowDetails.size();i++) {
                if(i==3) {
                    break;
                }
                if(!firstRowDetails.get(i).getText().equals(userFieldInputsMap.get(eachField))) {
                    missing = false;
                    break;
                }
            }
            if(missing) {
                result = "fail";
            }
            return result;
        }
        return result;
    }
}
