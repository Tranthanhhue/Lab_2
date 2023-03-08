package TranThanhHue_02;

import java.util.Scanner;

public class TranThanhHue_Bai2 {
	public static void main(String[] args) {
		try (Scanner b = new Scanner(System.in)) {
			System.out.println("Enter a number : ");
			int c = b.nextInt();
			
			if(c%2==0) {
				System.out.println("So da nhap vao la so chan ");
			}else {
				System.out.println("So da nhap vao la so le");
			}
		}
	}
}
