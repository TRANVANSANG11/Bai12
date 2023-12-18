package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int tong = 0;
//		int i = 0;
//		for(; i <= 100; ) {
//			tong += i;
//			i++;
//		}
//		
//		System.out.println("tong = " + tong);
//		System.out.println("i = " + i);
		Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so tu nhien n: ");
        int n = sc.nextInt();
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) {
                tong += i;
            	}
        	}
        	System.out.println("tong cac so chia het cho 3 va be hon " + n + " la: " + tong );
		}
	}	
