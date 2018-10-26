package com.amazon.certification.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.es/")

public class AmazonNavBarPage extends PageObject{
	
	//Aca mapeo los elementos propios de la pagina
	
		public static final Target LOGO = 
				Target.the("Amazon Logo").
				locatedBy("//*[@id=\"nav-logo\"]");
		
		public static final Target SEARCH_BOX = 
				Target.the("Amazon searchBox").
				located(By.id("twotabsearchtextbox"));
		
		public static final Target SEARCH_BUTTON = 
				Target.the("Amazon Search button").
				locatedBy("//input[@value=\"Ir\"]");
		
		public static final Target ADD_TO_CAR = 
				Target.the("Amazon Car Button").
				locatedBy("//*[@id=\"add-to-cart-button\"]");
		
		public static final Target SHOP_CAR =
				Target.the("Amazon Items on Car Button").
				locatedBy("//*[@id=\"nav-cart\"]");
		
		public static final Target INFO =
				Target.the("Amazon Items on Car Info").
				locatedBy("//div[@data-item-count=1]//span[@class=\"a-size-medium sc-product-title a-text-bold\"]");
		
		public static final Target TARGET_INDEXX = 
				Target.the("Amazon Table").
				locatedBy("//li[@id=\"result_{0}\"]//*[@class=\"a-size-medium s-inline  s-access-title  a-text-normal\"]");
		

}
