package dao;
import stub.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() throws Exception_Exception {
		  String result;
		//DemoService server = new DemoService();

	//	DemoDelegate dd = server.getDemoPort();

		//String result = dd.sayHello("Lions");
		
		SSDLoginService ssdLoginService  =  new SSDLoginService();
		
		SSDLoginDelegate ssdLoginDelegate = ssdLoginService.getSSDLoginPort();
		
		result = ssdLoginDelegate.getEKPUserFullName("lizhinan", "1234");

		System.out.println(result);


	}

}
