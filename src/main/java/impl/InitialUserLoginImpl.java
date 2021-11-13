package impl;

import pages.HomePage;
import pages.InitialUserLoginpage;

public class InitialUserLoginImpl {

    InitialUserLoginpage page;

        public InitialUserLoginpage getPage(){
            if(page==null)
                page = new InitialUserLoginpage();
            return page;
        }


    public static String switchWindoeGetText(){
            String text="";
            return text;
    }


    }
