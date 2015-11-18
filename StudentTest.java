import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

/**
 * Tests all the methods in the student class.
 * 
 * @author Kalila Simpson, Joe Walker, and Alex Mundy
 * @version 11.15.2015
 */
public class StudentTest {
	/**
	 * The student that will be used in testing
	 */
	private Student bob;
	/**
	 * A LinkedList of bob's opinions
	 */
	private LinkedList<String> opinions;
	
	/**
	 * Sets everything up for each test
	 */
	public void setUp() {
		//setUp opinions
		
		bob = new Student("art", "CS", "North", opinions);
	}
	
	/**
	 * Tests the getHobby method
	 */
	public void testGetHobby() {
		assertEquals("art", bob.getHobby());
	}
	
	/**
	 * Tests the getMajor method
	 */
	public void testGetMajor() {
		assertEquals("CS", bob.getMajor());
	}
	
	/**
	 * Tests the getRegion method
	 */
	public void testGetRegion() {
		assertEquals("North", bob.getRegion());
	}
	
	/**
	 * Tests the getOpinions method
	 */
	public void testGetOpinions() {
		assertEquals(opinions, bob.getOpinions());
	}

}
