package pl.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavgationHelper extends HelperBase {

    public NavgationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    public void gotoContactsCreationPage() {
        click(By.linkText("add new"));
    }

    public void goToContactsPage() {
        click(By.linkText("home"));
    }
}
