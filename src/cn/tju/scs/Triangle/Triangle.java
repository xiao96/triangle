package cn.tju.scs.Triangle;

public class Triangle {
	
	public int type (int a,int b,int c){ 
		
		if ((a+b<=c)||(a+c<=b)||(b+c<=a)){

			System.out.println("����������");
			return -1;
		}

		else if(a==b&&b==c){ 

			System.out.println("�ȱ�������");
			return 1;
		   
		}
		else if(a==b||a==c||b==c){ 

			System.out.println("����������");
    		return 2;

		}else{ 

			System.out.println("��ͨ������");
			return 3;
		

		} 
   
		
	}
}
