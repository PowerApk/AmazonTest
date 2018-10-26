package com.amazon.certification.questions;

import com.amazon.certification.ui.AmazonNavBarPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValueOf implements Question<String>{
	
	private static String value;
	
	public ValueOf () {
		
	}
	
	public ValueOf (String value) {
		this.value = value;
	}

	@Override
	public String answeredBy(Actor actor) {		
		return Text.of(AmazonNavBarPage.INFO).viewedBy(actor).asString();
	}
	
	public static ValueOf theItemInCarIs() {
		return new ValueOf ();
	}
	
	

}
