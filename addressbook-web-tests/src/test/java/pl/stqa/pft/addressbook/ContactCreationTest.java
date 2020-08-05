package pl.stqa.pft.addressbook;

import org.testng.annotations.Test;


public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() throws Exception {

        gotoContactsCreationPage();
        fillContactForm(new ContactData( "test4", "test5", "test6",
                                         "test7", "test8", "test9", "Test10",
                                         "111111", "222222", "33333"));
        submitContactCreation();
        goToContactsPage();

    }
}
