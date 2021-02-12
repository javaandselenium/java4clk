package arrays;

public class Test1 {

	public static void main(String[] args) {
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=50;
		//a[4]=60;
		
//		for(int i=0;i<=3;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		for(int bw:a)
		{
			System.out.println(bw);
		}

	}

}
