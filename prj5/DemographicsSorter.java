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

    private LinkedList<Student> list;

    // integer opinion arrays
    private int[] readOpinions;
    private int[] sportsOpinions;
    private int[] artOpinions;
    private int[] musicOpinions;

    private int[] csOpinions;
    private int[] otherEngOpinions;
    private int[] mathOpinions;
    private int[] otherOpinions;
    
    private int[] northOpinions;
    private int[] southOpinions;
    private int[] restOpinions;
    private int[] outsideOpinions;
    
    
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
     * Sorts through each student in LinkedList parameter using an iterator
     * checks which major the student has and makes updates in the opinion
     * arrays accordingly using opinionsSorter()
     * 
     * @return a matrix that contains 4 integer arrays (csOpinions,
     *         otherEngOpinions, mathOpinions, otherOpinions)
     */
    public int[][] sortByMajor() {
        Iterator<Student> iter = list.iterator();
        Student currentStudent = list.getFirst();

        int arraySize = currentStudent.getOpinions().size();
        csOpinions = new int[arraySize + (arraySize / 2)];
        otherEngOpinions = new int[arraySize + (arraySize / 2)];
        mathOpinions = new int[arraySize + (arraySize / 2)];
        otherOpinions = new int[arraySize + (arraySize / 2)];
        // has 3 indexes for each song (an int for heard, valid student, and
        // liked)
        // from those values the two percentages for each song will be
        // calculated

        
        while (iter.hasNext()) {
            currentStudent = iter.next();
            if (currentStudent.getMajor() == "Computer Science") {
                csOpinions = opinionsSort(currentStudent.getOpinions(),
                        csOpinions);
            }
            else if (currentStudent.getMajor() == "Other Engineering") {
                otherEngOpinions = opinionsSort(currentStudent.getOpinions(),
                        otherEngOpinions);

            }
            else if (currentStudent.getMajor() == "Math or CMDA") {
                mathOpinions = opinionsSort(currentStudent.getOpinions(),
                        mathOpinions);

            }
            else { // Other
                otherOpinions = opinionsSort(currentStudent.getOpinions(),
                        otherOpinions);
            }
        }
        int[][] fullArray = { csOpinions, otherEngOpinions, mathOpinions,
                otherOpinions };
        return fullArray;
    }
    
    
    /**
     * Sorts through each student in LinkedList parameter using an iterator
     * checks which region the student has and makes updates in the opinion
     * arrays accordingly using opinionsSorter()
     * 
     * @return a matrix that contains 4 integer arrays (northOpinions,
     *         southOpinions, restOpinions, outsideOpinions)
     */
    public int[][] sortByRegion() {
        Iterator<Student> iter = list.iterator();
        Student currentStudent = list.getFirst();

        int arraySize = currentStudent.getOpinions().size();
        northOpinions = new int[arraySize + (arraySize / 2)];
        southOpinions = new int[arraySize + (arraySize / 2)];
        restOpinions = new int[arraySize + (arraySize / 2)];
        outsideOpinions = new int[arraySize + (arraySize / 2)];
        // has 3 indexes for each song (an int for heard, valid student, and
        // liked)
        // from those values the two percentages for each song will be
        // calculated

        
        while (iter.hasNext()) {
            currentStudent = iter.next();
            if (currentStudent.getRegion() == "Northeast US") {
                northOpinions = opinionsSort(currentStudent.getOpinions(),
                        northOpinions);
            }
            else if (currentStudent.getRegion() == "Southeast US") {
                southOpinions = opinionsSort(currentStudent.getOpinions(),
                        southOpinions);

            }
            else if (currentStudent.getRegion() == "the rest of US") {
                restOpinions = opinionsSort(currentStudent.getOpinions(),
                        restOpinions);

            }
            else { // Other
                outsideOpinions = opinionsSort(currentStudent.getOpinions(),
                        outsideOpinions);
            }
        }
        int[][] fullArray = { csOpinions, otherEngOpinions, mathOpinions,
                otherOpinions };
        return fullArray;
    }

    /**
     * Helper method to sortByHobby, sortByRegion, sortByMajor opinionsSort
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
    
    /**
     * Updates the data on each song according to the opinion array passed in
     * @param songList The songList to be updated
     * @param opinions The opinions to be added in
     * @pre The songList MUST match the original order of the songs from the files
     */
    public void updateSongList(LinkedList<Song> songList, int[][] opinions){
        int counter = 0;
        for (Song song : songList) {
            song.setHeard1(song.getHeard1() + opinions[0][counter]);
            song.setLiked1(song.getLiked1() + opinions[0][counter + 1]);
            song.setHeard2(song.getHeard2() + opinions[1][counter]);
            song.setLiked2(song.getLiked2() + opinions[1][counter + 1]);
            song.setHeard3(song.getHeard3() + opinions[2][counter]);
            song.setLiked3(song.getLiked3() + opinions[2][counter + 1]);
            song.setHeard4(song.getHeard4() + opinions[3][counter]);
            song.setLiked4(song.getLiked4() + opinions[3][counter + 1]);
            counter += 2;
        }
        for (Song song : songList) {
            song.setHeard1((song.getHeard1() * 10) / songList.size());
            song.setLiked1((song.getLiked1() * 10) / songList.size());
            song.setHeard2((song.getHeard2() * 10) / songList.size());
            song.setLiked2((song.getLiked2() * 10) / songList.size());
            song.setHeard3((song.getHeard3() * 10) / songList.size());
            song.setLiked3((song.getLiked3() * 10) / songList.size());
            song.setHeard4((song.getHeard4() * 10) / songList.size());
            song.setLiked4((song.getLiked4() * 10) / songList.size());
            counter += 2;
        }
    }

}
