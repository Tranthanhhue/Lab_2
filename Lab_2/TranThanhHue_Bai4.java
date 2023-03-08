package TranThanhHue_04;

import java.util.Scanner;

public class TranThanhHue_Bai4 {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        System.out.print("Nhap so tu 1 den 12 : ");
        int month = input.nextInt();
        String monthYear;
        
        switch(month) {
            case 1:
            	monthYear = "Thang mot";
                break;
            case 2:
            	monthYear = "Thang hai";
                break;
            case 3:
            	monthYear = "Thang ba";
                break;
            case 4:
            	monthYear = "Thang tu";
                break;
            case 5:
            	monthYear = "Thang nam";
                break;
            case 6:
            	monthYear = "Thang sau";
                break;
            case 7:
            	monthYear = "Thang bay";
                break;
            case 8:
            	monthYear = "Thang tam";
                break;
            case 9:
            	monthYear = "Thang chin";
                break;
            case 10:
            	monthYear = "Thang muoi";
                break;
            case 11:
            	monthYear = "Thang muoi mot";
                break;
            case 12:
            	monthYear = "Thang muoi hai";
                break;
            default:
            	monthYear = "Nhap sai gia tri (1->12)";
                break;
        }
        System.out.println("Thang vua nhap vao la : " + monthYear);
        input.close(); 
	}
}
