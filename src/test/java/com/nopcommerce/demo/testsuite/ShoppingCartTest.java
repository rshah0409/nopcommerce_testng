package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuilYourOwnpage;
import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.DeskTopPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ShoppingCartTest extends TestBase {

    DeskTopPage deskTopPage = new DeskTopPage();
    BuilYourOwnpage buildyourownpage = new BuilYourOwnpage();
    ComputersPage computersPage = new ComputersPage();
    @Test
    public void clickOnComputersAndDesktopAndSortByAtoZ() throws InterruptedException {
        computersPage.selectMenu("Computers" );
        deskTopPage.verifyProductAddedToShoppingCartSuccessFully();
        buildyourownpage.verifyProductAddedToCart();

    }
}
