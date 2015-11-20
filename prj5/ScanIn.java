package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;


/**
 * Contains the main method and scans the input files
 * 
 * @author Joe Walker, Alexander Mundy, Kalila Simpson <jdub36, amundy14, kiki>
 * @version <14NOV2015>
 *
 */
public class ScanIn {

    LinkedList<Song> songList;
    LinkedList<Student> studentList;

    /**
     * Pulls in the data from the files
     * @param songListLocation The file location of the song list
     * @param studentListLocation The file location of the student list
     */
    public ScanIn(String songListLocation, String studentListLocation) {

        this.songList = scanSong(songListLocation);
        this.studentList = scanStudent(studentListLocation);

    }

    /**
     * scans through the input file, making a LinkeList
     * 
     * @param fileName The location of the file
     * @return LinkedList to be given to the new window
     */
    private LinkedList<Song> scanSong(String fileName) {

        Scanner file = null;
        try {
            file = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        LinkedList<Song> songList = new LinkedList<Song>();

        Song currentSong = null;
        while (file.hasNextLine()) {
            file.nextLine();
            String[] str = file.nextLine().split(",");
            currentSong = new Song(str[0], str[1], str[3],
                    Integer.parseInt(str[2]));

            songList.add(currentSong);
        }

        return songList;
    }

    /**
     * scans through the input file, making a queue
     * 
     * @param fileName The location of the file
     * @return LinkedList to be given to the new window
     */
    private LinkedList<Student> scanStudent(String fileName) {

        Scanner file = null;
        try {
            file = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        LinkedList<Student> studentList = new LinkedList<Student>();
        LinkedList<String> currentOpinions = new LinkedList<String>();
        Student currentStudent;

        while (file.hasNextLine()) {
            file.nextLine();
            currentOpinions.clear();
            String[] str = file.nextLine().split(",");
            if (str[2] != "" && str[3] != "" && str[4] != "") {

                for (int it = 5; it < str.length; it++) {
                    currentOpinions.add(str[it]);
                }
                currentStudent = new Student(str[4], str[2], str[3],
                        currentOpinions);
                studentList.add(currentStudent);
            }
        }
        return studentList;

    }

    /**
     * gets songList
     * 
     * @return list of songs
     */
    public LinkedList<Song> getSongList() {
        return songList;
    }

    /**
     * gets studentList
     * 
     * @return list of students
     */
    public LinkedList<Student> getStudentList() {
        return studentList;
    }
}
