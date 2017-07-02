package page;

import core.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver = WebBrowser.getInstance();

    private static By loginField = By.id("mailbox__login");
    private static By passwordField = By.id("mailbox__password");
    private static By loginButton = By.id("mailbox__auth__button");

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    public MailBoxPage login(String email, String password) {
        driver.findElement(loginField).click();
        driver.findElement(loginField).sendKeys(email);
        driver.findElement(passwordField).click();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new MailBoxPage(driver);
    }

    public boolean isLoginButtonDisplayed() {
        return driver.findElement(loginButton).isDisplayed();
    }
}
