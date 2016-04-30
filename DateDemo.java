package s;



import java.io.IOException;
import java.util.Calendar;

public class DateDemo {


	public static void dataB() {

		Calendar cl = Calendar.getInstance();

		System.out.println(cl.get(Calendar.YEAR));
		System.out.println(cl.get(Calendar.MONTH) + 1);
		System.out.println(cl.get(Calendar.DATE));

		System.out.println("Date: " + cl.getTime());
		


		
		
		
		

	}

}
