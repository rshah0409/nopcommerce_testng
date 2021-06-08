package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DeskTopPage extends Utility {
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        Thread.sleep( 1000 );
        // waitUntilVisibilityOfElementLocated( By.xpath( "//div[@class='item-grid']/div/div//a[text()=' Desktops ']" ) ,40);
        clickOnElement( By.xpath( "//div[@class='item-box']/div/child::h2/a[text()=' Desktops ']" ) );  //click on desktop
        selectByVisibleTextFromDropDown( By.xpath( "//select[@id='products-orderby']" ), "Name: A to Z" );      //select 'A to Z'
        //click on 'build your own computer' add to cart
        Thread.sleep( 1000 );
        clickOnElement( By.xpath( "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]" ) );

    }
}
