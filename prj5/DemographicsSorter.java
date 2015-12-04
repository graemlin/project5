package prj5;

import java.util.ArrayList;
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
    private ArrayList<Integer> demographic1;
    private ArrayList<Integer> demographic2;
    private ArrayList<Integer> demographic3;
    private ArrayList<Integer> demographic4;

    /**
     * Constructor for the class
     * 
     * @param list
     *            The list of students
     */
    public DemographicsSorter(LinkedList<Student> list) {
        this.list = list;
        demographic1 = new ArrayList<Integer>();
        demographic2 = new ArrayList<Integer>();
        demographic3 = new ArrayList<Integer>();
        demographic4 = new ArrayList<Integer>();
    }

    /**
     * Sorts through each student in LinkedList parameter using an iterator
     * checks which hobbie the student has and makes updates in the opinion
     * arrays accordingly using opinionsSorter()
     * 
     * @return a matrix that contains 4 integer arrays (readOpinions,
     *         sportsOpinions, artOpinions, musicOpinions)
     */
    public ArrayList<ArrayList<Integer>> sortByHobby() {
        Iterator<Student> iter = list.iterator();
        Student currentStudent = list.getFirst();
        demographic1.clear();
        demographic2.clear();
        demographic3.clear();
        demographic4.clear();
        int arraySize = list.get(0).getOpinions().size() * 2;
        for (int i = 0; i < arraySize; i++) {
            demographic1.add(i, 0);
            demographic2.add(i, 0);
            demographic3.add(i, 0);
            demographic4.add(i, 0);
        }
        // has 3 indexes for each song (an int for heard, valid student, and
        // liked)
        // from those values the two percentages for each song will be
        // calculated

        while (iter.hasNext()) {
            currentStudent = iter.next();
            if (currentStudent.getHobby().equals("reading")) {
                opinionsSort(currentStudent.getOpinions(), demographic1);
            }
            else if (currentStudent.getHobby().equals("sports")) {
                opinionsSort(currentStudent.getOpinions(), demographic2);

            }
            else if (currentStudent.getHobby().equals("art")) {
                opinionsSort(currentStudent.getOpinions(), demographic3);

            }
            else { // music
                opinionsSort(currentStudent.getOpinions(), demographic4);
            }
        }
        ArrayList<ArrayList<Integer>> fullArray =
                new ArrayList<ArrayList<Integer>>();
        fullArray.add(0, demographic1);
        fullArray.add(1, demographic2);
        fullArray.add(2, demographic3);
        fullArray.add(3, demographic4);
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
    public ArrayList<ArrayList<Integer>> sortByMajor() {
        Iterator<Student> iter = list.iterator();
        Student currentStudent = list.getFirst();
        demographic1.clear();
        demographic2.clear();
        demographic3.clear();
        demographic4.clear();
        int arraySize = list.get(0).getOpinions().size() * 2;
        for (int i = 0; i < arraySize; i++) {
            demographic1.add(i, 0);
            demographic2.add(i, 0);
            demographic3.add(i, 0);
            demographic4.add(i, 0);
        }
        // has 3 indexes for each song (an int for heard, valid student, and
        // liked)
        // from those values the two percentages for each song will be
        // calculated

        while (iter.hasNext()) {
            currentStudent = iter.next();
            if (currentStudent.getMajor().equals("Computer Science")) {
                opinionsSort(currentStudent.getOpinions(), demographic1);
            }
            else if (currentStudent.getMajor().equals("Other Engineering")) {
                opinionsSort(currentStudent.getOpinions(), demographic2);

            }
            else if (currentStudent.getMajor().equals("Math or CMDA")) {
                opinionsSort(currentStudent.getOpinions(), demographic3);

            }
            else { // Other
                opinionsSort(currentStudent.getOpinions(), demographic4);
            }
        }
        ArrayList<ArrayList<Integer>> fullArray =
                new ArrayList<ArrayList<Integer>>();
        fullArray.add(0, demographic1);
        fullArray.add(1, demographic2);
        fullArray.add(2, demographic3);
        fullArray.add(3, demographic4);
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
    public ArrayList<ArrayList<Integer>> sortByRegion() {
        Iterator<Student> iter = list.iterator();
        Student currentStudent = list.getFirst();
        demographic1.clear();
        demographic2.clear();
        demographic3.clear();
        demographic4.clear();
        int arraySize = list.get(0).getOpinions().size() * 2;
        for (int i = 0; i < arraySize; i++) {
            demographic1.add(i, 0);
            demographic2.add(i, 0);
            demographic3.add(i, 0);
            demographic4.add(i, 0);
        }
        // has 3 indexes for each song (an int for heard, valid student, and
        // liked)
        // from those values the two percentages for each song will be
        // calculated

        while (iter.hasNext()) {
            currentStudent = iter.next();
            if (currentStudent.getRegion().equals("Northeast US")) {
                opinionsSort(currentStudent.getOpinions(), demographic1);
            }
            else if (currentStudent.getRegion().equals("Southeast US")) {
                opinionsSort(currentStudent.getOpinions(), demographic2);

            }
            else if (currentStudent.getRegion().equals("the rest of US")) {
                opinionsSort(currentStudent.getOpinions(), demographic3);

            }
            else { // Other
                opinionsSort(currentStudent.getOpinions(), demographic4);
            }
        }
        ArrayList<ArrayList<Integer>> fullArray =
                new ArrayList<ArrayList<Integer>>();
        fullArray.add(0, demographic1);
        fullArray.add(1, demographic2);
        fullArray.add(2, demographic3);
        fullArray.add(3, demographic4);
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
    private ArrayList<Integer> opinionsSort(LinkedList<String> opinions,
            ArrayList<Integer> array) {
        int j = 0;
        for (int i = 0; i < opinions.size(); i = i + 2) {
            if (opinions.get(i).equals("Yes")) {
                array.set(j, array.get(j) + 1); // heard++
                array.set(j + 1, array.get(j + 1) + 1); // valid student++

                if (opinions.get(i + 1).equals("Yes")) {
                    array.set(j + 2, array.get(j + 2) + 1); // liked++
                }
            }
            else if (opinions.get(i).equals("No")) {
                array.set(j + 1, array.get(j + 1) + 1); // valid student++
            }
            j = j + 3;
        }
        // System.out.println("break");
        return array;

    }

    /**
     * Updates the data on each song according to the opinion array passed in
     * 
     * @param songList
     *            The songList to be updated
     * @param opinions
     *            The opinions to be added in
     * @pre The songList MUST match the original order of the songs from the
     *      files
     */
    public void updateSongList(LinkedList<Song> songList,
            ArrayList<ArrayList<Integer>> opinions) {

        for (int it = 0; it < songList.size(); it++) {

            songList.get(it)
                    .setHeard1((int) (((double) opinions.get(0).get(it * 3))
                            / ((double) opinions.get(0).get(it * 3 + 1))
                            * 100));
            songList.get(it).setLiked1(
                    (int) (((double) opinions.get(0).get(it * 3 + 3))
                            / ((double) opinions.get(0).get(it * 3)) * 100));
            songList.get(it / 3)
                    .setHeard2((int) (((double) opinions.get(1).get(it))
                            / ((double) opinions.get(1).get(it + 1)) * 100));
            songList.get(it / 3)
                    .setLiked2((int) (((double) opinions.get(1).get(it + 3))
                            / ((double) opinions.get(1).get(it)) * 100));
            songList.get(it / 3)
                    .setHeard3((int) (((double) opinions.get(2).get(it))
                            / ((double) opinions.get(2).get(it + 1)) * 100));
            songList.get(it / 3)
                    .setLiked3((int) (((double) opinions.get(2).get(it + 3))
                            / ((double) opinions.get(2).get(it)) * 100));
            songList.get(it / 3)
                    .setHeard4((int) (((double) opinions.get(3).get(it))
                            / ((double) opinions.get(3).get(it + 1)) * 100));
            songList.get(it / 3)
                    .setLiked4((int) (((double) opinions.get(3).get(it + 3))
                            / ((double) opinions.get(3).get(it)) * 100));
        }
    }

}