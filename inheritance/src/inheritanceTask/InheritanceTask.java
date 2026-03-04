package inheritanceTask;
//	상속 및 분리 실습
//	
//	PersonTask
//	이름, 나이, 주소, 핸드폰
//	각 메서드 출력
//	work 일을 한다
//	sleep 잠을 잔다
//	eat 세 끼를 먹는다
//	
//	StudentTask
//	인스타아이디
//	각 메서드 출력
//	work 아르바이트를 한다
//	sleep 수업 시간에 잠을 잔다
//	eat 아침을 거른다
//	
//	EmployeeTask
//	비상금
//	각 메서드 출력
//	work 하루 종일 일을 한다
//	sleep 잠을 설친다
//	eat 야식을 먹는다
//	
//	InhertanceTask에서
//	사람, 학생, 직장인 객체화 후 각 메서드 출력하기

class PersonTask {
//	이름, 나이, 주소, 핸드폰
	String name;
	int age;
	String address;
	String phone;
	
	public PersonTask() {;}
	public PersonTask(String name, int age, String address, String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
	void work() {
		System.out.println("일을 한다.");
	}
	
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	
	void eat() {
		System.out.println("세 끼를 먹는다.");
	}
}

class StudentTask extends PersonTask {
//	인스타아이디
	String insta;
	
	public StudentTask() {;}
	public StudentTask(String name, int age, String address, String phone, String insta) {
		super(name, age, address, phone);
		this.insta = insta;
	}
	
//	work 아르바이트를 한다
	@Override
	void work() {
		System.out.println("아르바이트를 한다");
	}
	
//	sleep 수업 시간에 잠을 잔다
	@Override
	void sleep() {
		System.out.println("수업 시간에 잠을 잔다");
	}
	
//	eat 아침을 거른다
	@Override
	void eat() {
		System.out.println("아침을 거른다.");
	}
}


class EmployeeTask extends PersonTask {
//	비상금
	int nestEgg;

	public EmployeeTask() {;}
	public EmployeeTask(String name, int age, String address, String phone, int nestEgg) {
		super(name, age, address, phone);
		this.nestEgg = nestEgg;
	}
	
//	각 메서드 출력
//	work 하루 종일 일을 한다
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다.");
	}
	
//	sleep 잠을 설친다
	@Override
	void sleep() {
		System.out.println("잠을 설친다");
	}
//	eat 야식을 먹는다
	@Override
	void eat() {
		System.out.println("야식을 먹는다.");
	}
}

public class InheritanceTask {
	public static void main(String[] args) {
		PersonTask person = new PersonTask("홍길동", 20, "서울시 강남구", "010-1234-1234");
		EmployeeTask employee = new EmployeeTask("홍길동", 20, "서울시 강남구", "010-1234-1234", 50000);
		StudentTask student = new StudentTask("홍길동", 20, "서울시 강남구", "010-1234-1234", "test123");
		
		person.eat();
		employee.eat();
		
		person.work();
		student.work();
		
	}
}











