import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class Interview extends TestBase{

    Interview inter;
    public Interview() {
 super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        inter = new Interview();
    }

    @Test
    public  void Test1(){
        

        @FindBy(xpath="//div/table[@id='langs-table']/tbody/tr/td[@class='lang-name']")
        WebElement lang;


        String str = lang.getText();
        System.out.println(str);
    }
}
