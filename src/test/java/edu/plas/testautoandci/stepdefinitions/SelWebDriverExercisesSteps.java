package edu.plas.testautoandci.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import edu.plas.testautoandci.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jeanclaude.pace on 11/11/2015.
 */
public class SelWebDriverExercisesSteps {
    @Then("^the Times Talk section image has a height of (\\d+) pixels and a width of (\\d+) pixels$")
    public void theTimesTalkSectionImageHasAHeightOfPixelsAndAWidthOfPixels(int height, int width) throws Throwable {
        WebElement timesTalkImage = Driver.getWebDriver().findElement(By.id("widget_timestalk")).findElement(By.className("cover")).findElement(By.tagName("img"));
        System.out.println("Image text is " + timesTalkImage.getAttribute("alt"));
        assertEquals("Image height is not as expected",height,timesTalkImage.getSize().getHeight());
        assertEquals("Image width is not as expected",width,timesTalkImage.getSize().getWidth());
    }

    @Then("^there are (\\d+) main menu items$")
    public void thereAreMainMenuItems(int numberOfMenuItems) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the Watch/Listen menu contains (\\d+) items$")
    public void theWatchListenMenuContainsItems(int numberOfMenuItems) throws Throwable {
        List<WebElement> watchListenItems = Driver.getWebDriver().findElement(By.className("column--secondary")).findElement(By.id("comp-candy-asset-munger")).
                findElements(By.className("faux-block-link__overlay-link"));
        assertEquals("Counting number of elements in Watch Lsten menu",numberOfMenuItems,watchListenItems.size());
    }

    @Then("^all the Watch/Listen menu items have a '(\\w+)'$")
    public void allTheWatchListenMenuItemsHaveAFeature(String feature) throws Throwable {
        List<WebElement> watchListenItems = Driver.getWebDriver().findElement(By.className("column--secondary")).findElement(By.id("comp-candy-asset-munger"))
                .findElements(By.cssSelector("div.condor-item.faux-block-link"));
        System.out.println("Menu size is " + watchListenItems.size());
        for (WebElement menuItem : watchListenItems ) {
            if (feature.equals("title")) {
                WebElement title = menuItem.findElement(By.className("condor-item__body"));
                assertNotNull(title);
            } else if (feature.equals("image")) {
                WebElement image = menuItem.findElement(By.className("condor-item__image"));
                assertNotNull(image);
            } else {
                System.out.println("Feature " + feature + " not supported by test");
            }

        }
    }

}
