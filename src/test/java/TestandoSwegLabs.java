import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestandoSwegLabs {

    @Test
    public void testeDeLoginValido(){

        // Escolhe o webdriver e coloca o caminho do executavel
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver3\\chromedriver.exe");

        // Chama o webdriver e seleciona o "robozinho/driver"
        WebDriver robozinho = new ChromeDriver();

        // Acesse o site
        robozinho.get("https://www.saucedemo.com/");
        assertEquals("Swag Labs", robozinho.getTitle());

        // Procure o elemento pelo ID "user-name" e quando achar ele, escreva "standard_user"
        robozinho.findElement(By.id("user-name")).sendKeys("standard_user");

        robozinho.findElement(By.id("password")).sendKeys("secret_sauce");

        // Procure o elemento pelo ID "login-button" e quando achar ele, clique
        robozinho.findElement(By.id("login-button")).click();

        // V
        assertEquals("Sauce Labs Backpack",
                robozinho.findElement(By.id("item_4_title_link")).getText());

    }

    @Test
    public void testeDeLoginValido1(){

        // Escolhe o webdriver e coloca o caminho do executavel
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver3\\chromedriver.exe");

        // Chama o webdriver e seleciona o "robozinho/driver"
        WebDriver robozinho = new ChromeDriver();

        // Acesse o site
        robozinho.get("https://www.saucedemo.com/");
        assertEquals("Swag Labs", robozinho.getTitle());

        // Procure o elemento pelo ID "user-name" e quando achar ele, escreva "standard_user"
        robozinho.findElement(By.id("user-name")).sendKeys("problem_user");

        robozinho.findElement(By.id("password")).sendKeys("secret_sauce");

        // Procure o elemento pelo ID "login-button" e quando achar ele, clique
        robozinho.findElement(By.id("login-button")).click();

        // V
        assertEquals("Sauce Labs Backpack", robozinho.findElement(By.id("item_4_title_link")).getText());

    }
}
