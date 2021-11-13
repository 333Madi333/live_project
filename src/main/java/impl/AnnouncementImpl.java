package impl;

import pages.AnnouncementPage;

public class AnnouncementImpl {
    AnnouncementPage page;

    public AnnouncementPage getPage() {
        if(page == null)
            page = new AnnouncementPage();
        return page;
    }

    public void InputField(String inputAnnouncement, String value) {
        switch (inputAnnouncement.toLowerCase()) {
            case "title": getPage().titleInput.sendKeys(value);
                break;
            case "announcement": getPage().announcementInput.sendKeys(value);
                break;
            default:
                System.out.println("Field name was not found...");
        }
    }

}
