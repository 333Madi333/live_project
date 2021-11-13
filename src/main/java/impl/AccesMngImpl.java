package impl;

import pages.AccesMngPage;

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

}
