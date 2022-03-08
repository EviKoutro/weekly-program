package texnhth12;

public class lessons {
	private  int code;
	private String subject;
	private String classes;
	private int hours;
	//default constructor
	public lessons() {}
	//constructor
	public lessons(int code,String subject,String classes,int hours) {
		this.code=code;
		this.subject=subject;
		this.classes=classes;
		this.hours=hours;
		
   }
	//setters
	public void setCode(int code) {
		this.code=code;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public void setClasses(String classes) {
		this.classes=classes;
	}
	public void setHours(int hours) {
		this.hours=hours;
	}
	//getters
	public int getCode() {
		return code;
	}
	public String getSubject() {
		return subject;
	}
	public String getClasses() {
		return classes;
	}
	public int getHours() {
		return hours;
	}
	
	
}
