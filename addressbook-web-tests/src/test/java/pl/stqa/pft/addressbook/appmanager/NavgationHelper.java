package pl.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavgationHelper extends HelperBase {

    public NavgationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("New"))) {
            return;
        }
        else {
            click(By.linkText("groups"));
        }
    }

    public void gotoContactsCreationPage() {
        click(By.linkText("add new"));
    }

    public void goToContactsPage() {
        click(By.linkText("home"));
    }
}
