package pl.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() throws Exception {
        app.getNavgationHelper().goToContactsPage();
        app.getContactHelper().selectContacts();
        app.getContactHelper().deleteContacts();
        app.getAllertHelper().closeAlertAndGetItsText();
    }


}
