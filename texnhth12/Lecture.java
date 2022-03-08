package texnhth12;

public class Lecture {
	
	private Department department;
	private  static lessons lesson;
	private Days day;
	private Hours hour;
	private teachers teacher;
	
	public Lecture() {};
	public Lecture(Department department,lessons lesson,Days day,Hours hour,teachers teacher) {
		this.department=department;
		this.lesson=lesson;
		this.day=day;
		this.hour=hour;
		this.teacher=teacher;
		
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public static lessons getLesson() {
		return lesson;
	}

	public void setLesson(lessons lesson) {
		this.lesson = lesson;
	}

	public Days getDay() {
		return day;
	}

	public void setDay(Days day) {
		this.day = day;
	}

	public Hours getHour() {
		return hour;
	}

	public void setHour(Hours hour) {
		this.hour = hour;
	}

	public teachers getTeacher() {
		return teacher;
	}

	public void setTeacher(teachers teacher) {
		this.teacher = teacher;
	}
	

	@Override
	public String toString() {
		return "Informations [department=" + department + ", lesson=" + lesson + ", day=" + day + ", hour=" + hour
				+ ", teacher=" + teacher + ", getDepartment()=" + getDepartment() + ", getLesson()=" + getLesson()
				+ ", getDay()=" + getDay() + ", getHour()=" + getHour() + ", getTeacher()=" + getTeacher()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
