package grade;

public class BasicEvaluation implements Main_grade{
	String grade = "";
	
	@Override
	//일반과목
	public String maingrade(int point) {
		if (point > 100) {
			grade = "에러 100보다 높음";
		} else if (point <= 100 && point >= 90) {
			grade = "A";
		} else if (point <= 89 && point >= 80) {
			grade = "B";
		} else if (point <= 79 && point >= 70) {
			grade = "C";
		} else if (point <= 69 && point >= 60) {
			grade = "D";
		} else if (point <= 59 && point >= 0) {
			grade = "F";
		}  else if (point < 0) {
			grade = "에러 0보다 낮음";
		}
		return grade;
	}

}
