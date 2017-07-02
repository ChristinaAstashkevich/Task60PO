package page;

import core.WebBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailBoxPage {
    protected WebDriver driver = WebBrowser.getInstance();

    private static By composeButton = By.cssSelector("[data-name='compose']");
    private static By logoutLink = By.cssSelector("#PH_logoutLink");

    public MailBoxPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getComposeButton(){
        return driver.findElement(composeButton);
    }

    private WebElement getLogoutLink(){
        return driver.findElement(logoutLink);
    }

    public LoginPage logout(){
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(logoutLink));
        getLogoutLink().click();
        return new LoginPage(driver);
    }

    public boolean isComposeButtonDisplayed(){
        return getComposeButton().isDisplayed();
    }
}


