import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    public final By Username = By.id("user-name");
    public final By password = By.id("password");
    public final By loginButton = By.id("login-button");


    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }


    public void Enter_Username(String user)
    {
        driver.findElement(Username).sendKeys(user);
    }
    public void Enter_Password(String pass)
    {
        driver.findElement(password).sendKeys(pass);
    }


    public void Click_On_Login_Button()
    {
        driver.findElement(loginButton).click();
    }

}
