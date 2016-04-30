package s;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Throwable {
		EmpReg e=new EmpReg();
		
		Thread th=new  Thread(e);
		Thread t1=new  Thread(e);
		
		t1.setName("1");
		th.setName("2");
		th.start();
		t1.start();
		
		
	}

}
