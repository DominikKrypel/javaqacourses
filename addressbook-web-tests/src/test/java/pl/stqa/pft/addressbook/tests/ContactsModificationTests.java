package pl.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.ContactData;

public class ContactsModificationTests extends TestBase {

    @Test
    public void testContactModification() throws Exception {
        app.getNavgationHelper().goToContactsPage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData( "qqqq", "wwwww", "eeee",
                "rrrr", "tttt", "yyyyy", "uuuu",
                "iiiii", "222222", "33333"));
        app.getContactHelper().submitContactModification();
        app.getNavgationHelper().goToContactsPage();
    }
}
