package com.amazon.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.amazon.certification.model.AmazonItemModel;
import com.amazon.certification.ui.AmazonNavBarPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class Search implements Task{
	
private AmazonItemModel amazonItemModel;
	
	public Search (AmazonItemModel amazonItemModel) {
		this.amazonItemModel = amazonItemModel;
	}
	
	@Override
	@Step("{0} Click on Button")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(AmazonNavBarPage.SEARCH_BOX),
				Enter.theValue(amazonItemModel.getBusqueda()).
				into(AmazonNavBarPage.SEARCH_BOX),
				Click.on(AmazonNavBarPage.SEARCH_BUTTON));
		//obteniendo vaslor
		String descProducto = 
			Text.of(AmazonNavBarPage.TARGET_INDEXX.
					of(amazonItemModel.getIndice())).
			viewedBy(actor).asString();	
	//validando en consola
	System.out.println("Info del elemento clickeado"+descProducto);
	amazonItemModel.setContenido(descProducto);//setter de mi clase modelo
	
	actor.attemptsTo(//click normal para abrir el item
			Click.on(AmazonNavBarPage.TARGET_INDEXX.
					of(amazonItemModel.getIndice())));		
	}
	
	public static Search item(AmazonItemModel item) {
		return instrumented(Search.class,item);
		
	}

}
