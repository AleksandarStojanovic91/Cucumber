package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Story;
import org.testng.Assert;

public class MyStepdefs {
    @Story("ST-001")
    @Given("I navigate to login web page")
    public void iNavigateToLoginWebPage() {
        System.out.println("I opened web page");
        //driver.get("https://www......");
    }

    @When("I enter username")
    public void iEnterUsername() {
        //LoginPage loginpage = new LoginPage(driver);
        System.out.println("I entered my username");
        //loginPage.enterUsername("Username");
    }

    @And("I enter password")
    public void iEnterPassword() {
        System.out.println("I entered my password");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        System.out.println("I clicked login button");
    }

    @Then("I should see logged in page")
    public void iShouldSeeLoggedInPage() {
        System.out.println("Yay im logged in");
    }

    @Given("I login to web page with {string} and {string}")
    public void iLoginToWebPageWith(String username, String password) {
        System.out.println("I logged in with "+username+" and password "+password);
    }

    @Then("I should see page")
    public void iShouldSeePage() {
        Assert.assertTrue(false);
        System.out.println("I see correct page");
    }
}
