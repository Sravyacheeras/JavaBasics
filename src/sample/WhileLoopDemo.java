package sample;

public class WhileLoopDemo {

	public static void main(String[] args) {
//1,2,3,4,5

		
		int i=1,sum=0,k=0;
		
		  //while loop 
			while(i<10) { 
				sum=sum+i; 
				i=i+1; 
				} 
			System.out.println(sum);
		  sum=0; 
		  //for loop 
		  for(int j=1;j<10;j++) 
		  {
			  sum=sum+j;
			}
		  System.out.println(sum);
		  sum=0;
		 //do while loop
		do {
			sum=sum+k;
			k++;
		}while(k<10);
		System.out.println(sum);
	}

}
