package s;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class NewCusRegProcess {
	public boolean searchCus(int nCusId, List<NewCustReg> cusad,int nPhno) {

		for (NewCustReg cus : cusad) {
			if (cus.getnCusId() == nCusId)
				return true;
		}
		return false;
	}
	
	public boolean addUser(NewCustReg  cus, List<NewCustReg> cusad,int nPhno) {

		ListIterator<NewCustReg> it = cusad.listIterator();

		if (cusad.size() == 0) {
			cusad.add(cus);
			return true;
		}

		System.out.println(cusad);
		while (it.hasNext()) {

			if (searchCus(cus.getnCusId(),cusad,cus.getnPhno() ) == false) {

				cusad.add(cus);
				return true;
			}
		}
		return false;
	}
	public void list(List<NewCustReg> cusad) {

		if (cusad.size() == 0) {
			System.out.println("No Records Added so far...");
			return;
		}
		for (NewCustReg cus : cusad) {
			System.out.println("cus Id: " + cus.getnCusId());
			System.out.println(" cus Name: " + cus.getnName());
			System.out.println("cus phno  "+cus.getnPhno());
			System.out.println("this person is new customer so we allocte cart depend upon customer opinion");
			/*System.out.println("total price"+prod.getpTotalP());*/
			System.out.println("-------------------------------");
		}
	}

	
	
	
	
	

}
