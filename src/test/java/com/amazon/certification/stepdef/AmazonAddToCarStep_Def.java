package com.amazon.certification.stepdef;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;


import org.openqa.selenium.WebDriver;

import com.amazon.certification.exceptions.NoMatchElement;
import com.amazon.certification.exceptions.NoWebConnection;
import com.amazon.certification.model.AmazonItemModel;
import com.amazon.certification.questions.Button;
import com.amazon.certification.questions.ValueOf;

import com.amazon.certification.tasks.Search;
import com.amazon.certification.ui.AmazonNavBarPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
//import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
//import static net.serenitybdd.screenplay.questions.WebElementQuestion.stateOf;

import static org.hamcrest.core.StringContains.containsString;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;

public class AmazonAddToCarStep_Def {
	
	@Managed(driver="chrome",clearCookies=ClearCookiesPolicy.BeforeEachTest)
	private WebDriver hisDriver;
	private AmazonItemModel model;
	
	public void dataSetup(AmazonItemModel model) {
		this.model = model;
		System.out.println(this.model.getBusqueda());
		System.out.println(this.model.getIndice());
	}
	
	private Actor alejo = Actor.named("Alejo");
	private AmazonNavBarPage amazonNavBarPage;
	
	@Before
	public void setup() {
		alejo.can(BrowseTheWeb.with(hisDriver));
	}

	
	@Given("^Alejo is in Amazon Home Page$")
	public void alejoIsInAmazonHomePage() {
		//Background
		alejo.wasAbleTo(com.amazon.certification.tasks.OpenTheBrowser.on(amazonNavBarPage));
		alejo.should(
				seeThat(Button.isDisplayed(AmazonNavBarPage.LOGO)).
				orComplainWith(NoWebConnection.class,"No Aplication Connection"));
	}

	@When("^Alejo search an item and select any (\\d+)$")
	public void alejoSearchAnItemAndSelectAny(int index, List<AmazonItemModel> data) {dataSetup(data.get(index));
	   alejo.attemptsTo(Search.item(data.get(index)));
	}

	@When("^adds it to the car$")
	public void addsItToTheCar() {
		//alejo.should(seeThat(stateOf(AmazonNavBarPage.ADD_TO_CAR), isEnabled()));
		try {
		hisDriver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		}
		catch(NoMatchElement e) {
			System.out.println(e);
		}
	}

	@Then("^Alejo can see selected item in his car$")
	public void alejoCanSeeSelectedItemInHisCar() throws NoMatchElement{
		alejo.wasAbleTo(com.amazon.certification.tasks.OpenTheBrowser.on(amazonNavBarPage));
		alejo.attemptsTo(Click.on(AmazonNavBarPage.SHOP_CAR));
		//alejo.should(seeThat(the(AmazonNavBarPage.INFO), isEnabled()));
		System.out.println("Info del target es : "+Text.of(AmazonNavBarPage.INFO).viewedBy(alejo).asString());
		alejo.should(seeThat(
				ValueOf.theItemInCarIs(), 
				containsString(model.getContenido())).		
				orComplainWith(NoMatchElement.class,"Elemento No Agregado"));
	}
	
}
