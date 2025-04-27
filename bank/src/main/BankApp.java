package main;

import service.BankService;
import service.CustomerService;
import utils.BankUtils;

public class BankApp {
	public static void main(String[] args) {
		System.out.println(".__                                       \r\n"
				+ "|  |__  __ __  ____    ___________ ___.__.\r\n"
				+ "|  |  \\|  |  \\/    \\  / ___\\_  __ <   |  |\r\n"
				+ "|   Y  \\  |  /   |  \\/ /_/  >  | \\/\\___  |\r\n"
				+ "|___|  /____/|___|  /\\___  /|__|   / ____|\r\n"
				+ "     \\/           \\//_____/        \\/     ");
		System.out.println("==================================================");
		while(true) {
//			int no = BankUtils.nextInt("");
			BankService.getInstance().menu();
	
		}
	}
}
