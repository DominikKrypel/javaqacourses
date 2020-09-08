package pl.stqa.pft.addressbook.tests;

import org.testng.Assert;
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
        int before = app.getContactHelper().getConctactCount();
        app.getNavgationHelper().goToContactsPage();
        app.getContactHelper().selectContacts(before - 1);
        app.getContactHelper().deleteContacts();
        app.getAllertHelper().closeAlertAndGetItsText();
        app.getNavgationHelper().goToContactsPage();
        int after = app.getContactHelper().getConctactCount();
        Assert.assertEquals(after, before - 1);

    }
}
