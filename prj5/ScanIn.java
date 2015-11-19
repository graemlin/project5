package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

import CS2114.Window;

/**
 * Contains the main method and scans the input files
 * 
 * @author <Joe Walker>
 * @version <2015.11.14>
 *
 */
public class ScanIn {

	LinkedList<Song> songList;
	LinkedList<Student> studentList;

	/**
	 * creates a new Window
	 * 
	 * @param fileName
	 */
	public ScanIn(String songList, String studentList) {

		this.songList = scanSong(songList);
		this.studentList = scanStudent(studentList);

	}

	/**
	 * scans through the input file, making a LinkeList
	 * 
	 * @param fileName
	 * @return LinkedList to be given to the new window
	 */
	private LinkedList<Song> scanSong(String fileName) {

		Scanner file = null;
		try {
			file = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LinkedList<Song> songList = new LinkedList<Song>();

		int counter = 1;
		Song currentSong = null;
		while (file.hasNextLine()) {
			file.nextLine();
			String[] str = file.nextLine().split(",");
			currentSong = new Song(str[0], str[1], Integer.parseInt(str[2]), str[3]);

			songList.add(currentSong);
		}

		return songList;
	}

	/**
	 * scans through the input file, making a queue
	 * 
	 * @param fileName
	 * @return LinkedList to be given to the new window
	 */
	private LinkedList<Student> scanStudent(String fileName) {

		Scanner file = null;
		try {
			file = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LinkedList<Student> studentList = new LinkedList<Song>();
		LinkedList<String> currentOpinions = new LinkedList<String>();
		Student currentStudent;

		while (file.hasNextLine()) {
			file.nextLine();
			currentOpinions.clear();
			
			if (str[2] != "" && str[3] != "" && str[4] != "") {

				currentStudent = new Student();
				String[] str = file.nextLine().split(",");
				currentStudent.setMajor(str[2]);
				currentStudent.setRegion(str[3]);
				currentStudent.setHobbie(str[4]);

				for (int it = 5; it < str.length; it++) {
					currentOpinions.add(str[it]);
				}
				currentStudent.setOpinions(currentOpinions);
				studentList.add(currentStudent);
			}
		}
	}
		
	/**
	 * gets songList
	 * @return list of songs
	 */
	public LinkedList<Song> getSongList() {
		return songList;
	}
	
	/**
	 * gets studentList
	 * @return list of students
	 */
	public LinkedList<Student> getStudentList() {
		return studentList;
	}
}
