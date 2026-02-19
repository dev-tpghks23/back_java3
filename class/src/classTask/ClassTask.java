package classTask;

//1. 스포츠(Sports) 추상화
class Sports {
	String name;
	int player;
	String ball;
	
//	기본 생성자
	public Sports() {;}

//	Shift + Alt + S -> O
//	초기화 생성자
	public Sports(String name, int player, String ball) {
		this.name = name;
		this.player = player;
		this.ball = ball;
	}
}

// 2. 농구(BasketBall), 야구(BaseBall), 축구(Soccer) 객체 
// 3. 기본 생성자, 초기화 생성자 생성 후 초기화
public class ClassTask {
	public static void main(String[] args) {
		Sports basketBall = new Sports("농구", 5, "농구공");
		Sports baseBall = new Sports("야구", 9, "야구공");
		Sports soccer = new Sports("축구", 11, "축구공");
		
		System.out.println(basketBall.name);
		System.out.println(baseBall.name);
		System.out.println(soccer.name);
		
	}
	
}










