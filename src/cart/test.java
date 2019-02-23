package cart;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class test {

	@Test
		  public void count1() {
		cart C1=new cart();
		
		book b1=new book("Java Book",172);
		
		C1.addcart(b1);
		
	    int Sum=0;
	    int count=C1.A.size();
	
	    Sum+=C1.A.get(0).getP();
	    
	   
		    assertEquals(1,count);
		    assertEquals(172,Sum);
		    }
	
	@Test
	  public void count2() {
	cart C1=new cart();
	
	book b1=new book("Java Book",172);
	book b2=new book("Web design Book",100);
	
	C1.addcart(b1);
	C1.addcart(b2);
	
  int Sum=0;
  int count=C1.A.size();
  for(int i=0;i<count;i++) {
  Sum+=C1.A.get(i).getP();
  }
 
	    assertEquals(2,count);
	    assertEquals(272,Sum);
	    }
		 
		 @Test
		    public void count0() {
			 ArrayList<cart> A=new ArrayList<cart>();
				book b0=new book();

				int count, Sum=0;
				
				cart C0= new cart();
				C0.addcart(b0);
				
			    count=A.size();
			    for(int i=0;i<count;i++) {
			    Sum+=C0.A.get(i).getP();
			    }
			   
		    assertEquals(0,Sum);
		    assertEquals(0,count);

		 }
		 
		 
	}


