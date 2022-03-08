package texnhth12;

public class teachers {

	private int teachers_code;
	private String teachers_name;
	private int code;
	private int max_per_day;
	private int max_per_week;
	
//default constructor	
public teachers() {};
//constructor
public teachers(int teachers_code,String teachers_name,int code,int max_per_day,int max_per_week ) {
	this.teachers_code=teachers_code;
	this.teachers_name=teachers_name;
	this.code=code;
	this.max_per_day=max_per_day;
	this.max_per_week=max_per_week;
	
}	
	
//setters
public void setTeachers_code(int teachers_code) {
	this.teachers_code=teachers_code;
}
public void setTeachers_name(String teachers_name) {
	this.teachers_name=teachers_name;
}
public void setCode(int code) {
	this.code=code;
}
public void setMax_per_day(int max_per_day) {
	this.max_per_day=max_per_day;

}	
	
public void setMax_per_week(int max_per_week) {
	this.max_per_week=max_per_week;
}
//getters
public int getTeachers_code() {
	return teachers_code;
}
public String getTeachers_name() {
	return teachers_name;
}
public int getCode() {
	return code;
}
public int getMax_per_day() {
	return max_per_day;
}
public int getMax_per_week() {
	return max_per_week;
}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
