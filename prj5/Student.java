package prj5;
import java.util.LinkedList;

/**
 * The Student class.
 * 
 * It holds all the information on the students, (hobby, major, region, and opinions).
 * 
 * @author Kalila Simpson, Joe Walker, and Alex Mundy
 * @version 11.15.2015
 */
public class Student {
	/**
	 * The Strings that will hold the hobby, major, and region
	 * of a specific student
	 */
	private String hobby, major, region;
	/**
	 * A LinkedList that will hold all the opinions a student has
	 */
	private LinkedList<String> opins;
	
	/**
	 * The constructor for all Students
	 * 
	 * @param hobby The student's hobby
	 * @param major The student's major
	 * @param region The region the student is from
	 */
	@SuppressWarnings("unchecked")
	public Student(String hobby, String major, String region, LinkedList opinions) {
		this.hobby = hobby;
		this.major = major;
		this.region = region;
		opins = opinions;
	}
	
	/**
	 * Getter class for the hobby variable
	 * 
	 * @return hobby The student's hobby
	 */
	public String getHobby() {
		return hobby;
	}
	
	/**
	 * Getter class for the major variable
	 * 
	 * @return major The student's major
	 */
	public String getMajor() {
		return major;
	}
	
	/**
	 * Getter class for the region variable
	 * 
	 * @return region The region the student is from
	 */
	public String getRegion() {
		return region;
	}
	
	/**
	 * Getter class for the opins variable
	 * 
	 * @return opins The student's opinions on all the songs
	 */
	public LinkedList<String> getOpinions() {
		return opins;
	}
}
 
