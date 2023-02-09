package automate;

import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class GoToLottery {
    private static MainPage mainPage = new MainPage();
    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(),60);
    @Then("house1 click")
       public void house1_click(){
            Driver.getDriver().get("https://www.woonnetrijnmond.nl/inloggeninschrijven/");
            mainPage.usernameInput.sendKeys("omrkorklu");
            mainPage.passwordInput.sendKeys("R5m8NxuM");
            mainPage.sendLogin.click();
            mainPage.goToMainPage.click();

            wait.until(ExpectedConditions.visibilityOf(mainPage.house1));

            mainPage.house1.click();

            mainPage.selectHouse.click();

            mainPage.finalButton.click();
            Driver.close();
        }





    }



