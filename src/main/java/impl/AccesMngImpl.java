package impl;

import pages.AccesMngPage;

public class AccesMngImpl {
    AccesMngPage page;

    public AccesMngPage getPage(){
        if(page==null)
            page = new AccesMngPage();
        return page;
    }

    public void InputField(String value, String inputField){
        switch (inputField.toLowerCase()){
            case "First Name": getPage().fristNameInput.sendKeys(value);
                break;
            case "Last Name": getPage().lastNameInput.sendKeys(value);
                break;
            case "E-mail": getPage().emailInput.sendKeys(value);
                break;
            default:
                System.out.println("Field name was not found...");
        }

    }




}
