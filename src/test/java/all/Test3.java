package all;

import com.BaseTest;
import com.Pages.Google;
import org.testng.annotations.Test;

public class Test3 extends BaseTest {
    Google googlePage = new Google();


    @Test(groups = {"smoke"})
    public void googleSearch() {
        googlePage.searchInGoogle("Bonny");
        googlePage.verifySearchResults("Bonny");


    }

    @Test(groups = {"smoke"})
    public void googleSearchFail() {
        googlePage.searchInGoogle("Bonny");
        googlePage.verifySearchResults("Jhonny");
    }
}

