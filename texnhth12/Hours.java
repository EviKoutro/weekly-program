package texnhth12;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


	public enum Hours{
		First("7-8"),
		Second("8-9"),
		Third("9-10"),
		Fourth("10-11"),
		Firth("11-12"),
		Sixth("12-1"),
		Seventh("1-2")
		;
		private final String hour;
		
		private Hours(String hour) {
			this.hour=hour;
		}
		
		public String getHour() {
			return hour;
		}
		public static Hours randomHour() {
			return VALUES.get(RANDOM.nextInt(SIZE));
		}
		
		private static final List<Hours>VALUES=Collections.unmodifiableList(Arrays.asList(values()));
		private static final int SIZE=VALUES.size();
		private static final Random RANDOM=new Random();
		
	}


