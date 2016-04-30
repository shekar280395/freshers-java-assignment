package s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Use{static /*//store operation
*/	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public  static void  cart1()  {
		
			Items i1=new Items();
			i1.setiC(1001);
			i1.setiN("t hirt");
			i1.setiP(300);
			Items i2=new Items();
			i2.setiC(1001);
			i2.setiN("Trouser");
			i2.setiP(3000);
			Items i3=new Items();
			i3.setiC(1001);
			i3.setiN("shirt");
			i3.setiP(400);
			ArrayList<Items>Items=new ArrayList<Items>();
			Items.add(i1);
			Items.add(i2);
			Items.add(i3);
			System.out.println("item code is "+i1.getiC() + "\t" +i1.getiN()+"\t"+i1.getiP());
			System.out.println("item code is "+i2.getiC() + "\t" +i2.getiN()+"\t"+i2.getiP());
			System.out.println("item code is "+i3.getiC() + "\t" +i3.getiN()+"\t"+i3.getiP());
		System.out.println("total:"+(i1.getiP()+i2.getiP()+i3.getiP()));
		
			}
		
	public static void cart2(){
		Items i1=new Items();
		i1.setiC(11);
		i1.setiN("cake");
		i1.setiP(30);
		Items i2=new Items();
		i2.setiC(12);
		i2.setiN("icekream");
		i2.setiP(30);
		Items i3=new Items();
		i3.setiC(1001);
		i3.setiN("burgar");
		i3.setiP(40);
		ArrayList<Items>Items=new ArrayList<Items>();
		Items.add(i1);
		Items.add(i2);
		Items.add(i3);
		System.out.println("item code is "+i1.getiC() + "\t" +i1.getiN()+"\t"+i1.getiP());
		System.out.println("item code is "+i2.getiC() + "\t" +i2.getiN()+"\t"+i2.getiP());
		System.out.println("item code is "+i3.getiC() + "\t" +i3.getiN()+"\t"+i3.getiP());
	System.out.println("total:"+(i1.getiP()+i2.getiP()+i3.getiP()));
	
	System.out.println("total:"+(i1.getiP()+i2.getiP()+i3.getiP()));
		}
		
	public static void cart3()  {
		Items i1=new Items();
		i1.setiC(1);
		i1.setiN("Sweets");
		i1.setiP(300);
		Items i2=new Items();
		i2.setiC(12);
		i2.setiN("lays");
		i2.setiP(200);
		Items i3=new Items();
		i3.setiC(1001);
		i3.setiN("biscutes");
		i3.setiP(40);
		ArrayList<Items>Items=new ArrayList<Items>();
		Items.add(i1);
		Items.add(i2);
		Items.add(i3);
		
		System.out.println("item code is "+i1.getiC() + "\t" +i1.getiN()+"\t"+i1.getiP());
		System.out.println("item code is "+i2.getiC() + "\t" +i2.getiN()+"\t"+i2.getiP());
		System.out.println("item code is "+i3.getiC() + "\t" +i3.getiN()+"\t"+i3.getiP());
	System.out.println("total:"+(i1.getiP()+i2.getiP()+i3.getiP()));
	System.out.println("if product isnot availble in shelf");
	
	
	
		
	System.out.println("total:"+(i1.getiP()+i2.getiP()+i3.getiP()));
		}
		
	
		
		
	}
	

	
	
		
		

			
	
	
	
	

	
	


