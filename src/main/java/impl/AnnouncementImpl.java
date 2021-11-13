package impl;

import pages.AnnouncementPage;

public class AnnouncementImpl {
    AnnouncementPage page;

    public AnnouncementPage getPage() {
        if(page == null)
            page = new AnnouncementPage();
        return page;
    }




}
