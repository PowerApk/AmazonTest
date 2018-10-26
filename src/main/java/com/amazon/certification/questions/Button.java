package com.amazon.certification.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Button implements Question<Boolean>{
	
	private Target buttonRecursive;
	
	public Button (Target button) {
		this.buttonRecursive = button;
	}

	
	@Override
    public Boolean answeredBy(Actor actor) {
        return the(buttonRecursive)
        		.answeredBy(actor).isCurrentlyVisible();
    }

	 public static Button isDisplayed(Target button) {
	    	return new Button(button);
	    }

}
