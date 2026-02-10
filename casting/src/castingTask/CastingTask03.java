package castingTask;

public class CastingTask03 {
	public static void main(String[] args) {
//		'a', 'j', 'k'를 연산하여 'A', 'J', 'K' 출력하기
		char a = 'a', j = 'j', k = 'k';
		int gap = 'a' - 'A';
		String result = "%c, %c, %c";
		
		a = (char)(a - gap);
		j = (char)(j - gap);
		k = (char)(k - gap);
		
		System.out.printf(result, a, j, k);
	}
}
