package s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CustomerDe {
	 static InputStreamReader isr=new InputStreamReader(System.in);
     static BufferedReader br=new BufferedReader(isr);
     public static void cart() throws NumberFormatException, IOException{
System.out.println("enter the employe login process");
	System.out.println("customer list");
	System.out.println("a.sunil");
	System.out.println("b.ramu");
	System.out.println("c.ashok");
	/* InputStreamReader isr=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);*/
     char ch=(char)br.read( );
     
		System.out.println("you entered : "+ch);
		 switch(ch){
		  case 'a' :
			 System.out.println("enter the mobile number");
	        	 /*InputStreamReader isr1=new InputStreamReader(System.in);
	             BufferedReader br1=new BufferedReader(isr1);*/
	            Double phno = Double.parseDouble(br.readLine());
	        		 if(phno==81434328){
	        	   System.out.println("employe log in sucessesfull ");
	        	  System.out.println("customer name is :sunil");
	  			System.out.println("customer ph no 9729451130496");

	  			System.out.println("sunil enter the shoping  enter ");
	  			DateDemo.dataB();
	  			System.out.println("to allocate the cart1");
	  			System.out.println("sunil is heavy customer");
	  			/*Use.cartA(); */ 
	          }else{
	        	  System.out.println("login is failed");
	        	  System.out.println("createan account");
	        	  Use2.addDet();
	          }
		 case 'b' :
	        	System.out.println("enter the mobile number");
	        	 /*InputStreamReader isr2=new InputStreamReader(System.in);
	             BufferedReader br2=new BufferedReader(isr2);*/
	            Double phno1 = Double.parseDouble(br.readLine());
	        		
	          if(phno1==81434328){  
	        	  System.out.println("employe log in sucessesfull ");

	        		System.out.println("customer name is :ashok");
	        		System.out.println("customer ph no 972945");
	        		System.out.println("shekar enter the shoping center");
	        		DateDemo.dataB();
	        	System.out.println("to allocate the cart2");
	        	System.out.println("ashok is heavy customer");
	        	Use.cartB();
	          }else{
	        	  System.out.println("login is failed");
	        	  System.out.println("createan account");
	        	  Use2.addDet();
	          }
		 case 'c' :
			 System.out.println("enter the mobile number");
	        	 /*InputStreamReader isr3=new InputStreamReader(System.in);
	             BufferedReader br3=new BufferedReader(isr3);*/
	            Double ph2 = Double.parseDouble(br.readLine());
	        		
	          if(ph2==94404338){
	        	  
	        	  System.out.println("employe log in sucessesfull ");
	        		System.out.println("customer name is :ramu");
	        		System.out.println("customer ph no 972945123");
	        		System.out.println("ramu enter the shoping center");
	        		DateDemo.dataB();
	        	System.out.println("to allocate the cart2");
	        	System.out.println("ashok is light customer");
	        	Use.cartB();
	          }else{
	        	  System.out.println("login is failed");
	        	  System.out.println("createan account");
	        	  Use2.addDet();
	          }
		 break;
		 default:
			 System.out.println("inalid");
		  } 
		 
	}
}

	
	