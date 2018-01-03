package tw.org.iii.myjava;

public class Lab01 {

	public static void main(String[] args) {
		//Data Type
		// Integer: byte(2^8) short(2^16) int(2^32) long(2^64)
		// 1. [a-zA-A$_] [a-zA-Z0-9$_]*
		// 2. no keyword
		byte var1, var2, var3 = 127, var4;
		var1 = -128;
		var1--;
		var3++;
		short var5 = 32767;
		
		int var6 = 1234567890;
		
		// Float :float(2^32), double(2^64)
		
		float var7 = 12.3F;
		double var8 =12.3;
		float var9 = 123;
		
		
		//char: 2^16  0 ~ 65525
		char var10 = 'a';
		char var11 = 65;  //ASCII
		char var12 = '資';
		char var13 = '\u0062';  // 16進位
		int var14 = 012; //8進位
		int var15 = 0x12; //16進位
		
		double var16 = 1.2e4;  //1.2 * 10 ^ 4
		
		boolean var17 = true;
		boolean var18 = false;
		
		System.out.println(var1);
//		System.out.println(var2);
		System.out.println(var3);
//		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		System.out.println(var10);
		System.out.println(var11);
		System.out.println(var12);
		System.out.println(var13);
		System.out.println(var14);
		System.out.println(var15);
		System.out.println(var16);
		System.out.println(var17);
		System.out.println(var18);
		

	}

}
