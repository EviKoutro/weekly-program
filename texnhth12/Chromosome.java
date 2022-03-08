package timetable;

import java.util.ArrayList;
import java.util.Random;

public class Chromosome {
	private Lessons [][] genes;
	private int fitness;
	
	public Chromosome() {
		this.genes = new Lessons [7][5] ;
		Random RANDOM = new Random();
		for(int i=0;i<7;i++) {
			for(int j=0;j<5;j++){
				this.genes[i][j] = lessons.get(RANDOM.nextInt(SIZE));
			}
		}
	}
	
	public Chromosome(Lecture [] lectures) {
		this.lectures = new Lecture[315];
		for(int i=0;i<lectures.length;i++) {
			this.lectures[i] = lectures[i];
		}	
	}

	public Lecture[] getLectures() {
		return lectures;
	}

	public void setLectures(Lecture[] lectures) {
		for(int i=0;i<lectures.length;i++) {
			this.lectures[i] = lectures[i];
		}
	}

	public int getFitness() {
		return fitness;
	}

	public void setFitness(int fitness) {
		this.fitness = fitness;
	}
	
	public boolean findNulls(Lecture[] lectures) {
		for(int i=0;i<lectures.length;i++) {
			if(lectures[i].getLesson().equals(null)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean distributedHours(ArrayList<Lessons> lessons) {
		int counter=0
		for(int i=0;i<lectures.length;i++) {
			if(lecture[i]
		}
	}
	
	
	
	
	
	

}
