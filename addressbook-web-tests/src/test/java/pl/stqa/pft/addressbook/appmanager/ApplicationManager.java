package pl.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;

    private ContactHelper contactHelper;
    private NavgationHelper navgationHelper;
    private GroupHelper groupHelper;
    public boolean acceptNextAlert;

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/index.php");
        groupHelper = new GroupHelper(wd);
        navgationHelper = new NavgationHelper(wd);
        contactHelper = new ContactHelper(wd);

        login("admin", "secret");
    }

    private void login(String username, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//input[@value='Login']")).click();
    }


    public void stop() {
        wd.findElement(By.linkText("Logout")).click();
       wd.quit();
    }

    public String closeAlertAndGetItsText() {                // Ta metoda akceptuje alerty, do których nie ma dojścia przez HTML/F12

        try {
            Alert alert = wd.switchTo().alert();
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

    public NavgationHelper getNavgationHelper() {
        return navgationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
