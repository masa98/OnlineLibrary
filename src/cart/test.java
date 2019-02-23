package cart;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class test {

	@Test
		  public void count1() {
		cart C1=new cart();
		
		book b1=new book("Java Book",172);
		book b2=new book("Software Book",250);
		book b3=new book("Calculase Book",100);
		
		C1.addcart(b1);
		C1.addcart(b2);
		C1.addcart(b3);
		
	    int Sum=0;
	    int count=C1.A.size();
	    for(int i=0;i<count;i++) {
	    Sum+=C1.A.get(i).getP();
	    }
	   
		    assertEquals(3,count);
		    assertEquals(522,Sum);
		    }
		 
		 
		 @Test
		    public void count2() {
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
		    }
		 
		 
	}


