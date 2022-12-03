package _01_algorithms._2_fibonacci;

public class Fibonacci {
public static void main(String[] args) {
	
	int num = 1;
	int sum = 2 ;
	System.out.println(0);
	System.out.println(num);
	System.out.println(num);
	System.out.println(sum);

	for( int i= 0; i < 9; i++ ) {
		num=sum-num+1;
		System.out.println(num);
		sum=sum+num;
		
		
	}

}
}

//0
//1
//1
//2
//3
//5
//8
//13
//21
//34
//55
//89