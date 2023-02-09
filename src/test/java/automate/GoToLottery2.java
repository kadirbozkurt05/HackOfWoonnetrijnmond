package automate;

import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import utils.Driver;

public class GoToLottery2 {
    MainPage mainPage = new MainPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),60);
    @Then("house2 click")
    public void house2_click(){
        Driver.getDriver().get("https://www.woonnetrijnmond.nl/inloggeninschrijven/");
        mainPage.usernameInput.sendKeys("omrkorklu");
        mainPage.passwordInput.sendKeys("R5m8NxuM");
        mainPage.sendLogin.click();
        mainPage.goToMainPage.click();

        wait.until(ExpectedConditions.visibilityOf(mainPage.house1));

        mainPage.house2.click();

        mainPage.selectHouse.click();

        mainPage.finalButton.click();
        Driver.close();
    }
}
