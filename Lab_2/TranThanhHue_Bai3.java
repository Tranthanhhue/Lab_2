package TranThanhHue_03;

import java.util.Scanner;

public class TranThanhHue_Bai3 {
	public static void main(String[] args) {
		try (Scanner c = new Scanner(System.in)) {
			System.out.println("Nhap ho ten : ");
			String str = c.nextLine();
			System.out.println("Nhap tuoi cua ban : ");
			int d = c.nextInt();
			
			if(d<16) {
				System.out.println("Ban "+ str + " o do tuoi vi thanh nien");
			}else if(d<18 && d>=16) {
				System.out.println("Ban "+ str + " o do tuoi truong thanh");
			}else {
				System.out.println("Ban "+ str + " da gia");
			}
		}
	}
}
