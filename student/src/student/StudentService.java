package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;


//학생 예제의 배열 > 리스트로 교체
//이름 유효성을 정규표현식으로 교체 - Matchs 클래스 사용

//핵심적인 로직 클래스 - service  / CRUD
public class StudentService {
	
	private List<Student> students = new ArrayList<Student>();
	private List<Student> sortedStudents;
	private int count;
	
	{
		students.add(new Student("개똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student("새똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student("말똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student("개새똥이", randomScore(), randomScore(), randomScore()));
		
		sortedStudents = new ArrayList<Student>(students); //값이 변할 때 -> 등록, 수정, 삭제시	
		rank();	//복제하고 정렬해라
	
	}
	//랜덤값 배정하는 것
	public int randomScore() {	
		return (int)(Math.random() * 41 + 60);
	}
	//입력 : 학번
	//출력 : 학생
	
	//중복여부확인
	public Student findBy(int no) {
		Student student = null;
		for(int i = 0; i < students.size() ; i++) {
			if(students.get(i).getNo() == no) {
				student = students.get(i);
				break;
			}
		}
		return student;
	}
	public int checkRange(String subject , int input, int start, int end ) {
		boolean ret = true;
		if(input < start || input > end) {
			throw new IllegalArgumentException(subject + "값의 범위를 벗어났습니다." + start + "~" + end + "사이 값 입력하쇼");
		}
		return input;
	}
	public int checkRange(String subject, int input) {
		return checkRange(subject, input, 0, 100);
		
	}
	public String inputName() {
		//글자갯수 && 한글
		String name = StudentUtils.nextLine("이름 > ");
//		if(name.length() < 2 || name.length() > 4 ){
//			throw new IllegalArgumentException("이름은 2-4글자로 입력해");
//		}
//		for(int i = 0; i < name.length() ; i++) {
//			if(name.charAt(i) < '가' || name.charAt(i) > '힣'){
//				throw new IllegalArgumentException("이름은 한글로 입력해");			
//			}	
		// 아래에서 유효성 검사하게되면 위의 코드는 필요없다
		
			if(!name.matches("[가-힣]{2,4}")){
				throw new IllegalArgumentException("이름은 한글로 입력해");
			}
		return name;
	}
	//등록
	public void register() {
		
		System.out.println("등록 기능");
		//풀이
		int no = StudentUtils.nextInt("학번 : " );
		
		Student s = findBy(no);
		if(s != null) {
			System.out.println("중복된 학번이 존재합니다. ");
			return;
		}
		String name = StudentUtils.nextLine("이름 > " );
		
		
		int kor = StudentUtils.nextInt("국어 > ");
		checkRange("국어", kor);
				
		int eng = StudentUtils.nextInt("영어 > ");
		checkRange("영어", eng);
			
		int mat = StudentUtils.nextInt("수학 > ");
		checkRange("수학", mat);
		
		Student s2 = new Student(no, name, kor, eng, mat);
		students.add(s2);
		sortedStudents.add(s2);
		rank();	//복제하고 정렬해라
	}	
	
	//조회
	public void read() {
		System.out.println("조회 기능");
		print(students);
	}
	public void readOrder () {
		System.out.println("석차순 조회 기능");
		print(sortedStudents);
	}
	
	public void print(List<Student> stu) {
		for(int i = 0; i < stu.size() ; i++) {
			System.out.println(stu.get(i));
			}		
	//stream 위의 for문 대신 사용할 수 있다
//		stu.forEach(s -> System.out.println(s));
		}	
	//수정
	public void modify() {
		//학생들 배열에서 입력받은 학번과 일치하는 학생
		System.out.println("수정 기능");
//		int input =  StudentUtils.nextInt("수정할 학번을 입력하세요 > " );	
//		for(int i = 0; i < count ; i++) {
//			if( input == students[i].no ) {	//
//				System.out.println(students[i].no);
//				String name = StudentUtils.nextLine("이름 > " );
//				int kor = StudentUtils.nextInt("국어 > " );
//				int eng = StudentUtils.nextInt("영어 > " );
//				int mat = StudentUtils.nextInt("수학 > " );
//				//수정된 학생 정보 저장
//				students[i] = new Student(input, name, kor, eng, mat);
//				System.out.println(students[i].no + " , " + students[i].name + " , " + students[i].total() + " , " + students[i].avg());			
			//풀이
				int no = StudentUtils.nextInt("수정할 학생 학번 > ");
				Student s = findBy(no);
				if(s == null) {
					System.out.println("입력된 학번이 존재하지 않습니다.");
					return ;
				}
				
//				for(int i = 0; i < count ; i++) {
//					if(students[i].no == no) {
//						s = students[i];
//						break;
//					}
//				}
				String name = inputName();
				s.setName(name);
				s.setKor(checkRange("국어", StudentUtils.nextInt("국어 > " )));
				s.setEng(checkRange("영어", StudentUtils.nextInt("영어 > " )));
				s.setMat(checkRange("수학", StudentUtils.nextInt("수학 > " )));
				rank();	//복제하고 정렬해라
			}
	
//		}
//	}
	//삭제
	public void remove(){
//		System.out.println("삭제 기능");
//		int input =  StudentUtils.nextInt("삭제할 학생의 학번을 입력하세요 > " );	//변수
//		for(int i = 0; i < count ; i++) {
//			if( input == students[i].no ) {
//				 System.arraycopy(students, i+1,students, i, count - i -1);
//				 students[count - 1] = null;
//				 count--;		
//			}
//			System.out.println("삭제되었습니다.");
//		}
		//풀이
		int no = StudentUtils.nextInt("삭제할 학생의 학번 : ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return ;
		}
		students.remove(s);
		sortedStudents.remove(s);
	}
		
	public void allAvg() {
		//국어, 영어, 수학, 전체평균
//		students.stream().map(s->s.getKor());
		
		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;
		
		//count
		int size = students.size();	//students.size()가 자주 사용되니 변수에 담아서 코드 줄이기
		for(int i = 0 ; i < size ; i++) {
			avgKor += students.get(i).getKor();
			avgEng += students.get(i).getEng();
			avgMat += students.get(i).getMat();
		}
		avgKor /= (double)size ;
		avgEng /= (double)size ;
		avgMat /= (double)size ;
		
		avgAll = (avgKor + avgEng + avgMat) / 3;
			
		System.out.println(size + " 명의 학생 평균");
		System.out.println("국어 평균 : " + avgKor);
		System.out.println("영어 평균 : " + avgEng);
		System.out.println("수학 평균 : " + avgMat);
		System.out.println("전체 평균 : " + avgAll);
	}
	
	public void rank() {
		
	
			for(int i = 0 ; i < sortedStudents.size() - 1 ; i++) {
				int idx =  i;
				for(int j = 1 + i ; j < sortedStudents.size() ; j++) {		//비교 대상
					if(sortedStudents.get(idx).total() < sortedStudents.get(j).total()) {
						idx = j;
					}
				}
			Student tmp = sortedStudents.get(i);		//최소값 찾아서 두 자리의 idx를 바꾼다
			sortedStudents.set(i, sortedStudents.get(idx));		//set
			sortedStudents.set(idx, tmp);
		
			//comparator 정의하기
			Comparator<Student> comp = new Comparator<Student>() {
				
				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					return 0;
				}
			};
			}
		}
	
		
		
//		for(int i = 0 ; i < count ; i++) {
//			avgkor += students[i].kor ;
//			avgeng += students[i].eng ;
//			avgmat += students[i].mat ;
//				
//		}
//		System.out.println((avgkor/count) +"," + (avgeng/count) +","+ (avgmat/count)+"," + ((avgkor + avgeng + avgmat)/3d));
//	}

	
//		public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};
//		int idx = 0;
//		System.arraycopy(arr,  idx + 1, arr, idx , arr.length -1 -idx);
//		System.out.println(Arrays.toString(arr));
//	
//	}
			
//		public static void main(String[] args) {
//			int[] arr = {5,3,2,1,4};
			
			//탐색 n 최소값
			//1, 3, 2, 5, 4  > 1회차
			//1, 2, 3, 5, 4	 > 2회차
			//1, 2, 3, 5, 4  > 3회차
			//1, 2, 3, 4, 5  > 4회차     회차개수 n-1번
			
//			int min = arr[idx];
//			for(int i = 0 ; i < arr.length - 1 ; i++) {
//				int idx =  i;
//				for(int j = 1 + i ;j < arr.length; j++) {		//비교 대상
//					if(arr[idx] > arr[j]) {
//						idx = j;
//					}
//				}
//			int tmp = arr[i];		//최소값 찾아서 두 자리의 idx를 바꾼다
//			arr[i] = arr[idx];
//			arr[idx] = tmp;
//		
//			System.out.println(i + 1 + "회차 : " + Arrays.toString(arr));
//		}
//	}
	
}