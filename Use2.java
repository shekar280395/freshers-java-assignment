package s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Use2 {

	public static void addDet() throws NumberFormatException, IOException {
		
			
			
		NewCusRegProcess ops=new NewCusRegProcess();

					
					ArrayList<NewCustReg> cusad = new ArrayList<NewCustReg>();

					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

					while (true) {

						System.out.println("new reg process");
						System.out.println("1.ADD user ");
						System.out.println("2.LIST PRODUCT ");
						System.out.println("3.Exit");

						System.out.println("Enter Option from 1 - 3: ");
						Scanner sc = new Scanner(System.in);
						int ch = sc.nextInt();
						switch (ch) {
						case 1:
							System.out.println("Enter user new Id, Name and price: ");

							int nCusId = Integer.parseInt(br.readLine());
							String nName = br.readLine();
							int nPhno=Integer.parseInt(br.readLine());
							NewCustReg prod = new NewCustReg(nCusId,nName,nPhno);
							boolean status = ops.addUser(prod,cusad,nPhno);
							if (status != true) {
								System.out.println("user Already Exists");
							} else {
								System.out.println("user added successfully");
								Use.cartA();
							}

							break;
						case 2:
							ops.list(cusad);
							/*b.totalPric();*/
						case 3:
							System.exit(0);
							break;
default:
	System.out.println("invalid");
	}

}
}
}