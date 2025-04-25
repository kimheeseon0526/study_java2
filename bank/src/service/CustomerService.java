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
	
	{
		customers.add(new Customer(1,"새똥이", "010-1234-1234","ssa@gmail.com", "ssa", "1234"));
	}
	
	
	public void register() {
		System.out.println("회원 가입");
	}
	public void login() {
		String id = BankUtils.nextLine("아이디 > ");	
		String pw = BankUtils.nextLine("비밀번호 > ");	
		
		boolean flag = false;
		for(Customer c : customers) {
			if(c.getId().equals(id) && c.getPw().equals(pw)) {
				flag = true;
				loginCustomer = c;
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
	
	
	public Customer getLoginCustomer() {
		return loginCustomer;
	}
	public void setLoginCustomer(Customer loginCustomer) {
		this.loginCustomer = loginCustomer;
	}
	

}
