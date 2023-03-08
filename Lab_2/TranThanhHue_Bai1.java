package TranThanhHue;

import java.util.Scanner;

public class TranThanhHue_Bai1 {
	public static void main(String[] args) {
    	try (Scanner a = new Scanner(System.in)) {
			System.out.println("Nhap so thu nhat : ");
			float firstNumber = a.nextFloat();
			System.out.println("Nhap so thu 2 : ");
			float secondNumber = a.nextFloat();
			
			System.out.println("Tong cua 2 so : ");
			float Sum = firstNumber+secondNumber;
			System.out.println(Sum);
			
			System.out.println("Hieu cua 2 so : ");
			float Difference  = firstNumber-secondNumber;
			System.out.println(Difference);
			
			System.out.println("Tich cua 2 so : ");
			float Product = firstNumber*secondNumber;
			System.out.println(Product);
			
			System.out.println("thuong cua 2 so : ");
			float quotient = firstNumber/secondNumber;
			System.out.println(quotient);
			
			System.out.println("so du cua 2 so : ");
			float percent = firstNumber%secondNumber;
			System.out.println(percent);
			
			System.out.println("so thu nhat > so thu 2 ??? : "+(firstNumber > secondNumber));
			System.out.println("so thu nhat < so thu 2 ??? : "+(firstNumber < secondNumber));
			System.out.println("so thu nhat >= so thu 2 ??? : "+(firstNumber >= secondNumber));
			System.out.println("so thu nhat <= so thu 2 ??? : "+(firstNumber <= secondNumber));
			System.out.println("so thu nhat = so thu 2 ??? : "+(firstNumber == secondNumber));
			System.out.println("so thu nhat != so thu 2 ??? : "+(firstNumber != secondNumber));
		}
    	
    }
}
