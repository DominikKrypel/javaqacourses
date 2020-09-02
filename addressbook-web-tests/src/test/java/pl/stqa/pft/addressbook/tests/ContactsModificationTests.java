package pl.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.ContactData;
import pl.stqa.pft.addressbook.model.GroupData;

public class ContactsModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavgationHelper().goToContactsPage();
        int before = app.getContactHelper().getConctactCount();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData( "aaa", "aaa", "aaa",
                    "aaa", "aaa", "aaa", "aaa",
                    "aaa", "aaa", "aaa", "new_group"), true);
        }
        app.getNavgationHelper().goToContactsPage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData( "2222", "2222", "2222",
                "2222", "2222", "2222", "2222",
                "2222", "222222", "2222", "new_group"), false);
        app.getContactHelper().submitContactModification();
        app.getNavgationHelper().goToContactsPage();
        int after = app.getContactHelper().getConctactCount();
        Assert.assertEquals(after, before);

    }
}
