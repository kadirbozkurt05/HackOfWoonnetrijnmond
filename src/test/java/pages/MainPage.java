package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Inloggen/inschrijven']")
    public WebElement loginButton;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "(//a[.='Inloggen'])[2]")
    public WebElement sendLogin;

    @FindBy(xpath = "//a[.='Aanbod']")
    public WebElement goToMainPage;

    @FindBy(xpath = "//span[.='DirectKans']/../../..")
    public WebElement house1;
    @FindBy(xpath = "(//span[.='DirectKans']/../../..)[2]")
    public WebElement house2;

    @FindBy(xpath = "//a[@title='Perfect! Deze woning wil ik.']")
    public WebElement selectHouse;

    @FindBy(xpath = "//button[.='Plaats reactie']")
    public WebElement finalButton;
}
