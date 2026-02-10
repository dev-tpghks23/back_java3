package castingTask;

public class CastingTask02 {
	public static void main(String[] args) {
//		"8.43" + 2.59를 더해서 10이 나오도록 출력하기
		String data1 = "", result = "%d";
		double data2 = 0.0;
		int num1 = 0, num2 = 0, numResult = 0;
		
		data1 = "8.43";
		data2 = 2.59;
		
		num1 = (int)Double.parseDouble(data1);
		num2 = (int)data2;
		numResult = num1 + num2;
		
		System.out.printf(result, numResult);
	}
}
