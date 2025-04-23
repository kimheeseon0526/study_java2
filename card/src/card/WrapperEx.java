package card;

public class WrapperEx {
	public static void main(String[] args) {
		int i = 10;
		Integer i2 = 20;
		System.out.println(i + i2);
		
		//기본형 > wrapper (boxing 한다)
		Integer i3 = Integer.valueOf(i);
		//wrapper > 기본형(unboxing 한다)
		int i4 = i3.intValue();
		
		//auto boxing
		Integer i5 = i;
		int i6 = i5;
		
		m(10L); 	//int 리터럴  -> long 타입으로 맞추기 위해 L 붙여주던가~
		m(Long.valueOf(10));
		m((long)i6);	//형변환 시켜주던가~
		
		
		//문자열 > 기본형
		int i7 =Integer.parseInt("1234");
		long l = Long.parseLong("1234");
		Integer i8 = Integer.valueOf("1234");
		System.out.println(i8);
		
		boolean b = "true" .equals("treu");
		System.out.println(b);
	}
	static void m(Long l) {	//long 타입 리터럴이여야함
		
	}
}
