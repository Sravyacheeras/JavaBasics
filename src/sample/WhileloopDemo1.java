package sample;

public class WhileloopDemo1 {

	public static void main(String[] args) {
     //this program is for printing divisible of 5 until 100
		int i = 1;
		while (i <= 100) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
