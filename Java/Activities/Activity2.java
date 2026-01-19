package activities;

public class Activity2 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum =0;
		int a[] = {10, 77, 10, 54, -11, 10};
		for(; i < a.length; i++) {
			if (a[i] == 10) {
//				System.out.println(a[i]);
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
	}
	
}
