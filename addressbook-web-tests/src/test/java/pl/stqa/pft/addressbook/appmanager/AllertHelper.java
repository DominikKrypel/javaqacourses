package pl.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AllertHelper {

    public boolean acceptNextAlert;
    WebDriver wd;

    AllertHelper(WebDriver wd){
        this.wd = wd;
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
}
