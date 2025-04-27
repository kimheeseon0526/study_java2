package service;

import java.util.ArrayList;
import java.util.List;
import domain.Customer;
import utils.BankUtils;

public class CustomerService {
	
	private List<Customer> customers = new ArrayList<Customer>();
	private Customer loginCustomer;
	
	//싱글톤 형식 고정
	private static CustomerService customerService = new CustomerService();	//선언
	public CustomerService() {}	//생성자
	public static CustomerService getInstance() {	//getInstance
		return customerService;
	}
	int count = 1;
	
	{
		customers.add(new Customer(count++,"새똥이", "010-1234-1234","ssa@gmail.com", "ssa", "1234"));
	}
	
	
	public void register() {
		System.out.println("회원 가입");
//		int no = BankUtils.nextInt("번호를 입력하세요 >  ");
		String name = BankUtils.nextLine("이름을 입력하세요 >  ");
		String tel = BankUtils.nextLine("전화번호를 입력하세요 > ");	//정규식 - 중복체크 
		String email = BankUtils.nextLine("이메일을 입력하세요 > ");	//정규식
		String id = BankUtils.nextLine("아이디를 입력하세요 > ");	//중복체크
		String pw = BankUtils.nextLine("비밀번호를 입력하세요 > ");	//비밀번호 확인
		
		customers.add(new Customer(count++, name, tel, email, id, pw));
		System.out.println("회원가입이 되었습니다.");	
	}
	public void login() {
		String id = BankUtils.nextLine("아이디 > ");	
		String pw = BankUtils.nextLine("비밀번호 > ");	
		
		boolean flag = false;		
		for(Customer c : customers) {
			if(c.getId().equals(id) && c.getPw().equals(pw)) {
				flag = true;	//일치하면 flag가 true로 변경
				loginCustomer = c;	//누가 로그인했는지 확인
				break;
			}
		}
		if(!flag) {
			System.out.println("아이디 또는 비밀번호가 틀렸다");
		}
	}
	public void logout() {
		loginCustomer = null;
		System.out.println("로그아웃 되었따리~");
		
	}
	
	public void read() {	//아이디랑 비밀번호 확인 후
		System.out.println("회원정보 조회하기");
		
		System.out.println("ID : " + loginCustomer.getId() + ", 이름 : " + loginCustomer.getName() + ", e-mail :  " + loginCustomer.getEmail() + ", tel : " + loginCustomer.getTel());

					return;
				}
	
	public void modify() {	//수정		//가능하면 pw,email,tel 따로 만들기     
		System.out.println("회원정보 수정하기");
		//비밀번호, 전화번호, 메일 수정 가능
		String pw = BankUtils.nextLine("비밀번호 > ");	//지금 쓰고 있는 비번 사용 불가능하게 ㅇㅇㅇㅇㅇ
		String email = BankUtils.nextLine("이메일 > ");//지금 쓰고 있는 비번 사용 불가능하게 ㅇㅇㅇㅇㅇ
		String tel = BankUtils.nextLine("전화번호 > ");//지금 쓰고 있는 전화번호 사용 불가능하게 ㅇㅇㅇㅇㅇ
		
//		입력받아서
//		일치여부 확인하라고?ㅇㅇㅇ(! 입력값 = 현재 비번)
	



		
		loginCustomer = new Customer(loginCustomer.getNo(),loginCustomer.getName(), tel, email, loginCustomer.getId(), pw);
		System.out.println("회원정보가 수정되었습니다.");

	}
	public void remove() {	//탈퇴
		for(int i = 0; i < customers.size(); i++) {
			if(loginCustomer.getNo() == customers.get(i).getNo() && BankUtils.nextConfirm("삭제하시겠습니까?")) {
//				customers.remove(loginCustomer.getNo(), loginCustomer.getId(), loginCustomer.getEmail(), loginCustomer.getPw(), loginCustomer.getTel());
				customers.remove(i);
				
			}
			System.out.println("탈퇴가 완료되었습니다.");
			}
//				if(BankUtils.nextConfirm("삭제하시겠습니까?")) {
//					loginCustomer.remove();
//					System.out.println("삭제되었습니다");
//				}

	}

	public Customer getLoginCustomer() {
		return loginCustomer;
	}
	public void setLoginCustomer(Customer loginCustomer) {
		this.loginCustomer = loginCustomer;
	}
	

}
