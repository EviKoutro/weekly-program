package texnhth12;


	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	import java.util.Random;

	


		public enum Days{
			MONDAY("Monday"),
			TUESDAY("Tuesday"),
			WEDNESDAY("Wednesday"),
			THURSDAY("Thursday"),
			FRIDAY("Friday")
			;
			private final String day;
			
			private Days(String day) {
				this.day=day;
			}
			
			public String getDay() {
				return day;
			}
			public static Days randomDay() {
				return VALUES.get(RANDOM.nextInt(SIZE));
			}
			
			private static final List<Days>VALUES=Collections.unmodifiableList(Arrays.asList(values()));
			private static final int SIZE=VALUES.size();
			private static final Random RANDOM=new Random();
			
		}

	

