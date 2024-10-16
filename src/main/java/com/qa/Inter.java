package com.qa;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inter {
    
    public static void main(String args[]){
        WebDriver d ;

        System.setProperty("wedriver.chrome.driver", "C:\\Users\\akhilmadanan\\Downloads\\chromedriver-mac-x64\\chromedriver.exe");
        d = new ChromeDriver();
        d.get("https://collabedit.com/");
        List<WebElement> ls = d.findElements(By.xpath("//div/table[@id='langs-table']/tbody/tr/td[@class='lang-name']"));
        System.out.println("Number of elements:" +ls.size());

        for (int i =0; i<ls.size();i++){
            String str  = ls.get(i).getText();
            if(str.equals("java")){
                String s="java";
                String users = d.findElement(By.xpath("//div/table[@id='langs-table']/tbody/tr/td[contains(text(),'" + s + "')]/following-sibling::td[3]")).getText();
                System.out.println("Java users : " + users);
            }
           // System.out.println("Text is "+str);

        }

        d.close();
    }
}
