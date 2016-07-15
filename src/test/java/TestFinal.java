/**
 * Created by evgenyshpak on 7/14/16.
 */


import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TestFinal {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        String search = "Restaurants";
        // String SplitBy = "of ";
        String search2 = "Restaurants pizza";
        WebDriver driver = new FirefoxDriver();

        String url = "http://www.yelp.com/";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.id("find_desc")).sendKeys(search);
        driver.findElement(By.id("header-search-submit")).click();

        driver.findElement(By.id("find_desc")).clear();
        driver.findElement(By.id("find_desc")).sendKeys(search2);
        driver.findElement(By.id("header-search-submit")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String numbr = driver.findElement(By.xpath("//span[@class='pagination-results-window']")).getText();

        System.out.println("Search Restaurants pizza without filters: " +numbr); //search "Restaurants pizza" without filters

        driver.findElement(By.xpath("//span[@class='filter-label all-filters-toggle show-tooltip']")).click();
        //Parameterize any 2 of the filtering parameters
        driver.findElement(By.xpath("(//input[@name='price'])[6]")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        driver.findElement(By.xpath("//input[@value='italian']")).click(); //Category->Italian

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        numbr = driver.findElement(By.xpath("//span[@class='pagination-results-window']")).getText();

        System.out.println("Search with filters Category->Italian and $$: " + numbr); //search with filters Category->Italian and $$

        String result_1 = driver.findElement(By.xpath("//div[@id='super-container']/div/div[2]/div/div/div[4]/ul[2]/li/div/div/div/div/div[2]/h3/span/a/span")).getText();
        String rating1 = driver.findElement(By.xpath("//div/i")).getAttribute("title");
        System.out.println(result_1 + " " + rating1);

        String result_2 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[4]/div/div[1]/div[1]/div/div[2]/h3/span/a/span")).getText();
        String rating2 = driver.findElement(By.xpath("//div/i")).getAttribute("title");
        System.out.println(result_2 + " " + rating2);

        String result_3 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[5]/div/div[1]/div[1]/div/div[2]/h3/span/a/span")).getText();
        String rating3 = driver.findElement(By.xpath("//div/i")).getAttribute("title");
        System.out.println(result_3 + " " + rating3);

        String result_4 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[6]/div/div[1]/div[1]/div/div[2]/h3/span/a/span")).getText();
        String rating4 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[6]/div/div[1]/div[1]/div/div[2]/div[1]/div/i")).getAttribute("title");
        System.out.println(result_4 + " " + rating4);

        String result_5 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[7]/div/div[1]/div[1]/div/div[2]/h3/span/a/span")).getText();
        String rating5 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[7]/div/div[1]/div[1]/div/div[2]/div[1]/div/i")).getAttribute("title");
        System.out.println(result_5 + " " + rating5);

        String result_6 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[8]/div/div[1]/div[1]/div/div[2]/h3/span/a/span")).getText();
        String rating6 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[8]/div/div[1]/div[1]/div/div[2]/div[1]/div/i")).getAttribute("title");
        System.out.println(result_6 + " " + rating6);

        String result_7 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[9]/div/div[1]/div[1]/div/div[2]/h3/span/a/span")).getText();
        String rating7 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[9]/div/div[1]/div[1]/div/div[2]/div[1]/div/i")).getAttribute("title");
        System.out.println(result_7 + " " + rating7);

        String result_8 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[10]/div/div[1]/div[1]/div/div[2]/h3/span/a/span")).getText();
        String rating8 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[10]/div/div[1]/div[1]/div/div[2]/div[1]/div/i")).getAttribute("title");
        System.out.println(result_8 + " " + rating8);

        String result_9 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[11]/div/div[1]/div[1]/div/div[2]/h3/span/a/span")).getText();
        String rating9 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[11]/div/div[1]/div[1]/div/div[2]/div[1]/div/i")).getAttribute("title");
        System.out.println(result_9 + " " + rating9);

        String result_10 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[12]/div/div[1]/div[1]/div/div[2]/h3/span/a/span")).getText();
        String rating10 = driver.findElement(By.xpath(".//*[@id='super-container']/div/div[2]/div[1]/div/div[4]/ul[2]/li[12]/div/div[1]/div[1]/div/div[2]/div[1]/div/i")).getAttribute("title");
        System.out.println(result_10 + " " + rating10);

        driver.findElement(By.xpath("//div[@id='super-container']/div/div[2]/div/div/div[4]/ul[2]/li/div/div/div/div/div[2]/h3/span/a/span")).click();

        String address = driver.findElement(By.xpath(".//*[@id='wrap']/div[3]/div/div[1]/div/div[3]/div[1]/div/div[2]/ul/li[1]/div/strong/address")).getText();


        String phone_number = driver.findElement(By.xpath(".//*[@id='wrap']/div[3]/div/div[1]/div/div[3]/div[1]/div/div[2]/ul/li[3]/span[3]")).getText();


        String website = driver.findElement(By.xpath(".//*[@id='wrap']/div[3]/div/div[1]/div/div[3]/div[1]/div/div[2]/ul/li[5]/span[2]/a")).getText();



            try {

                File file = new File("/users/evgenyshpak/desktop/result.txt");

                // if file doesnt exists, then create it
                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("The address is:" + " "  + address + " ");
                bw.write("Phone number is:"+ " "  + phone_number + " ");
                bw.write("The website is:" + " "  + website + " ");
                bw.close();

                System.out.println("Done");

            } catch (IOException e) {
                e.printStackTrace();
            }


        //  driver.quit();


    }
}