package _01_algorithms._2_fibonacci;

public class Fibonacci {
public static void main(String[] args) {
	
	int num = 1;
	int sum = 0 ;
	for( int i= 0; i < 10; i++ ) {
		num=num+1;
		System.out.println(sum);
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