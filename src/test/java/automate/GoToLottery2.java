package automate;

import io.cucumber.java.en.Then;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class GoToLottery2 {
    MainPage mainPage = new MainPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),60);
    @Then("house2 click")
    public void house2_click() throws InterruptedException {
        Driver.getDriver().get("https://www.woonnetrijnmond.nl/inloggeninschrijven/");
        mainPage.usernameInput.sendKeys("omrkorklu");
        mainPage.passwordInput.sendKeys("R5m8NxuM");
        mainPage.sendLogin.click();
        mainPage.goToMainPage.click();

        for (int i = 0; i < 900; i++) {
            Thread.sleep(1000);
            try{
                Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
                mainPage.house2.click();
                mainPage.selectHouse.click();
                mainPage.finalButton.click();
                Driver.close();
            }catch (NoSuchElementException e){
                Driver.getDriver().navigate().refresh();
            }

        }
    }
}
