package daily_note;

public class jav_ch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
//		short result3 = -s;
		int result3 = -s;
		System.out.println("result3" + result3);

		long y = 500;
//		int result4 = -y;
		long result4 = -y;
		System.out.println("result4" + result4);
		
		String a = "아나콘다";
//		string b = 'anaconda';		// 컴파일 에러 String, "" 유의!
		System.out.println(a);
//		System.out.println(b);
		
		String strVar1 = "신용권";
		String strVar2 = "신용권";
		String strVar3 = new String("신용권"); 
		boolean k_1 = (strVar1 == strVar2);
		boolean k_2 = (strVar1 == strVar3);
//		for (int i=1; i<5; i++) {
//			int num = 0;
//			num++;	
//			if((k_+'num') = true) {
//				System.out.println("같다");
//			} else {
//				System.out.println("다르다");
//			}	
//		}
		
	}

}
