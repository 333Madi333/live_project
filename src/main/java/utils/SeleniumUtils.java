package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class SeleniumUtils {

    /**
     * This method will handle switching form one window to another.
     * NOTE: method handles only 2 windows at a time.
     */
    public static void switchToNextWindow(){
        String currentWindow = WebDriverUtils.getDriver().getWindowHandle();
        Set<String> allWindows = WebDriverUtils.getDriver().getWindowHandles();

        for(String each: allWindows){
            if(!each.equals(currentWindow)){
                WebDriverUtils.getDriver().switchTo().window(each);
            }
        }

    }
    public static String switchToNextWindowGetTitle(){
        String title="";
        String currentWindow = WebDriverUtils.getDriver().getWindowHandle();
        Set<String> allWindows = WebDriverUtils.getDriver().getWindowHandles();

        for(String each: allWindows){
            if(!each.equals(currentWindow)){
                WebDriverUtils.getDriver().switchTo().window(each);
            }
        }
        title = WebDriverUtils.getDriver().getTitle();
        WebDriverUtils.closeDriver();
        WebDriverUtils.getDriver().switchTo().window(currentWindow);
        return title;

    }

    public static void selectByVisibleText(WebElement element, String textValue){
        Select select = new Select(element);
        select.selectByVisibleText(textValue);

    }

    public static void sleep(int milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void highlightElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) WebDriverUtils.getDriver();


                    js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: black;" +
                            "border: 3px solid red; background: yellow");

        }


    public static void moveElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) WebDriverUtils.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", element);

    }

}


