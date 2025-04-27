package service;

import utils.BankUtils;

public class BankService {

//	한글오류 예외처리 
	
	//싱글톤 형식 고정
	private static BankService bankService = new BankService();
	private BankService() {}
	public static BankService getInstance() {
		return bankService;
	}
	
	private CustomerService customerService = CustomerService.getInstance();
	//싱글톤으로 호출하기 때문에 new 안씀
	
	public void menu() {
		if(customerService.getLoginCustomer() == null) {	//회원 여부 확인
			int no = BankUtils.nextInt("1.회원가입 2.로그인");
			switch(no) {
				case 1 :
					customerService.register();
					break;
				case 2 :
					customerService.login();
					break;
					//종료버튼 만들기
				
				}		
			}
			else {
				System.out.println("로그인 상태");
				int no = BankUtils.nextInt("1. 로그아웃 2.회원정보 조회 3.회원정보수정 4.탈퇴");
				switch(no) {
				case 1 :
					customerService.logout();
					break;
				case 2 :
					customerService.read();
					break;
				case 3 :
					customerService.modify();
					break;
//				case 4 :
//					customerService.remove();
//					break;
					
					
				}
			}
	}
}
