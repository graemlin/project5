package prj5;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Sorts the opinions by demographic
 * 
 * @author Alexander Mundy, Kalila Simpson, Joe Walker <amundy14, kiki, jdub36>
 * @version <20NOV2015>
 *
 */

public class DemographicsSorter {
    /**
     * The list of students
     */
    private LinkedList<Student> list;
    /**
     * The integer opinion array based on those who like to read
     */
    private int[] readOpinions;
    /**
     * The integer opinion array based on those who like sports
     */
    private int[] sportsOpinions;
    /**
     * The integer opinion array based on those who like art
     */
    private int[] artOpinions;
    /**
     * The integer opinion array based on those who like music
     */
    private int[] musicOpinions;

    /**
     * Constructor for the class
     * 
     * @param list
     *            The list of students
     */
    public DemographicsSorter(LinkedList<Student> list) {
        this.list = list;
    }

    /**
     * Sorts through each student in LinkedList parameter using an iterator
     * checks which hobbie the student has and makes updates in the opinion
     * arrays accordingly using opinionsSorter()
     * 
     * @return a matrix that contains 4 integer arrays (readOpinions,
     *         sportsOpinions, artOpinions, musicOpinions)
     */
    public int[][] sortByHobby() {
        Iterator<Student> iter = list.iterator();
        Student currentStudent = list.getFirst();

        int arraySize = currentStudent.getOpinions().size();
        readOpinions = new int[arraySize + (arraySize / 2)];
        sportsOpinions = new int[arraySize + (arraySize / 2)];
        artOpinions = new int[arraySize + (arraySize / 2)];
        musicOpinions = new int[arraySize + (arraySize / 2)];
        // has 3 indexes for each song (an int for heard, valid student, and
        // liked)
        // from those values the two percentages for each song will be
        // calculated

        while (iter.hasNext()) {
            currentStudent = iter.next();
            if (currentStudent.getHobby() == "read") {
                readOpinions = opinionsSort(currentStudent.getOpinions(),
                        readOpinions);
            }
            else if (currentStudent.getHobby() == "sports") {
                sportsOpinions = opinionsSort(currentStudent.getOpinions(),
                        sportsOpinions);

            }
            else if (currentStudent.getHobby() == "art") {
                artOpinions = opinionsSort(currentStudent.getOpinions(),
                        artOpinions);

            }
            else { // music
                musicOpinions = opinionsSort(currentStudent.getOpinions(),
                        musicOpinions);
            }
        }
        int[][] fullArray = { readOpinions, sportsOpinions, artOpinions,
                musicOpinions };
        return fullArray;
    }

    /**
     * Helper method to sortByHobbie, sortByRedion, sortByMajor opinionsSort
     * updates the integer opinion arrays for each student
     * 
     * @param opinions
     *            an individual student's opinions
     * @param array
     *            the correct opinion array for the particular students hobbie
     * @return and updated version if the given integer opinion array
     */
    private int[] opinionsSort(LinkedList<String> opinions, int[] array) {
        int j = 0;
        for (int i = 0; i < opinions.size(); i = i + 2) {
            if (opinions.get(i) == "yes") {
                array[j]++; // heard++
                array[j + 1]++; // valid student++

                if (opinions.get(i + 1) == "yes") {
                    array[j + 2]++; // liked++
                }
            }
            else if (opinions.get(i) == "no") {
                array[j + 1]++; // valid student++
            }
            j = j + 3;
        }
        return array;

    }

}
