package week2.day2;

public class FibonacciSeries {
	public static void fibonacciSeries(int range){
		int a=0,sum;
		int b=1;
		int[] list= new int[range];
		list[0]=a;
		
		for(int i=1;i<range-1;i++) {
			sum= a+b;
			list[i]=sum;
			a=b;
			b=sum;
		}
		for (int i : list) {
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		fibonacciSeries(5);

	}

}
