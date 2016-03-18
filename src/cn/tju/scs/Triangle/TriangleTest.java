package cn.tju.scs.Triangle;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TriangleTest {
	private Triangle t ;
		public TriangleTest(){
			t = new Triangle();
		}
		
		@Test
		public void type1()
		{
		int result = t.type(1, 2, 3);
		assertEquals(-1,result);
		}
		
		@Test
		public void type2()
		{
		int result = t.type(1, 1, 1);
		assertEquals(1,result);
		}
		
		@Test
		public void type3()
		{
		int result = t.type(3, 3, 2);
		assertEquals(2,result);
		}
		
		@Test
		public void type4()
		{
		int result = t.type(3, 4, 5);
		assertEquals(3,result);
		}

		@Test
		public void type6()
		{
		int result = t.type(0, 0, 0);
		assertEquals(-1,result);
		}
		
		@Test
		public void type7()
		{
		int result = t.type(-1, 0, 0);
		assertEquals(-1,result);
		}
	
        @Ignore
		@Test
		public void type5()
		{
		int result = t.type(3, 4, 3);
		assertEquals(-1,result);
		}
        
        public void type8()
		{
		int result = t.type(3, 4, 3);
		assertEquals(1,result);
		}
        
        public void type9()
		{
		int result = t.type(3, 3, 3);
		assertEquals(2,result);
		}
        
        public void type10()
      		{
      		int result = t.type(1, 3, 3);
      		assertEquals(3,result);
      		}
        
	
	}

	

















