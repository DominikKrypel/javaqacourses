package pl.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import pl.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() throws Exception {

        app.getNavgationHelper().gotoContactsCreationPage();
        app.getContactHelper().fillContactForm(new ContactData( "test4", "test5", "test6",
                                         "test7", "test8", "test9", "Test10",
                                         "111111", "222222", "33333", "test1"),true);
        app.getContactHelper().submitContactCreation();
        app.getNavgationHelper().goToContactsPage();
    }
}