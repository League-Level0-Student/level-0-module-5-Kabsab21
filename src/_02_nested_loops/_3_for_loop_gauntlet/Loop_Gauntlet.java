package _02_nested_loops._3_for_loop_gauntlet;

public class Loop_Gauntlet {
	public static void main(String[] args) {
		
for(int i = 0; i < 101; i++) {
	System.out.println(i);
}

for(int i = 100; i > -1 ; i--) {
	System.out.println(i);
}

for(int i = 2; i < 101; i++) {
	if( i%2==0) {
	System.out.println(i);
	}
	}

for(int i = 1; i < 100; i++) {
	if( i%2>0) {
	System.out.println(i);
	}
	}

for(int i = 1; i < 501; i++) {
	if( i%2==0) {
	System.out.println(i+" is even.");
	} else System.out.println(i+" is odd.");
	}

for(int i = 7; i < 778; i++) {
	if( i%7==0) {
	System.out.println(i);
	}
	}

int year = -1;
for(int i = 2009; i<2024; i++) {
	 year = year+1;
	System.out.println("in "+i+" i was "+ year);
} 


for( int i = 0; i < 3; i++) {
	for(int a = 0; a < 3; a++) {
		System.out.println(i+" "+ a);
	}
	}
for(int i = 1; i < 10; i++) {
	if( i%3==0) {
	 System.out.println( i+" ");
	}else {
		System.out.print( i+" ");
	}
	}
	}
}





//for(int i = 0; i<112; i++) {
//	System.out.println(i*7);
//} 


