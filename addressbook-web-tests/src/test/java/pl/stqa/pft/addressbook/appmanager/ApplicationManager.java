package pl.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;

    private AllertHelper allertHelper;
    private SessionHelper sessionHelper;
    private ContactHelper contactHelper;
    private NavgationHelper navgationHelper;
    private GroupHelper groupHelper;
    private final String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        } else if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.SAFARI)) {
            wd = new SafariDriver();
        }
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/index.php");
        groupHelper = new GroupHelper(wd);
        navgationHelper = new NavgationHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper = new SessionHelper(wd);
        allertHelper = new AllertHelper(wd);
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        wd.findElement(By.linkText("Logout")).click();
       wd.quit();
    }

    public GroupHelper getGroupHelper() { return groupHelper;}

    public NavgationHelper getNavgationHelper() {
        return navgationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public AllertHelper getAllertHelper() {
        return allertHelper;
    }
}
