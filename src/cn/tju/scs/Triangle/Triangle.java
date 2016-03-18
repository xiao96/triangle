package cn.tju.scs.Triangle;

public class Triangle {
	
	public int type (int a,int b,int c){ 
		
		if ((a+b<=c)||(a+c<=b)||(b+c<=a)){

			System.out.println("不是三角形");
			return -1;
		}

		else if(a==b&&b==c){ 

			System.out.println("等边三角形");
			return 1;
		   
		}
		else if(a==b||a==c||b==c){ 

			System.out.println("等腰三角形");
    		return 2;

		}else{ 

			System.out.println("普通三角形");
			return 3;
		

		} 
   
		
	}
}
