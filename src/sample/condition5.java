package sample;
public class condition5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Double d1=2.5,d2=-1.5,d3=5.2,largest;
     if(d1<d2) {
    	 if(d2<d3) {
    		 largest=d3;
    		 System.out.println(largest);
    	 }
     } else if(d1<d3) {
    	 largest=d3;
		 System.out.println(largest);

     } else {
    	 largest=d1;
		 System.out.println(largest);
     }
     
	}
}
