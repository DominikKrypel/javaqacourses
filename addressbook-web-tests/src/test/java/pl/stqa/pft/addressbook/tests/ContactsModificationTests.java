package pl.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.ContactData;
import pl.stqa.pft.addressbook.model.GroupData;

public class ContactsModificationTests extends TestBase {

    @Test
    public void testContactModification() throws Exception {
        app.getNavgationHelper().goToContactsPage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData( "aaa", "aaa", "aaa",
                    "aaa", "aaa", "aaa", "aaa",
                    "aaa", "aaa", "aaa", "group1"), true);
            //app.getContactHelper().submitContactCreation();
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData( "2222", "2222", "2222",
                "2222", "2222", "2222", "2222",
                "2222", "222222", "2222", "group1"), false);
        app.getContactHelper().submitContactModification();
        app.getNavgationHelper().goToContactsPage();
    }
}
