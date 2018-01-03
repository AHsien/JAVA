package tw.org.iii.myjava;

public class primeNumbers {

	public static void main(String[] args) {
		for(int i = 2; i <= 100; i++) {
			int x = 0;
			for(int n = 2; n < i; n++) {
				if(i % n == 0) {
					x = 1;
				}
			}
			if(x == 0) {
				System.out.println(i);
			}
		}
	}

}

