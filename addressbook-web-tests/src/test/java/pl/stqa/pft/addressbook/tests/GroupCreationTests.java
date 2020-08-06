package pl.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import pl.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {

        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("sss", "ddd", "fff"));
        app.submitGroupCreation();
        app.returnToGroupPage();

    }

}
