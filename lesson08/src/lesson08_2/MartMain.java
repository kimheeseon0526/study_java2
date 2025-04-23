package lesson08_2;

public class MartMain {
	public static void main(String[] args) {
		Buyer 송성준 = new Buyer();
		송성준.buy(new Aircon());
		송성준.display();
		송성준.buy(new Computer());
		송성준.buy(new Computer());
		송성준.display();
		송성준.buy(new Computer());
		송성준.display();
		
		
	}

}

//상품에 해당하는 기반 클래스
//부모 클래스
class Product{
	
	int price ;
	
	public Product(int price) {	//생성자
		this.price = price;
	}
	public String toString() {		//toString : 주소값을 문자로 보여줌
		return getClass().getSimpleName() + "[" + price + "]"; 
	}
}

//자식 클래스
class Cooker extends Product{
	public Cooker() {
		super(50);
	}
}
class Computer extends Product{
	public Computer() {
		super(200);
	}
}
class Aircon extends Product{
	public Aircon() {
		super(500);
	}
}

class Buyer{
	Product[] products = new Product[10];	//상품들
	int count;
	int amount = 1000;
	
	public void buy(Product product) {
		if(product.price <= amount) {
			products[count++] = product;
			amount -= product.price;
		}
		else {
			System.out.println("잔액이 부족하여 구매가 불가능ㅜ.ㅜ");
		}
	}
	public void display() {
		System.out.println("현재 구매한 물건들");
		String str = "";
		for(int i = 0 ; i < count ; i++) {
			str += products[i] + " ";
		}
		System.out.println(str);
		System.out.println("현재의 잔고 : " + amount);
	}
}