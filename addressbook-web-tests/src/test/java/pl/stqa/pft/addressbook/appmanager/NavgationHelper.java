package pl.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavgationHelper {
    private WebDriver wd;

    public NavgationHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void gotoContactsCreationPage() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void goToContactsPage() {
        wd.findElement(By.linkText("home")).click();
    }
}
