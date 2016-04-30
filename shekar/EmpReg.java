package s;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpReg extends Thread{
	public void run(){
		try {
			emp2();
			emp1();
			emp3();
			
				
		} catch( Throwable e) {
			// TODO: handle exception
		
		
		}
		
		
	}
	public static void emp1() throws Throwable, IOException{
			System.out.println("enter the employe login process");
	        	System.out.println("employe name is shekar");
	        	System.out.println("enter the id");
	        	InputStreamReader isr=new InputStreamReader(System.in);
	            BufferedReader br=new BufferedReader(isr);
	        	 double id = Double.parseDouble(br.readLine());
	        		
	          if(id==1234){
	        	  System.out.println("employe log in sucessesfull ");
	        	  CustomerDe.cart();
	        	
	          }else{
	        	  System.out.println("login is failed");
	        	 System.out.println("concern the administration");
	        	 EmpReg.emp2();
	        	 System.exit(0);
	        	 
	          }
	    
		}
	         
		public static void emp2() throws NumberFormatException, IOException{
	        	System.out.println("employe name is rakesh");
	        	System.out.println("enter empid");
	        	InputStreamReader isr1=new InputStreamReader(System.in);
	            BufferedReader br1=new BufferedReader(isr1);
	        	 
	             double id1= Double.parseDouble(br1.readLine());
	        	if(id1==123){
	        		  System.out.println("employe log in sucessesfull ");
	        		  CustomerDe.cart();
		          }else{
		        	  System.out.println("login is failed");
		        	  System.out.println("concern the administration");
		        	  EmpReg.emp3();
		        	  System.exit(0);
		          }
		}
	        	
		public static void emp3() throws NumberFormatException, IOException{
	           System.out.println("emp name is ragu");
	           System.out.println("enter emp id");
	           InputStreamReader isr2=new InputStreamReader(System.in);
	            BufferedReader br2=new BufferedReader(isr2);
	        
	             double id3 = Double.parseDouble(br2.readLine());
	           if(id3==345){
	        	   
		        		  System.out.println("employe log in sucessesfull ");
		        		  CustomerDe.cart();
			          }else{
			        	  System.out.println("login is failed");
			        	  System.out.println("concern the administration");
			        	 try {
							EmpReg.emp1();
						} catch (Throwable e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			        	  System.exit(0);
			          }
		}
	       
	}	
	
	
		

		
	
	



