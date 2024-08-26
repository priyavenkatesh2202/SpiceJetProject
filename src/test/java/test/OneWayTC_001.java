package test;


import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import page.FlightBooking;
import page.HomePage;
import page.PassengerPage;
import page.PaymentPage;

public class OneWayTC_001 extends ProjectSpecificationMethods{
@Test
	public  void OneWay() throws Exception {
		// TODO Auto-generated method stub

	
	FlightBooking ob =new FlightBooking(driver);
	PassengerPage obj = new PassengerPage(driver);
	PaymentPage obj1= new PaymentPage(driver);
	
	
	ob.ClicFrom();
	ob.SelectFrom();
	ob.SelectTo();
    ob.ClicDepDate();
	ob.Clicpassenger();
	ob.IncPassanger();
//	ob.ClicCurrency();
	//ob.clicFamily();
    ob.searchFlight();
    //clickCheqBox();
   // Thread.sleep(1000);
   // ob.clickConti();
   // Thread.sleep(1000);
    ob.conti().conti();
    
    obj.firstName("Yogesh").LastName("Waran").phNum("9876543210").email("abc@gmail.com")
    .clickcheckBox() //.studentID("98765")
    .clickpas2()
    .pass2Name("Venkatesh").pass2LName("Priyan")//.studentID2("876672")
    .CLContinue().addonPageConti().addonPageConti().skipPop().clickContinue();
    
    
  
   
   
  
   
    
    obj1.clickUPI().clickOpt().enterUPIid("rajivenk").clicPay().verify();


	
	
	
	
	

	}

}
