package impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AccesMngPage;
import utils.WebDriverUtils;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AccesMngImpl {
    AccesMngPage page;

    public AccesMngPage getPage(){
        if(page==null)
            page = new AccesMngPage();
        return page;
    }

    public void InputField(String inputField, String value){
        switch (inputField.toLowerCase()){
            case "first name": getPage().fristNameInput.sendKeys(value);
                break;
            case "last name": getPage().lastNameInput.sendKeys(value);
                break;
            case "e-mail": getPage().emailInput.sendKeys(value);
                break;
            default:
                System.out.println("Field name was not found...");
        }

    }


    public void selectRole(String selRole){
        Select select = new Select(getPage().roleSel);
        List<WebElement> list = select.getOptions();

        switch (selRole.toLowerCase()){
            case "student": select.selectByVisibleText("Student");
                break;
            case "instructor": select.selectByVisibleText("Instructor");
                break;
            case "mentor": select.selectByVisibleText("Mentor");
                break;
            default:
                System.out.println("Select was not found...");
        }

    }



    public void selectBatch(String selBatch){
        Select select = new Select(getPage().batchSel);
        List<WebElement> list = select.getOptions();

        switch (selBatch.toLowerCase()){
            case "n/a": select.selectByVisibleText("N/A");
                break;
            case "1": select.selectByVisibleText("1");
                break;
            case "2": select.selectByVisibleText("2");
                break;
            case "3": select.selectByVisibleText("3");
                break;
            case "4": select.selectByVisibleText("4");
                break;
            case "5": select.selectByVisibleText("5");
                break;
            case "6": select.selectByVisibleText("6");
                break;
            case "7": select.selectByVisibleText("7");
                break;
            case "8": select.selectByVisibleText("8");
                break;
            case "9": select.selectByVisibleText("9");
                break;
            case "10": select.selectByVisibleText("10");
                break;
            default:
                System.out.println("Select was not found...");
        }

    }

    public void deleteUser(String UserName) throws InterruptedException {

        Thread.sleep(500);

        List <WebElement> names = getPage().usersList;
        List <WebElement> pass = getPage().passwordsList;
        List <WebElement> drop = getPage().dropDownList;
        List <WebElement> delete = getPage().deleteBtnList;
        int rowNumber = 0;

        for (int i=0; i<names.size(); i++) {
            if (names.get(i).getText().equals(UserName)) {
                System.out.println(pass.get(i).getText());
                rowNumber=i;
                drop.get(rowNumber).click();
           }

        }
        delete.get(rowNumber).click();

        Thread.sleep(500);

        String currentWindowID = WebDriverUtils.getDriver().getWindowHandle();
        Set<String> windows = WebDriverUtils.getDriver().getWindowHandles();
        for (String windowId : windows) {
            if (!windowId.equals(currentWindowID))
                WebDriverUtils.getDriver().switchTo().window(windowId);
        }
        getPage().del.click();

        System.out.println("size= " + names.size());


    }

}
