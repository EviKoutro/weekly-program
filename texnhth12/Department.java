package texnhth12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Department {
	A1("A1"),
	A2("A2"),
	A3("A3"),
	B1("B1"),
	B2("B2"),
	B3("B3"),
	C1("C1"),
	C2("C2"),
	C3("C3")
	;
	private final String department;
	
	private Department(String department) {
		this.department=department;
	}
	
	public String getDay() {
		return department;
	}
	public static Department randomDepartment() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}
	
	private static final List<Department>VALUES=Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE=VALUES.size();
	private static final Random RANDOM=new Random();
	
}
	


