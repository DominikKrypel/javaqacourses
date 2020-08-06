package pl.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() throws Exception {
        app.goToContactsPage();
        app.selectContacts();
        app.deleteContacts();
        app.closeAlertAndGetItsText();
    }


}
