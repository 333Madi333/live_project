package impl;

import pages.HomePage;
import utils.SeleniumUtils;

public class HomeImpl {
    HomePage page;

    public HomePage getPage(){
        if(page==null)
            page = new HomePage();
        return page;
    }




}
