package com.nopcommerce.demo.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputersPage extends  HomePage{
    public void clickOnComputersAndSelectDesktopAndSortByInZtoA() throws InterruptedException {
        selectMenu( "Computers" );
        Thread.sleep( 2000 );
       // waitUntilVisibilityOfElementLocated( By.xpath( "//div[@class='item-grid']/div/div//a[text()=' Desktops ']" ) ,40);
        clickOnElement( By.xpath( "//div[@class='item-grid']/div/div//a[text()=' Desktops ']" ) );  //click on desktop
        selectByVisibleTextFromDropDown( By.id( "products-orderby" ),"Name: Z to A" );      //select 'Z to A'
        List<WebElement> deskTopList = driver.findElements(By.xpath("//div[@class='item-grid']/div/div/div[2]/child::h2"));  //verifying sort by products are in 'z to a'
        List<String> productName = new ArrayList<>();
        for (WebElement deskTop : deskTopList){
            productName.add(deskTop.getText());
        }

        List<String> tempList = new ArrayList<>();
        tempList.addAll(productName);

        Collections.sort(tempList,Collections.reverseOrder());
        Collections.sort( productName,Collections.reverseOrder());
        System.out.println(productName);
        System.out.println(tempList);
        Assert.assertEquals( productName,tempList );





    }

}
