package pl.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() throws Exception {
        app.goToContactsPage();
        app.getGroupHelper().selectContacts();
        app.getGroupHelper().deleteContacts();
        app.closeAlertAndGetItsText();
    }


}
