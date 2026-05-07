package class1.sub5;

public class Subject {
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject(String subName) {
		this.subName = subName;
		this.students = new Student[10]; // 배열 길이 10으로 초기화
		this.studentCount = 0;
	}
	
	public void addStudent(Student student) {
		this.students[studentCount++] = student;
	}
	
	public void printSubjectInfo() {
		System.out.println("과목명: "  + this.subName);
		System.out.print("수강생: ");
		
		for(Student student : students) {
			if(student != null) {
				System.out.print(student.getName() + ", ");
			}
		}
		System.out.println();
	}
	
	public String getSubName() {
		return this.subName;
	}
	
}
