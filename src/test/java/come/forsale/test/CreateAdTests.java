package come.forsale.test;
import com.forsale.forsale.createAdPage;
import com.forsale.forsale.driverActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAdTests {
    driverActions action = new driverActions();
    createAdPage create = new createAdPage();
    @BeforeMethod
    public void openApplication() throws Exception {
        action.openApp();

    }

    @Test

    public void testPostAd (){
        create.createNewAd();
    }

    @AfterMethod
    public void closeDriver (){
        action.quitApp();
    }
}