package tw.org.iii.myjava;

import javax.swing.JOptionPane;

public class Calendar {

	public static void main(String[] args) {
		int year, month, date;
		int a, b, c, z, d, e, x, y;
		
		String inputYear = JOptionPane.showInputDialog("�п�J�d�ߦ~��");
		year = Integer.valueOf(inputYear);
		
		String inputMonth = JOptionPane.showInputDialog("�п�J�d�ߤ��");
		month = Integer.valueOf(inputMonth);
		
		String inputDate = JOptionPane.showInputDialog("�п�J�d�ߤ��");
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
//		�|�~�B����O3�뤧��
		if (year % 4 == 0 && month >2) {
			y--;
		}
		// a=�p��L�F�X�~
		a = year - 1583;
		// b=�p��|�~����
		b = (a + 2) / 4;
		// c=�p��1583�~1��1��ܬd�ߦ~���e�~12��31�骺�`�Ѽ� + �|�~����
		c = (365 * a) + b;
		// d=c���Ѽ� + ��J����e�X�Ӥ��`�Ѽ� - �C100�~�h�����|�~�Ѽ�
		d = c + m[month - 1] + (date-1) - y;
		z = d % 7;
//		System.out.println(z);
		System.out.println(year+ "�~"+month+ "��"+date+"��O�G");
		// �H1583�~1��1�鬰����I�p��
		switch(z) {
		case 0:System.out.println("�P����");
			   break;
		case 1:System.out.println("�P����");
		   	   break;
		case 2:System.out.println("�P���@");
		       break;
		case 3:System.out.println("�P���G");
		       break;
		case 4:System.out.println("�P���T");
		       break;
		case 5:System.out.println("�P���|");
		       break;
		case 6:System.out.println("�P����");
		       break;		
		}
		// �P�_2��O�_��29��
		if(date == 29) {
			if(year % 4 !=0 || (year % 100 == 0 && year % 400 != 0)) {
				System.out.println("���~2��S��29���87��");
			}
		}
	}
}
