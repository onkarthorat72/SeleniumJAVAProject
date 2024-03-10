package Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium_05_HeadlessOrUIless {
    public static void main(String[] args){
        EdgeOptions edgeOptions = new EdgeOptions();

        /*
         * 1. headless
         * 2. start max
         * 3. window
         * 4. add exnetions
         * 5. 100 of another options - you can use with it
         *
         * */

        //edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--window-size=800,1020");
        //edgeOptions.addArguments("--incognito");
        EdgeDriver driver = new EdgeDriver(edgeOptions);// Dynamic Dispatch -> Runtime Polymorphism
        driver.get("http://sdet.live");
        System.out.println(driver.getTitle());


        //driver.manage.window.maximize();     OLD WAY TO MAXIMIZE THE WINDOW SIZE

        driver.quit();
        }
}
