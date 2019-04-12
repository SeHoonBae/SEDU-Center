package admin;

public class DTO_StudentsTakingCourses_A {

	/*
	 * 1. 관리자 - 4. 성적 조회 - b. 학생별 성적 조회
	 * 학생별 수강과정 목록을 보여줌 
	 * 
	 * [해당 쿼리에서 사용된 테이블]
	 * tblStudent
	 * tblRegiCourse
	 * tblOpenCourse
	 * tblCourse
	 * tblRoom
	 */
	
	private String rownum; // 메뉴선택번호
	private String studentName; // 학생명
	private String studentPw; // 주민번호(뒷자리)
	private String courseName; // 개설과정명
	private String courseDuration; // 개설과정기간
	private String className; // 강의실명
	
	
	public String getRownum() {
		return rownum;
	}
	public void setRownum(String rownum) {
		this.rownum = rownum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPw() {
		return studentPw;
	}
	public void setStudentPw(String studentPw) {
		this.studentPw = studentPw;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	
}
