package pl.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private final GroupHelper groupHelper = new GroupHelper();
    public boolean acceptNextAlert;

    public void init() {
        groupHelper.wd = new FirefoxDriver();
        groupHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        groupHelper.wd.get("http://localhost/addressbook/index.php");
        login("admin", "secret");
    }

    private void login(String username, String password) {
        groupHelper.wd.findElement(By.name("user")).click();
        groupHelper.wd.findElement(By.name("user")).clear();
        groupHelper.wd.findElement(By.name("user")).sendKeys(username);
        groupHelper.wd.findElement(By.name("pass")).clear();
        groupHelper.wd.findElement(By.name("pass")).sendKeys(password);
        groupHelper.wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void gotoGroupPage() {
        groupHelper.wd.findElement(By.linkText("groups")).click();
    }


    public void gotoContactsCreationPage() {
        groupHelper.wd.findElement(By.linkText("add new")).click();
    }

    public void stop() {
        groupHelper.wd.findElement(By.linkText("Logout")).click();
        groupHelper.wd.quit();
    }

    public void goToContactsPage() {
        groupHelper.wd.findElement(By.linkText("home")).click();
    }

    public String closeAlertAndGetItsText() {                // Ta metoda akceptuje alerty, do których nie ma dojścia przez HTML/F12

        try {
            Alert alert = groupHelper.wd.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.dismiss();
            } else {
                alert.accept();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    public GroupHelper getGroupHelper() {

        return groupHelper;
    }
}
