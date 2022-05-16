package demoqa.com;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import framework.SeleniumTestBase;

public class DemoQaTests extends SeleniumTestBase {
  @Test
  public void canSelectRadioButton() {
	  
	  RadioButtonPage page = new RadioButtonPage(this.getDriver());
	  page.navigate();
	  page.selectYesRadio();
	  page.selectImpressiveRadio();
	  page.selecNoRadio();
	  page.getYesButton();
	  page.getImpressiveButton();
	  page.getNoButton();
	  
	  assertEquals(page.getYesButton(), "Yes");
	  assertEquals(page.getImpressiveButton(), "Impressive");
	  assertEquals(page.getNoButton(),"No");
  }
  @Test
  public void canClickLinkTest() {
	  
	  LinksPage page = new LinksPage(this.getDriver());
	  page.navigate();
	  page.clickLink();
	  page.checkTheResult();
	  
	  assertEquals(page.checkTheResult(), "Link has responded with staus 201 and status text Created"); 
}
  @Test
  public void canSetValuesTest() {
	  SliderPage page = new SliderPage(this.getDriver());
	  page.navigate();
	  page.setTheValueto80(80);
	  page.setTheValueto17(17);
	  page.setTheValueto0(0);
	  page.setTheValueto100(100);
	  
	  assertEquals(page.setTheValueto80(80), 80);
	  assertEquals(page.setTheValueto17(17), 17);
	  assertEquals(page.setTheValueto0(0), 0);
	  assertEquals(page.setTheValueto100(100), 100);
  }
  @Test
  public void canSelectMenue() {
	  SelectMenuPage page = new SelectMenuPage(this.getDriver());
	  page.navigate();
	  page.setTheValue("value");
	  
	  assertEquals(page.setTheValue("2"), "2");
	  
  }
  
}
