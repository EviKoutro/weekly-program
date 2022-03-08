

package texnhth12;
import java.io.*;

import java.util.*;



public class readfiles {
	private static ArrayList<lessons> lessons;
	private static ArrayList<teachers>teachers;
	private int counter;
	
	public void readlessons() {
		
		File file1=null;
		BufferedReader reader1=null;
		String line1;
		
		try{
		 file1= new File("C:\\Users\\Åõç\\Desktop\\ergasiatexnhth\\lessons");
		}
		catch(NullPointerException e) {
			System.out.println("Can't open file");
		}
		
		try {
			reader1=new BufferedReader(new FileReader(file1));
		}
		catch(IOException e) {
			System.out.println("Can't read from file");
		}
		
		try {
			
			line1=reader1.readLine();
			while(line1!=null){
				counter++;
				StringTokenizer st=new StringTokenizer(line1," ");
				while (st.hasMoreTokens()){
					String Token=st.nextToken();
				}
		}
		}
		catch(IOException e) {
			System.out.println("Error reading the line: " +counter);
			}
		
		
	}
	
		
	

	public static ArrayList<lessons> getLessons() {
		return lessons;
	}




	public  void setLessons(ArrayList<lessons> lessons) {
		this.lessons = lessons;
	}




	public static ArrayList<teachers> getTeachers() {
		return teachers;
	}




	public  void setTeachers(ArrayList<teachers> teachers) {
		this.teachers = teachers;
	}




	public void readteachers() {
		File file2=null;
		BufferedReader reader2=null;
		String line2;
		
		try{
		 file2= new File("C:\\Users\\Åõç\\Desktop\\ergasiatexnhth\\lessons");
		}
		catch(NullPointerException e) {
			System.out.println("Can't open file");
		}
		
		try {
			reader2=new BufferedReader(new FileReader(file2));
		}
		catch(IOException e) {
			System.out.println("Can't read from file");
		}
		
try {
			
			line2=reader2.readLine();
			while(line2!=null){
				counter++;
		}
		}
		catch(IOException e) {
			System.out.println("Error reading the line: "+counter);
			}
		
	}
	
}
