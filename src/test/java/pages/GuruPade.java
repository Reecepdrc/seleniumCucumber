package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruPade {
    public GuruPade(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath ="//thead//tr//th" )
    public List<WebElement> basliklar;
}
