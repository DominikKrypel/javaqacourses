package pl.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pl.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
   private WebDriver wd;

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        click(By.name("theform"));
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        click(By.name("theform"));
        type(By.name("home"), contactData.getHomePhone());
        type(By.name("mobile"), contactData.getMobilePhone());
        type(By.name("work"), contactData.getWorkPhone());
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void selectContacts() {
        click(By.name("selected[]"));
    }

    public void deleteContacts() {
        click(By.xpath("//input[@value='Delete']"));
    }
}
