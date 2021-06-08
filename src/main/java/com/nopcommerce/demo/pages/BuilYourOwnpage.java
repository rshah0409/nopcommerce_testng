package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BuilYourOwnpage extends Utility {
    public void verifyProductAddedToCart() {

        String expectedPagetext = "Build your own computer";  //verify build your own page
        String actualPageText = getTextFromElement( By.xpath( "//div[@class='overview']/div/child::h1" ) );
        Assert.assertEquals( expectedPagetext, actualPageText );
        selectByVisibleTextFromDropDown( By.id( "product_attribute_1" ), "2.2 GHz Intel Pentium Dual-Core E2200" ); //select 2.2 intel from drop down
        selectByVisibleTextFromDropDown( By.id( "product_attribute_2" ), "8GB [+$60.00]" );//select 8 gb from dropdown
        clickOnElement( By.id( "product_attribute_3_7" ) );  //select 400 gb
        clickOnElement( By.id( "product_attribute_4_9" ) ); //select vista premium
        clickOnElement( By.id( "product_attribute_5_12" ) );//select commander radio button
        String expectedtotal = "$1,475.00";          //Verifying Total
        String actualTotal = getTextFromElement( By.xpath( "//span[text()='$1,475.00']" ) );
        Assert.assertEquals( expectedtotal, actualTotal );
        clickOnElement( By.id( "add-to-cart-button-1" ) );  //click on add to cart
        String expectedBarMessage = "The product has been added to your shopping cart";
        String actualBarMessage = getTextFromElement( By.xpath( "//p[text()='The product has been added to your ']" ) );
        Assert.assertEquals( expectedBarMessage, actualBarMessage );


    }
}
