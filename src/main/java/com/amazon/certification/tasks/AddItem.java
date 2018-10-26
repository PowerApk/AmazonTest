package com.amazon.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.amazon.certification.model.AmazonItemModel;
import com.amazon.certification.ui.AmazonNavBarPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddItem implements Task{
	
	public AddItem() {
		
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AmazonNavBarPage.ADD_TO_CAR));
		
	}
	public static Search toCar() {
		return instrumented(Search.class);
		
	}

}
