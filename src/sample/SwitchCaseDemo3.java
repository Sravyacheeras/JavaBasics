package sample;

public class SwitchCaseDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i=55;
     String size = "";
     switch(i) {
     case 29:
    	 size="SMALL";
    	 break;
     case 33:
    	 size="MEDIUM";
    	 break;
     case 49:
    	 size="LARGE";
    	 break;
     case 55:
    	 size="XTRA LARGE";
    	 break;
     default:
    	 System.out.println("Not valid size ");
    	 break;
     }
     if(size!="") {
     System.out.print("Size is:: ");
     System.err.print(size);
     }
     
	}

}
