package s;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpReg {
	
	InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
	public void emp() throws IOException{
		System.out.println("enter the employe login process");
	System.out.println("emp list");
	System.out.println("a.shekar");
	System.out.println("b.rakesh");
	System.out.println("c.ragu");
	 InputStreamReader isr=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);
     char ch=(char)br.read( );
		System.out.println("you entered : "+ch);
		 switch(ch)
	     {
	        case 'a' :
	        	System.out.println("employe name is shekar");
	        	System.out.println("enter the id");
	        	 InputStreamReader isr1=new InputStreamReader(System.in);
	             BufferedReader br1=new BufferedReader(isr1);
	             double id = Double.parseDouble(br1.readLine());
	        		
	          if(id==1234){
	        	  System.out.println("employe log in sucessesfull ");
	          }else{
	        	  System.out.println("login is failed");
	          }
	     
	         
	           break;
	        case 'b' :
	        	System.out.println("employe name is rakesh");
	        	System.out.println("enter empid");
	        	 InputStreamReader isr2=new InputStreamReader(System.in);
	             BufferedReader br2=new BufferedReader(isr2);
	             double id1= Double.parseDouble(br2.readLine());
	        	if(id1==123){
	        		  System.out.println("employe log in sucessesfull ");
		          }else{
		        	  System.out.println("login is failed");
		          }
	        	
	        	break;
	        case 'c' :
	           System.out.println("emp name is ragu");
	           System.out.println("enter emp id");
	         InputStreamReader isr3=new InputStreamReader(System.in);
	             BufferedReader br3=new BufferedReader(isr3);
	             double id3 = Double.parseDouble(br3.readLine());
	           if(id3==345){
	        	   
		        		  System.out.println("employe log in sucessesfull ");
			          }else{
			        	  System.out.println("login is failed");
			          }
	      
	           break;   
	        
	          default :
	           System.out.println("INVALID");
	     }
		
	}	
	
	}
		
		
		
	
	



