package class1.sub1;

public class StudentScore {
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	
	
	public StudentScore(String studentName, String studentId, String subject, double score) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	
	public void updateScore(double d) {
		if(d > 100) {
			System.out.println("잘못된 점수 입력");
			return;
		}
		
		this.score = d;
		System.out.println("점수 수정 완료");
	}
	
	public double getScore() {
		return score;
	}
	
	public void printStudentInfo() {
		System.out.println("학생 이름 : " + studentName);
		System.out.println("학생 ID : " + studentId);
		System.out.println("과목명 : " + subject);
		System.out.println("점수 : " + score);
	}
	
}
