package lesson12;

public class Member implements Cloneable {
	String name;
	String tel;

	Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String toString() {
		return "name : " + name + "tel : " + tel;
	}

	@Override // 오버라이딩 중일 때는 컴파일 오류 없다
	public boolean equals(Object obj) {
		return obj != null && obj instanceof Member && ((Member) obj).tel.equals(this.tel);
	}

	public Member clone() {
		Member member = null;
		try {
			member = (Member) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
