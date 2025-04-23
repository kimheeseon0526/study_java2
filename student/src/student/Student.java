package student;

//Data class
public class Student {
	
	//1. StidentMain의 나머지 기능 구현(메세지 출력)
	//2.Student의 생성자 구현
	//기본 생성자 + (학번, 이름) , ( 5개의 필드 다 사용)
	
	//학생 1인의 총점, 평균을 계산한다면?
	
	
	//클래스 내에 선언할 위치
	//1.필드
	//2.생성자
	//3.getter / setter
	//4.추가적인 메서드
	
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	//필드에 접근 제한자 설정시 service 클래스에서 사용 불가능하다 -> getter setter 써야됨
	
	Student(){}
	
	public Student ( String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}	//기본 생성자
	
	public Student(int no, String name){
		this.no = no;
		this.name = name;
	}
	
	public Student(int no, String name , int kor, int eng, int mat){
		this(no, name);		//다른 생성자의 값을 가져오는 것 -> 반드시 첫줄에 실행!
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	//no, name, kor, eng, mat
	//getter
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	//setter는 반환타입 x
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	public Student(int kor , int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int total() {		//총점을 계산하는 메서드를 만들어라
		return kor + eng + mat ;
	}
	
	public double avg() {
		return total() /3d;
	}
	
	 public String toString() {
		return String.format("%5d %5s %5d  %5d %5d %5.2f %5d", no, name, kor, eng, mat, avg(), total()) ;
	}
	 
}



