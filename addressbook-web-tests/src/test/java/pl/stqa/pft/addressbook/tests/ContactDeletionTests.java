package pl.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() throws Exception {
        app.getNavgationHelper().goToContactsPage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData( "aaa", "aaa", "aaa",
                    "aaa", "aaa", "aaa", "aaa",
                    "aaa", "aaa", "aaa", "new_group"), true);
        }
        app.getNavgationHelper().goToContactsPage();
        app.getContactHelper().selectContacts();
        app.getContactHelper().deleteContacts();
        app.getAllertHelper().closeAlertAndGetItsText();
    }
}
