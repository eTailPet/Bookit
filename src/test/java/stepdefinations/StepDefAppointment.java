/*
 * package stepdefinations;
 * 
 * import java.io.IOException;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import org.openqa.selenium.support.ui.Select;
 * 
 * import com.pages.Appointment; import com.pages.DeleteShampoo; import
 * com.pages.ResetFilters; import com.pages.Retailerdashboardpage; import
 * com.pages.SelectAttendant; import com.pages.SelectCustomer; import
 * com.pages.SelectDate; import com.pages.SelectVenue;
 * 
 * import cucumberAutomation.Base; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When;
 * 
 * public class StepDefAppointment { public WebDriver driver;
 * Retailerdashboardpage re; Appointment ap; DeleteShampoo Ds; SelectCustomer
 * Sc; SelectAttendant Sa; SelectVenue Sv; ResetFilters rs; SelectDate Sd;
 * 
 * 
 * @Given("Launch the web application") public void launch_the_web_application()
 * throws IOException { Base base = new Base(); driver= base.getDriver();
 * System.out.println("User is in Retailer Portal"); }
 * 
 * @When("Sign in to popup") public void sign_in_to_popup() throws
 * InterruptedException { driver.get(
 * "https://etailadmin:pwd@123@sandyspetdepot-etailplus.dev.etailpet.com/retailer/dash/"
 * ); driver.manage().window().maximize(); }
 * 
 * @Then("Switch to Bookit") public void switch_to_bookit() throws
 * InterruptedException { Thread.sleep(5000); WebElement Source =
 * driver.findElement(By.xpath("//select[@id='dashboard-toggle']")); Select
 * dd1=new Select(Source); dd1.selectByValue("bookit_only"); Thread.sleep(8000);
 * re.user_click_booking().click(); Thread.sleep(8000);
 * ap.user_click_appointment().click(); Thread.sleep(8000); }
 * 
 * @Then("Verify whether user is able to delete the shampoo") public void
 * verify_whether_user_is_able_to_delete_the_shampoo() throws
 * InterruptedException { Thread.sleep(8000); Ds.user_click_even_id().click();
 * Thread.sleep(8000); Ds.user_click_cancel_service().click();
 * Thread.sleep(8000); Ds.user_click_yes().click(); Thread.sleep(8000);
 * Ds.user_click_no().click(); Thread.sleep(8000); driver.navigate().back(); }
 * 
 * @Then("Verify whether user is able to search the appointment with using customer name"
 * ) public void
 * verify_whether_user_is_able_to_search_the_appointment_with_using_customer_name
 * () throws InterruptedException { Thread.sleep(8000);
 * Sc.user_select_customer().sendKeys("Manisha Sharma"); Thread.sleep(8000);
 * Sc.user_click_on_submit().click(); Thread.sleep(8000);
 * driver.navigate().refresh(); }
 * 
 * @Then("Verify whether user is able to search the appointment with using Attendant name"
 * ) public void
 * verify_whether_user_is_able_to_search_the_appointment_with_using_attendant_name
 * () throws InterruptedException { Thread.sleep(8000);
 * Sa.user_select_attendant().sendKeys("attendant for mouse");
 * Thread.sleep(8000); Sa.user_click_on_submit().click(); Thread.sleep(8000);
 * driver.navigate().refresh(); }
 * 
 * @Then("Verify whether user is able to search the appointment with using Venue name"
 * ) public void
 * verify_whether_user_is_able_to_search_the_appointment_with_using_venue_name()
 * throws InterruptedException { Thread.sleep(8000);
 * Sv.user_select_venue().sendKeys("rabbit venue"); Thread.sleep(8000);
 * Sa.user_click_on_submit().click(); Thread.sleep(8000);
 * driver.navigate().refresh(); }
 * 
 * @Then("Verify whether user is able to search the appointment with using calendar start date"
 * ) public void
 * verify_whether_user_is_able_to_search_the_appointment_with_using_calendar_start_date
 * () throws InterruptedException { String month= "June 2022"; String day= "20";
 * String day1= "21"; Sd.user_select_startDate().click(); Thread.sleep(8000);
 * while(true) { String text= driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]"
 * )).getText(); if(text.equals(month)) { break; } else { driver.findElement(By.
 * xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']"
 * )).click(); } } driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div[2]/div/div[3]/div[2]/div[1]/div/div/input")).click();
 * Thread.sleep(8000); Sd.user_select_EndDate(); while(true) { String text=
 * driver.findElement(By.xpath("//input[@placeholder='End Date']")).getText();
 * if(text.equals(month)) { break; } else { driver.findElement(By.xpath(
 * "//div[@class=\"react-datepicker__current-month\"]")).click(); } }
 * driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div[2]/div/div[3]/div[2]/div[2]/div/div/input")).click();
 * 
 * }
 * 
 * @Then("Verify whether user is able to reset the data by clicking on reset button"
 * ) public void
 * verify_whether_user_is_able_to_reset_the_data_by_clicking_on_reset_button()
 * throws InterruptedException { Thread.sleep(8000);
 * rs.user_select_reset().click(); Thread.sleep(8000);
 * driver.navigate().refresh();
 * 
 * }
 * 
 * 
 * }
 */