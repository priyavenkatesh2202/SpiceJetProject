package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import page.PassengerPage;
import page.PaymentPage;
import page.RoundBooking;

public class RoundWayTC_001 extends ProjectSpecificationMethods
{
@Test
	public  void OneWay() throws Exception {
		
	RoundBooking ob = new RoundBooking(driver);
	PassengerPage obj = new PassengerPage(driver);
	PaymentPage obj1= new PaymentPage(driver);
	
	
	ob.ClickRoundWay().ClicFrom().SelectFrom().SelectTo().ClicDepDate().ClicDate()
	.ClicReturnDate().Clicpassenger().IncPassanger().ClicCurrency().clicStudent().searchFlight()
	.clickCheqBox().clickConti().conti();

	
	obj.firstName("Yogesh").LastName("Waran").phNum("9876543210").email("abc@gmail.com")
	   .clickcheckBox() .studentID("98765").clickpas2()
	   .pass2Name("Venkatesh").pass2LName("Priyan").studentID2("876672").CLContinue().addonPageConti()
	   .addonPageConti().skipPop().clickContinue();
	  
	obj1.clickUPI().clickOpt().enterUPIid("rajivenk").clicPay().verify2();
	   
	}
}

