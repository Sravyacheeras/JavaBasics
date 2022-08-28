package sample;

public class Stringbuffer1 {

	public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();
	System.out.println(sb.capacity());
	sb.append("abcdefghijklmnop");
	System.out.println(sb.capacity());
	sb.append("q");
	System.out.println(sb.capacity());
	sb.append("abcdefghijklmnop");
	sb.append("r");
	System.out.println(sb);

	}

}
