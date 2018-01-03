package tw.org.iii.myjava;

import javax.swing.JOptionPane;

public class Calendar {

	public static void main(String[] args) {
		int year, month, date;
		int a, b, c, z, d, e, x, y;
		
		String inputYear = JOptionPane.showInputDialog("請輸入查詢年份");
		year = Integer.valueOf(inputYear);
		
		String inputMonth = JOptionPane.showInputDialog("請輸入查詢月份");
		month = Integer.valueOf(inputMonth);
		
		String inputDate = JOptionPane.showInputDialog("請輸入查詢日期");
		date = Integer.valueOf(inputDate);
		
		int [] m = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		
		x = year / 100;
		y = x - 16;
		if (x % 4 == 0) {
			y--;
		}
		if (y == -1) {
			y = 0;
		}
//		閏年且月份是3月之後
		if (year % 4 == 0 && month >2) {
			y--;
		}
		// a=計算過了幾年
		a = year - 1583;
		// b=計算閏年次數
		b = (a + 2) / 4;
		// c=計算1583年1月1日至查詢年份前年12月31日的總天數 + 閏年次數
		c = (365 * a) + b;
		// d=c的天數 + 輸入月份前幾個月總天數 - 每100年多扣的閏年天數
		d = c + m[month - 1] + (date-1) - y;
		z = d % 7;
//		System.out.println(z);
		System.out.println(year+ "年"+month+ "月"+date+"日是：");
		// 以1583年1月1日為基準點計算
		switch(z) {
		case 0:System.out.println("星期六");
			   break;
		case 1:System.out.println("星期日");
		   	   break;
		case 2:System.out.println("星期一");
		       break;
		case 3:System.out.println("星期二");
		       break;
		case 4:System.out.println("星期三");
		       break;
		case 5:System.out.println("星期四");
		       break;
		case 6:System.out.println("星期五");
		       break;		
		}
		// 判斷2月是否有29天
		if(date == 29) {
			if(year % 4 !=0 || (year % 100 == 0 && year % 400 != 0)) {
				System.out.println("今年2月沒有29日→87分");
			}
		}
	}
}
